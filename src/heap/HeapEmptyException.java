package heap;

public class HeapEmptyException extends Exception {
    public HeapEmptyException() {
        super("Heap has no values.");
    }
}
