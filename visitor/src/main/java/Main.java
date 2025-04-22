public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.add(new File("report.doc", 5));
        root.add(new File("data.csv", 12));

        Directory images = new Directory("images");
        images.add(new File("photo1.jpg", 3));
        images.add(new File("photo2.jpg", 4));

        root.add(images);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor = new SearchVisitor(".jpg");
        root.accept(searchVisitor);
        System.out.println("Matched files:");
        for (File f : searchVisitor.getMatchedFiles()) {
            System.out.println(" - " + f.getName());
        }
    }
}
