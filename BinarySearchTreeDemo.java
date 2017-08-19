public class BinarySearchTreeDemo {

public static void main(String args[]) {

BinarySearchTree bts = new BinarySearchTree();

bts.insert(25);
bts.insert(10);
bts.insert(50);

TreeNode findNode = bts.find(10);

if (findNode != null) {

System.out.println ("Key found in Tree");

}
else {

System.out.println("Key not found in Tree");

}

bts.print();

int result = bts.findMin();

if (result == -1) {

System.out.println("No Minimum found in BST");

}else {
System.out.println("Min element in Tree is "+ result);
}
}

}

