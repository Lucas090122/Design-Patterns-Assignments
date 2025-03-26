public abstract class OrgComponent {
    protected String name;

    public OrgComponent(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public abstract void printXML(String indent);

    public void add(OrgComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrgComponent component) {
        throw new UnsupportedOperationException();
    }
}
