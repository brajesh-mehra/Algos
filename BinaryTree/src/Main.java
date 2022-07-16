public class Main {
    public static void main(String[] args)
    {
        System.out.println("Binary Tree");

        BinaryTree bt = new BinaryTree();

        System.out.println("Pre order");
        bt.preOrder(bt.createBinaryTree());

        System.out.println("In order");
        bt.inOrder(bt.createBinaryTree());

        System.out.println("Post order");
        bt.postOrder(bt.createBinaryTree());
    }
}
