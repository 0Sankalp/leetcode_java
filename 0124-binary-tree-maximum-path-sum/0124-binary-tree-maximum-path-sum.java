class Solution {
    int maxsum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxsum;
    }

    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, maxGain(node.left));
        int right = Math.max(0, maxGain(node.right));

        int currentPath = node.val + left + right;

        maxsum = Math.max(maxsum, currentPath);

        return node.val + Math.max(left, right);
    }
}