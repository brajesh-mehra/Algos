public class BinaryTree {

    private Node binaryTree(int[] nodes){
        int ind = 0;
        if(nodes[ind] == -1 ) return;

        if(ind)
    }
    public static void main(String[] args) {
        System.out.println("Binary Search Tree Insersion");

        System.out.println("Binary Search Tree Insersion - PreOrder");
        int[] nodes = {1, 2, 3, -1, -1, 4, -1, -1, 5, 3, -1, 5, 7};

        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.binaryTree(nodes);

        System.out.println("First Root data = "+ root.data);
    }
}
