public class MainApp {
    public static void main(String[] args) {
        Employee worker1 = new Worker("John", "Smith", 5);
        Employee worker2 = new Worker("James", "Black", 3);
        Employee worker3 = new Worker("Jane", "White", 7);
        Director director1 = new Director("Alex", "Green", 10);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(director1);
        System.out.println();

        director1.add(worker1);
        director1.add(worker2);

        System.out.println(director1);

        Director director2 = new Director("Anna", "Gray", 8);
        director2.add(worker3);
        director1.add(director2);

        System.out.println(director1);
        System.out.println(EmployeeService.hasEmployee(director1, "Anna", "Gray"));
    }
}
