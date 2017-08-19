public class TreeNode
{

TreeNode left;
TreeNode right;
int data;

public TreeNode(int data) {
this.data = data;
}


public TreeNode getLeft() {
return this.left;
}

public void setLeft(TreeNode left) {
this.left = left;
}

public TreeNode getRight() {
return this.right;
}

public void setRight(TreeNode right) {
this.right = right;
}

public void setData(int data) {
this.data = data;
}

public int getData() {
return this.data;
}

public void insert(int data) {

if(data >= this.data) {
	TreeNode newNode = new TreeNode(data);
	if (this.right == null) {
		this.right = newNode;
	}
	else
	{
		this.right.insert(data);
	}
	
}
else {
	TreeNode newNode = new TreeNode(data);
	if (this.left == null){
		this.left = newNode;
	}
	else
	{
		this.left.insert(data);

	}

}
}

public TreeNode find(int data) {

if (this.data == data) {
return this;
}

else if(this.data < data && right!= null ) {
return right.find(data);
}

else if(this.data > data && left!= null) {
return left.find(data);
}

return null;
}


@Override
public String toString() {
return "Data is: " + this.data;
}

public void inorder () {

if (this != null){

if (this.left != null)
this.left.inorder();
System.out.println("Printing Node data " + this.data);
if(this.right != null)
this.right.inorder();
}

}

public int findMin() {

if (this == null)
return -1;

if (this.left == null && this.right == null) 
return this.data;

if (this.left != null) 
return this.left.findMin();

if (this.left == null) 
return this.data;

return -1;

}
}
