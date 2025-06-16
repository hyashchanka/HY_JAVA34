public class EmployeeNew extends Employee{
    public EmployeeNew(String name, int timeOnPosition, Occupation occupation) {
        super(name, timeOnPosition, occupation);
    }

    public double salaryCounter(){
        double startSalary = getOccupation().getStartSalary() * 1.2;
        return startSalary * (1 + 0.1 * getTimeOnPosition());
    }


}
