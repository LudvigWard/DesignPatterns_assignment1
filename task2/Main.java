package task2;

public class Main {
    public static void main(String[] args) {
        Employee lars = new Employee("lars", "warehouse", new Role("manager"));
        Employee gunilla = new Employee("gunilla", "research", new Role("engineer"));
        System.out.println("Employees:");
        System.out.println(lars);
        System.out.println(gunilla);

        gunilla.addRole(new Role("manager"));
        System.out.println("\nGunilla is now also the manager of her branch:");
        System.out.println(gunilla);

        gunilla.removeRole("engineer");
        System.out.println("\nGunilla is now full time manager:");
        System.out.println(gunilla);
    }
}
