package biznesObjectFactoryBox;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class Staff {
    private String pathPhoto;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private BigInteger id;
    private String address;
    private String department;
    private Position position;
    private BigDecimal salary;

    public Staff() {
    }

    public Staff(Position positions) {
        this.position = positions;
    }

    public Staff(String firstName, String lastName, String dateOfBirth,
                 String id, String department, Position position, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.id = new BigInteger(id);
        this.department = department;
        this.position = position;
        this.salary = new BigDecimal(salary);
    }

    public Integer getBonus() {
        switch (position.getPosition()) {
            case "accountant": {
                return Position.Accountant.getBonus();
            }
            case "director": {
                return Position.Director.getBonus();
            }
            case "worker": {
                return Position.Manager.getBonus();
            }
            case "manager": {
                return Position.Worker.getBonus();
            }
        }
        return 0;
    }

    public String getPathPhoto() {
        return pathPhoto;
    }

    public void setPathPhoto(String pathPhoto) {
        this.pathPhoto = pathPhoto;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirthLocalDate() {
        return dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getId() {
        return id.toString();
    }

    public BigInteger getIdBigInteger() {
        return id;
    }

    public void setId(String id) {
        this.id = new BigInteger(id);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return this.position.getPosition();
    }

    public void setPosition(String position) {
        switch (position) {
            case "director": {
                this.position = Position.Director;
                break;
            }
            case "accountant": {
                this.position = Position.Accountant;
                break;
            }
            case "manager": {
                this.position = Position.Manager;
                break;
            }
            case "worker": {
                this.position = Position.Worker;
                break;
            }
        }
    }

    public String getSalary() {
        return this.salary.toString();
    }

    public void setSalary(String salary) {
        this.salary = new BigDecimal(salary);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "" + firstName + " " + lastName + ".\n" +
                "Date of birth\n"
                + dateOfBirth + ".\n" +
                "Address\n"
                + address + ".\n" +
                "Department\n"
                + department.toLowerCase() + ".\n" +
                "Position\n"
                + position.toString().toLowerCase() + ".\n" +
                "Salary\n"
                + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(firstName, staff.firstName) &&
                Objects.equals(lastName, staff.lastName) &&
                Objects.equals(dateOfBirth, staff.dateOfBirth) &&
                Objects.equals(id, staff.id) &&
                Objects.equals(address, staff.address) &&
                Objects.equals(department, staff.department) &&
                Objects.equals(position, staff.position) &&
                Objects.equals(salary, staff.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, id, address, department, position, salary);
    }
}
