public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void executeSort(int[] arr) {
        if (sortStrategy != null) {
            sortStrategy.sort(arr);
        } else {
            System.out.println("No sorting strategy set.");
        }
    }
}
