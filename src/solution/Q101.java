package solution;

import java.util.List;

public class Q101 {
	public boolean isSymmetric(TreeNode root) {
		if (root.left == null && root.right == null)
			return true;
		if (root == null)
			return true;
		return isSymLR(root.left, root.right);
	}

	public boolean isSymLR(TreeNode l, TreeNode r) {
		if (l == null && r == null) {
			return true;
		} else if (l == null || r == null) {
			return false;
		} else if (l.val != r.val) {
			return false;
		}else {
			return (isSymLR(l.right, r.left) && isSymLR(l.left, r.right));
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
