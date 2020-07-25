package businessObjectFactoryBox;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class StaffDays {
    private BigInteger staffId;
    private List<Day> listDay;

    public StaffDays() {
        listDay = new LinkedList<>();
    }

    public BigInteger getStaffId() {
        return staffId;
    }

    public void setStaffId(BigInteger staffId) {
        this.staffId = staffId;
    }

    public List<Day> getListDay() {
        return listDay;
    }

    public void setListDay(List<Day> listDay) {
        List<Day> dayList = new LinkedList<>(listDay);
        this.listDay.clear();
        this.listDay.addAll(dayList);
        listDay.clear();
    }

    public void addDay(Day day) {
        this.listDay.add(day);
    }

    public void removeDate(Day day) {
        this.listDay.remove(day);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffDays staffDays = (StaffDays) o;
        return Objects.equals(staffId, staffDays.staffId) &&
                Objects.equals(listDay, staffDays.listDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, listDay);
    }
}
