public class Director extends Employee{
    private Employee[] teammates;
    private int count;

    @Override
    public String toString() {
        String result = super.toString();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                result += teammates[i].toString();
            }
        }
        return result;
    }

    public Director(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Role.DIRECTOR);
        this.teammates = new Employee[10];
        this.count = 0;
    }
    public void add(Employee employee) {
        if (count == teammates.length) {
            Employee[] teamCopy = new Employee[teammates.length + 1];
            System.arraycopy(teammates, 0, teamCopy, 0, teammates.length);
            teammates = teamCopy;
        }
        teammates[count] = employee;
        count++;
    }

    public Employee[] getTeammates() {
        Employee[] copy = new Employee[count];
        System.arraycopy(teammates, 0, copy, 0, count);
        return copy;
    }

}
