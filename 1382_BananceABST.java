class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> list){
        if(root==null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    public TreeNode constructTree(ArrayList<Integer> list, int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(list.get(mid));
        inorder(root, list);
        root.left = constructTree(list, lo, mid-1);
        root.right = constructTree(list, mid+1, hi);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return constructTree(list, 0, list.size()-1);
    }
}
