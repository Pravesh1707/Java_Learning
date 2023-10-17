package Tree;

public class BinaryTree {
    public static void main(String[] args) {
        
     TreeNode root = new TreeNode(4);
     TreeNode left = new TreeNode(2);
     TreeNode right = new TreeNode(8);
     root.left = left;
     root.right = right;
     print(root);

    }
    public static void print(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);

    }
    public TreeNode takeInput(){
        System.out.println("Enter root data : ");
        int rootdata = sc.nextInt();
        if(rootdata == -1){ 
            return null;
        }
        TreeNode root = new TreeNode(rootdata);
        root.left = takeInput();
        root.right = takeInput();
        return root;

    }
}
