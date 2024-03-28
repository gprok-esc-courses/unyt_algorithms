package bst;

public class BSTTester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(150);
        bst.add(80);
        bst.add(230);
        bst.add(45);
        bst.add(12);
        bst.add(49);
        bst.add(160);
        bst.add(155);
        bst.add(170);
        bst.add(235);
        bst.add(246);
        bst.add(4);
        System.out.println("H: " + bst.height(bst.getRoot()));

        bst.remove(80);

        bst.preorder();
    }
}
