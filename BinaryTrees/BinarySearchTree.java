package se.esmoa.BinaryTrees;

import jdk.nashorn.api.tree.Tree;

public class BinarySearchTree {

    // First we need to create a new instance of the TreeNode class and since we don't want that anyone change the value
    // of it, we making it private.
    private TreeNode root;


    /**
     * This method will add/insert a new node into the BinarySearchTree
     */
    public void insterting(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else {
            this.root.insert(data);
        }
    }

    /**
     * this method will find a node. For this propose, we gonna use Binary Search Tree.
     * In Binary Tree, if the next node is bigger then the parent, it will store in the right node of the parents
     * And if the next node is smaller than the parent node, it will be stored in the left node.
     */
    public TreeNode finding(Integer data) {
        if (root != null)
            return root.find(data);
        return null;
    }

    /**
     * This method is more complicated compare to other methods
     * first we need to find the data(node) we want to delete
     * <p>
     * There is three kind of nodes which we can delete:
     * - a child node (which doesn't have any child
     * - a parent node with just one child
     * - a parent node with two child
     * we need to deal with the links for parent and childes of the node which we want to delete
     */
    public void deleting(Integer data) {
        // we need the value of this vars
        TreeNode parent = this.root;
        TreeNode current = this.root;
        boolean isLeftChild = false;

        // check if the current is not null
        if (current == null) return;

        // then we check if current is not null...
        while (current != null && current.getData() != data) {
            // we need to change the parent to the current node
            parent = current;

            // and we need to check if the data we are looking for is bigger than current node, go to the rightChild...
            if (current.getData() < data) {
                current = current.getRightChild();
                isLeftChild = false;
            } else {
                current = current.getLeftChild();
                isLeftChild = true;
            }
        }

        // if the current node is a null, then we need to finish the method which means, we couldn't find the node (data)
        if (current == null) return;

        //---------- case one: if the current node doesn't have a children (leaf node)
        if (current.getRightChild() == null && current.getLeftChild() == null) {
            // check if the current node is the root node and doesn't have any child
            if (current == root) root = null;
                // otherwise we check if it's any other node (not root!), we need to check if it's the right or left-child
            else {
                if (isLeftChild) parent.setLeftChild(null);
                else parent.setRightChild(null);
            }
        }

        //---------- case two: if the current node does have just one child (leftChild or rightChile)
        // if has leftChild
        else if (current.getRightChild() == null) {
            if (current == root) root = current.getLeftChild();
            else if (isLeftChild) parent.setLeftChild(current.getLeftChild());
            else parent.setRightChild(current.getLeftChild());
        }
        // if has rightChild
        else if (current.getLeftChild() == null) {
            if (current == root) root = current.getRightChild();
            if (isLeftChild) parent.setRightChild(current.getRightChild());
            else parent.setRightChild(current.getLeftChild());
        }

        //---------- case three: if the current node does have two children (leftChild and rightChile)
        // TODO: implement this part
    }

    /**
     * this delete function is a fake delete function
     * since the previous delete is hard to implement
     */
    public void fakeDeleting(int data) {
        TreeNode toDelete = finding(data);
        toDelete.fakeDelete();
    }

}
