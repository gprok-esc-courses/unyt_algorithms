package linked_list;

public class IntBubbleSort {
    public static void main(String[] args) {
        int [] values = {41, 82, 3, 45, 12, 26, 1};

        for(int i = 1; i < values.length; i++) {
            for(int j = 0; j < values.length - i; j++) {
                if(values[j] > values[j+1]) {
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }

        for(int v : values) {
            System.out.println(v);
        }
    }
}
