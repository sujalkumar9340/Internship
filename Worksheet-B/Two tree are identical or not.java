public class IdenticalTrees {
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    static boolean areIdentical(Node root1, Node root2) {
        // Base case: both trees are empty
        if (root1 == null && root2 == null) {
            return true;
        }
        
        // Check if the roots have the same value
        if (root1 != null && root2 != null) {
            if (root1.data == root2.data) {
                // Recursively check the left and right subtrees
                return areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
            }
        }
        
        // If none of the above conditions are met, the trees are not identical
        return false;
    }
    
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        
        if (areIdentical(root1, root2)) {
            System.out.println("The two trees are identical.");
        } else {
            System.out.println("The two trees are not identical.");
        }
    }
}
