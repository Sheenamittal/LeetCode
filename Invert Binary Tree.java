class Solution {

    private void invertTreeHelper(TreeNode root)
    {
       
         if (root == null) {
           return;
        }

 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null){
           invertTree(root.left);
        }
        if(root.right!=null){
          invertTree(root.right);
        }
    
        
    }

    public TreeNode invertTree(TreeNode root) {
        
            invertTreeHelper(root);

            return root;
    }
}
