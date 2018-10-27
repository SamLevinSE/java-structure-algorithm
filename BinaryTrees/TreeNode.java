package se.esmoa.BinaryTrees;


public class TreeNode {
    // memember variables
    private int data;
    private TreeNode leftChild, rightChild;
    private boolean isDeleted = false;

    // Structure
    public TreeNode(Integer data) {
        this.data = data;
    }

    // Finding a node in the tree
    public TreeNode find(Integer data) {
        // if this data is equal to the searching data, then return it
        if (this.data == data && !isDeleted) return this;
        // this data (in the tree) is bigger then the searching data, we need to go to next smaller (at the left node) data
        // we do this recursively until we find the node (if there is such a data) or the nodes finish (node == null)
        if (this.data > data && leftChild != null) {
            this.leftChild.find(data);
        }
        // if the searching data is bigger than the current data (this.data), we need to search in the right side of
        // this.node. We search until we find the node or the node will be null.
        if (rightChild != null) {
            return rightChild.find(data);
        }
        return null;
    }

    // For inserting the data we use this method
    public void insert(Integer data) {
        if (this.data <= data) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }
        }
    }

    /**
     * this is a simplest delete method
     * basically it will turn off the node, it wont delete it
     */
    public void fakeDelete() {
        this.isDeleted = true;
    }

    // this function is for getting the value of isDeleted variable
    public boolean getIsDeleted() {
        return isDeleted;
    }

    // a method for soft-deleting
    // getting the data. We don't need a setter method for the data! We use the constructor for this propose.
    public Integer getData() {
        return data;
    }

    // getting and setting the left child
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    // getting and setting the right child
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }
}
