package businessObjectFactoryBox;

public enum Position {
    Director("director", 100),
    Accountant("accountant", 90),
    Worker("worker", 70),
    Manager("manager", 80);

    private String position;
    int bonus;

    Position(String position, int bonus) {
        this.position = position;
        this.bonus = bonus;
    }

    public String getPosition() {
        return position;
    }

    public int getBonus() {
        return bonus;
    }
}
