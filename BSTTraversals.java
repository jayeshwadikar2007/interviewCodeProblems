class Node {

  int key;

  Node left, right;

  public Node (int item) {

    key = item;
    left = right = null;
  }
}

public class BSTTraversals {

  Node root;

  BSTTraversals() {
      root = null;
  }

  void postOrderTraversal(Node node) {

      if (node == null) {
        return;
      }

      postOrderTraversal(node.left);
      postOrderTraversal(node.right);

      System.out.println(node.key + " ");

  }

 void preOrderTraversal(Node node) {

    if (node == null) {
      return;
    }

    System.out.println(node.key + " ");

    preOrderTraversal(node.left);
    preOrderTraversal(node.right);

 }

 void inOrderTraversal(Node node) {

   if (node == null) {
     return;
   }

   inOrderTraversal(node.left);
   System.out.println(node.key + " ");
   inOrderTraversal(node.right);

 }

 public static void main(String args[]) {

   BSTTraversals bst = new BSTTraversals();

   bst.root = new Node(1);
   bst.root.left = new Node(2);
   bst.root.right = new Node(3);
   bst.root.left.left = new Node(4);
   bst.root.left.right = new Node(5);

   bst.postOrderTraversal(bst.root);
 }

}
