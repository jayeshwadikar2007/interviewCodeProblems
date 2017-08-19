public class BinarySearchTree {

private TreeNode root;

public void insert(int data) {

if (root == null) {
this.root = new TreeNode(data);
}
else {
this.root.insert(data);

}


}

public TreeNode find(int data) {

if (root != null) {
	return root.find(data);
}
	return null;
}

public void print () {

if (root != null) {
	root.inorder();
}
}

public int findMin() {

if (root != null)
return root.findMin();
else
return -1;

}


public boolean sameTree(TreeNode root1, TreeNode root2){

if (root1 == null && root2 == null)
 return true;

if (root1 != null && root2 != null )
{
  return (root1.getData() == root2.getData() && this.sameTree(root1.left,root2.left) && this.sameTree(root1.right,root2.right));  

}

return false;

}

}
