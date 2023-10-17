package Tree;

public class PreOrder {
    public  void preOrder(TreeNode root){
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
