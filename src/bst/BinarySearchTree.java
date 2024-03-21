package bst;

import java.util.ArrayList;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        setRoot(null);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public TreeNode add(int value) {
        TreeNode node = new TreeNode(value);
        if(isEmpty()) {
            root = node;
        }
        else {
            TreeNode temp = root;
            boolean found = false;
            while(!found) {
                if(temp.getValue() > value) {
                    if(temp.getLeft() == null) {
                        temp.setLeft(node);
                        node.setParent(temp);
                        found = true;
                    }
                    else {
                        temp = temp.getLeft();
                    }
                }
                else {
                    if(temp.getRight() == null) {
                        temp.setRight(node);
                        node.setParent(temp);
                        found = true;
                    }
                    else {
                        temp = temp.getRight();
                    }
                }
            }
        }
        return node;
    }

    public TreeNode find(int value) {
        TreeNode temp = root;
        while(temp != null) {
            if(temp.getValue() == value) {
                break;
            }
            else {
                if(temp.getValue() > value) {
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
            }
        }
        return temp;
    }

    // EXERCISE: Can we use Recursion for remove?
    public void remove(int value) {
        TreeNode node = find(value);
        if(node != null) {
            // 1. Leaf
            if(node.getLeft() == null && node.getRight() == null) {
                if(node == root) {
                    root = null;
                }
                else if(node.getValue() < node.getParent().getValue()) {
                    node.getParent().setLeft(null);
                }
                else {
                    node.getParent().setRight(null);
                }
            }
            // 2. Single child
            else if(node.getLeft() != null && node.getRight() == null) {
                node.setValue(node.getLeft().getValue());
                TreeNode left = node.getLeft().getLeft();
                TreeNode right = node.getLeft().getRight();
                node.setLeft(left);
                node.setRight(right);
                if(node.getLeft() != null) {
                    node.getLeft().setParent(node);
                }
                if(node.getRight() != null) {
                    node.getRight().setParent(node);
                }
            }
            else if(node.getLeft() == null && node.getRight() != null) {
                node.setValue(node.getRight().getValue());
                TreeNode left = node.getRight().getLeft();
                TreeNode right = node.getRight().getRight();
                node.setLeft(left);
                node.setRight(right);
                if(node.getLeft() != null) {
                    node.getLeft().setParent(node);
                }
                if(node.getRight() != null) {
                    node.getRight().setParent(node);
                }
            }
            // 3. Two children
            else {
                TreeNode successor = getSuccessor(node);
                int nextValue = successor.getValue();
                remove(nextValue);
                node.setValue(nextValue);
            }

        }
    }

    public TreeNode getSuccessor(TreeNode node) {
        TreeNode temp = node.getRight();
        while(temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp;
    }

    public void preorderRecursive() {
        preorderRecursive(root);
    }

    public void preorderRecursive(TreeNode node) {
        if(node != null) {
            preorderRecursive(node.getLeft());
            System.out.println(node.getValue());
            preorderRecursive(node.getRight());
        }
    }

    public void preorder() {
        TreeNode temp = root;
        ArrayList<TreeNode> stack = new ArrayList<>();
        while(temp != null || stack.size() > 0) {
            if(temp != null) {
                stack.add(temp);
                temp = temp.getLeft();
            }
            else {
                temp = stack.remove(stack.size() - 1);
                System.out.println(temp.getValue());
                temp = temp.getRight();
            }
        }
    }

    // EXERCISE
    public void postorderRecursive() {

    }

    // EXERCISE
    public void postorder() {

    }

    // EXERCISE
    public void inorderRecursive() {

    }

    // EXERCISE
    public void inorder() {

    }

    // EXERCISE
    public TreeNode max() {
        return null;
    }

    // EXERCISE
    public TreeNode min() {
        return null;
    }

    // EXERCISE
    public int height() {
        return 0;
    }
}
