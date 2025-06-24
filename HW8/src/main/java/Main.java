public class Main {
    public static void main(String[] args) {
        SalaryService service = new SalaryService();
        Employee employee1 = new Employee("Alex", 10, Occupation.ADMIN);
        Employee employee2 = new EmployeeNew("Alex", 10, Occupation.ADMIN);
        service.printSalary(employee2);

    }
}
