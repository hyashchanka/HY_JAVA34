public class Worker extends Employee {
    public Worker(String firstName, String lastName, int experience) {
        super(firstName, lastName, experience, Role.WORKER);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

