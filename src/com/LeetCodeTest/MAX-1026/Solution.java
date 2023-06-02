public class Solution {

    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public  TreeNode( TreeNode val==0, TreeNode root , TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }




        public int MaxAncestorDiff(TreeNode root) {
            return dothething (root,left.val, right.val);
        }
        private int dothething(TreeNode root, TreeNode left, TreeNode right){
            if(node == null)
                return max - min;
            min = Math.min(min, node.val);
            max = Math.max(max, node.val);
            return Math.max(dothething(node,left, min, max), dothething(node, right, max, min));

        }}


}
