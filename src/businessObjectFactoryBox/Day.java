package businessObjectFactoryBox;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Objects;

public class Day {
    private BigInteger staffId;
    private LocalDate day;
    private String orderName;
    private BigInteger productivity;

    public Day() {
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public BigInteger getProductivity() {
        return productivity;
    }

    public void setProductivity(BigInteger productivity) {
        this.productivity = productivity;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BigInteger getStaffId() {
        return staffId;
    }

    public void setStaffId(BigInteger staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return staffId.toString() + day.toString() + orderName + productivity.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        return Objects.equals(staffId, day1.staffId) &&
                Objects.equals(day, day1.day) &&
                Objects.equals(orderName, day1.orderName) &&
                Objects.equals(productivity, day1.productivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, day, orderName, productivity);
    }
}
