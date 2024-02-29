package linked_list;

import com.github.javafaker.Faker;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Faker faker = new Faker();

        for(int i = 0; i < 10; i++) {
            list.insertBack(faker.name().fullName());
        }

        list.traverse();

        list.removeAll();
        System.out.println("REMOVED ALL");
        list.traverse();

    }
}
