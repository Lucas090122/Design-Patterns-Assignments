public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        // Do nothing for directory itself
    }

    public int getTotalSize() {
        return totalSize;
    }
}
