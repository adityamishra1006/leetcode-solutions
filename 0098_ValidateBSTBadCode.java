class Solution {
    public long max(TreeNode root){
        if(root==null) return Long.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public long min(TreeNode root){
        if(root==null) return Long.MAX_VALUE;
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.val<=max(root.left)) return false;
        if(root.val>=min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right); 
    }
}
