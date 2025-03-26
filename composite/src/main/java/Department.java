import java.util.ArrayList;
import java.util.List;

public class Department extends OrgComponent {
    private List<OrgComponent> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrgComponent child : children) {
            total += child.getSalary();
        }
        return total;
    }

    @Override
    public void printXML(String indent) {
        System.out.println(indent + "<department name=\"" + name + "\">");
        for (OrgComponent child : children) {
            child.printXML(indent + "    ");
        }
        System.out.println(indent + "</department>");
    }

    @Override
    public void add(OrgComponent component) {
        children.add(component);
    }

    @Override
    public void remove(OrgComponent component) {
        children.remove(component);
    }
}
