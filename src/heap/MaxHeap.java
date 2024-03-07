package heap;

import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        int pos = heap.size() - 1;
        heapifyUp(pos);
    }

    public int remove() throws HeapEmptyException {
        if(heap.size() == 0) {
            throw new HeapEmptyException();
        }
        int max = heap.get(0);
        heapifyDown(0);
        return max;
    }

    public void heapifyDown(Integer pos) {
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        while(pos != null) {
            Integer maxChild = getMaxChildPos(pos);
            if(maxChild != null) {
                if(heap.get(pos) < heap.get(maxChild)) {
                    int temp = heap.get(pos);
                    heap.set(pos, heap.get(maxChild));
                    heap.set(maxChild, temp);
                }
                else {
                    break;
                }
            }
            pos = maxChild;
        }
    }

    public void heapifyUp(int pos) {
        while(pos > 0) {
            int parent = getParentPos(pos);
            if(heap.get(parent) < heap.get(pos)) {
                int temp = heap.get(parent);
                heap.set(parent, heap.get(pos));
                heap.set(pos, temp);
                pos = parent;
            }
            else {
                break;
            }
        }
    }

    public int getParentPos(int pos) {
        return (pos - 1) / 2;
    }


    public Integer getMaxChildPos(int pos) {
        Integer left = getLeftChildPos(pos);
        Integer right = getRightChildPos(pos);
        if(left == null) {
            return null;
        }
        else if(right == null) {
            return left;
        }
        else {
            if(heap.get(left) > heap.get(right)) {
                return left;
            }
            else {
                return right;
            }
        }
    }

    public Integer getLeftChildPos(int pos) {
        int left = pos * 2 + 1;
        if(left >= heap.size()) {
            return null;
        }
        else {
            return left;
        }
    }

    public Integer getRightChildPos(int pos) {
        int right = pos * 2 + 2;
        if(right >= heap.size()) {
            return null;
        }
        else {
            return right;
        }
    }

    public void display() {
        for(int v : heap) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
