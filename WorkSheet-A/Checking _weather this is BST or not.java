class Node
{
 int data;
 Node left = null, right = null;

 Node(int data) {
     this.data = data;
 }
}

class Main
{
 // Recursive function to insert a key into a BST
 public static Node insert(Node root, int key)
 {
     // if the root is null, create a new node and return it
     if (root == null) {
         return new Node(key);
     }

     // if the given key is less than the root node, recur for the left subtree
     if (key < root.data) {
         root.left = insert(root.left, key);
     }
     // if the given key is more than the root node, recur for the right subtree
     else {
         root.right = insert(root.right, key);
     }

     return root;
 }

 public static boolean isBST(Node node, int minKey, int maxKey)
 {
     // base case
     if (node == null) {
         return true;
     }

     // if the node's value falls outside the valid range
     if (node.data < minKey || node.data > maxKey) {
         return false;
     }

     // recursively check left and right subtrees with an updated range
     return isBST(node.left, minKey, node.data) &&
         isBST(node.right, node.data, maxKey);
 }

 // Function to determine whether a given binary tree is a BST
 public static void isBST(Node root)
 {
     if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
         System.out.println("The tree is a BST.");
     }
     else {
         System.out.println("The tree is not a BST!");
     }
 }

 private static void swap(Node root)
 {
     Node left = root.left;
     root.left = root.right;
     root.right = left;
 }

 public static void main(String[] args)
 {
     int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
