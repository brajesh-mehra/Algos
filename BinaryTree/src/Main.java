public class Main {
    public static void main(String[] args)
    {
        System.out.println("Binary Tree");

        BinaryTree bt = new BinaryTree();
        bt.preOrder(bt.createBinaryTree());
    }
}
