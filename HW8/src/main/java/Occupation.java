public enum Occupation {
    ADMIN(500), TRAINEE(200);
    private int startSalary;

    Occupation(int startSalary) {
        this.startSalary = startSalary;
    }

    public int getStartSalary() {
        return startSalary;
    }
}
