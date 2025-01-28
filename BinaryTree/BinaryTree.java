package BinaryTree;

class Node {  
    int data;  
    Node left, right;  

    Node(int item) {  
        data = item;  
        left = right = null;  
    }  
}  

public class BinaryTree {  
    Node root;  

    // Function to build the tree from preorder sequence  
    public static Node buildTree(int[] preorder, int[] index) {  
        if (index[0] >= preorder.length || preorder[index[0]] == -1) {  
            index[0]++;  
            return null;  
        }  

        Node node = new Node(preorder[index[0]++]);  
        node.left = buildTree(preorder, index);  
        node.right = buildTree(preorder, index);  
        return node;  
    }  

    // Function for preorder traversal  
    public void printPreOrder(Node node) {  
        if (node == null) return;  
        System.out.print(node.data + " ");  
        printPreOrder(node.left);  
        printPreOrder(node.right);  
    }  

    // Function for inorder traversal  
    public void printInOrder(Node node) {  
        if (node == null) return;  
        printInOrder(node.left);  
        System.out.print(node.data + " ");  
        printInOrder(node.right);  
    }  

    // Function for postorder traversal  
    public void printPostOrder(Node node) {  
        if (node == null) return;  
        printPostOrder(node.left);  
        printPostOrder(node.right);  
        System.out.print(node.data + " ");  
    }  

    // Function to count nodes  
    public int countNodes(Node node) {  
        if (node == null) return 0;  
        return 1 + countNodes(node.left) + countNodes(node.right);  
    }  

    // Function to calculate the sum of nodes  
    public int sumNodes(Node node) {  
        if (node == null) return 0;  
        return node.data + sumNodes(node.left) + sumNodes(node.right);  
    }  

    // Function to calculate the height of the tree  
    public int height(Node node) {  
        if (node == null) return 0;  
        return 1 + Math.max(height(node.left), height(node.right));  
    }  

    // Function to find the diameter of the tree  
    public int diameter(Node node) {  
        if (node == null) return 0;  
        int leftHeight = height(node.left);  
        int rightHeight = height(node.right);  
        int leftDiameter = diameter(node.left);  
        int rightDiameter = diameter(node.right);  
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));  
    }  

    public static void main(String[] args) {  
        BinaryTree tree = new BinaryTree();  
        int[] preorder = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1}; // -1 represents null  
        int[] index = {0};  
        tree.root = buildTree(preorder, index);  

        System.out.println("Preorder traversal:");  
        tree.printPreOrder(tree.root);  
        System.out.println("\nInorder traversal:");  
        tree.printInOrder(tree.root);  
        System.out.println("\nPostorder traversal:");  
        tree.printPostOrder(tree.root);  
        System.out.println("\nTotal nodes: " + tree.countNodes(tree.root));  
        System.out.println("Sum of nodes: " + tree.sumNodes(tree.root));  
        System.out.println("Height of tree: " + tree.height(tree.root));  
        System.out.println("Diameter of tree: " + tree.diameter(tree.root));  
    }  
}