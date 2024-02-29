package linked_list;

import java.util.LinkedList;

public class ListOfNames {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Mike");
        names.add("Ann");

        for(String name : names) {
            System.out.println(name);
        }
    }
}
