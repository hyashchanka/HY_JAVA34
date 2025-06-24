public class EmployeeService {
    public static boolean hasEmployee(Director director, String firstName, String lastName) {
        if (director.getFirstName().equals(firstName) && director.getLastName().equals(lastName)) {
            return true;
        }
        Employee[] teammates = director.getTeammates();
        for (Employee person : teammates) {
            if (person.getRole() == Role.WORKER) {
                if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                    return true;
                }
            }
            else if (person.getRole() == Role.DIRECTOR) {
                if (hasEmployee((Director) person, firstName, lastName)) {
                    return true;
                }
            }
        }

        return false;
    }
}



