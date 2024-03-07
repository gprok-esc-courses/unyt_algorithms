package heap;

public class TestHeap {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();

        try {
            heap.insert(4);
            heap.insert(28);
            heap.insert(44);
            heap.insert(3);
            heap.insert(21);
            heap.insert(17);
            heap.insert(50);

            heap.display();
            int max = heap.remove();
            System.out.println("MAX: " + max);
            heap.remove();
            heap.display();
        } catch (HeapEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
