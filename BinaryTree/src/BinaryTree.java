import java.util.LinkedList;
import java.util.Queue;

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

    // create binary tree
    public TreeNode createBinaryTree2()
    {
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(6);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(2);
        TreeNode six = new TreeNode(4);

        TreeNode seven = new TreeNode(1);
        TreeNode eight = new TreeNode(5);
        TreeNode nine = new TreeNode(6);
        TreeNode ten = new TreeNode(9);
        TreeNode eleven = new TreeNode(8);


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

    // In Order
    public void inOrder(TreeNode root){
        if(root == null) return;

        preOrder(root.left);
        System.out.println(root.data + " ");
        preOrder(root.right);
    }

    // Post Prder
    public void postOrder(TreeNode root){
        if(root == null) return;

        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data + " ");
    }

    // Level Order Traversal
    public void levelOrderTraversal(TreeNode root){
        if(root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty())
        {
            TreeNode temp = q.poll();
            System.out.println(temp.data + " ");
            if(temp.left != null)
            {
                q.offer(temp.left);
            }
            if (temp.right != null)
            {
                q.offer(temp.right);
            }
        }
    }
}
