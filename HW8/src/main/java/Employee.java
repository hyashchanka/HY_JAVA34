
public class Employee {
    private String name;
    private int timeOnPosition;
    private Occupation occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeOnPosition() {
        return timeOnPosition;
    }

    public void setTimeOnPosition(int timeOnPosition) {
        this.timeOnPosition = timeOnPosition;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
    public Employee(){

    }

    public Employee(String name, int timeOnPosition, Occupation occupation) {
        this.name = name;
        this.timeOnPosition = timeOnPosition;
        this.occupation = occupation;
    }

    public double salaryCounter(){
        double startSalary = occupation.getStartSalary();
        return startSalary * (1 + 0.1 * timeOnPosition);
    }
}
