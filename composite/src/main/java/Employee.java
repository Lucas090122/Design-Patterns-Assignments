public class Employee extends OrgComponent {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<employee name=\"" + name + "\" salary=\"" + salary + "\"/>");
    }
}
