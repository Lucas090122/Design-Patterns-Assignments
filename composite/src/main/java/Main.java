public class Main {
    public static void main(String[] args) {
        Department root = new Department("Head Office");

        Department devDept = new Department("Development");
        Department hrDept = new Department("Human Resources");

        Employee alice = new Employee("Alice", 5000);
        Employee bob = new Employee("Bob", 5500);
        Employee carol = new Employee("Carol", 4000);
        Employee dave = new Employee("Dave", 3500);

        devDept.add(alice);
        devDept.add(bob);

        hrDept.add(carol);

        root.add(devDept);
        root.add(hrDept);
        root.add(dave);

        System.out.println("== Organization Structure (XML) ==");
        root.printXML("");

        System.out.println("\n== Total Salary ==");
        System.out.println("$" + root.getSalary());

        root.remove(dave);
        root.remove(hrDept);

        System.out.println("Test remove() method:");
        System.out.println("\n== Organization Structure (XML) ==");
        root.printXML("");

        System.out.println("\n== Total Salary ==");
        System.out.println("$" + root.getSalary());
    }
}
