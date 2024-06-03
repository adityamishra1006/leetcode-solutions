class Solution {
    static int sum;
    public void reverseInorder(TreeNode root){
        if(root==null) return;
        reverseInorder(root.right);
        root.val += sum;
        sum = root.val;
        reverseInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        reverseInorder(root); 
        return root;
    }
}
