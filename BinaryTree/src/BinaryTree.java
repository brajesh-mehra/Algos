public class BinaryTree {

    private static TreeNode root;

    // create binary tree
    public TreeNode createBinaryTree()
    {
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(6);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(10);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;

        third.left = fifth;
        return root;
    }

    // Traverse the binary tree
    public void preOrder(TreeNode root){
        if(root == null) return;

        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
