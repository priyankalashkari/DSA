package BinarySearchTree;

class Node {  
    int key;  
    Node left, right;  

    public Node(int item) {  
        key = item;  
        left = right = null;  
    }  
}  

class BinarySearchTree {  
    Node root;  

    // Constructor  
    BinarySearchTree() {  
        root = null;  
    }  

    // Insert a new node  
    void insert(int key) {  
        root = insertRec(root, key);  
    }  

    // Recursive function to insert a new key  
    Node insertRec(Node root, int key) {  
        // If the tree is empty, return a new node  
        if (root == null) {  
            root = new Node(key);  
            return root;  
        }  
        // Otherwise, recur down the tree  
        if (key < root.key)  
            root.left = insertRec(root.left, key);  
        else if (key > root.key)  
            root.right = insertRec(root.right, key);  
        // Return the unchanged node pointer  
        return root;  
    }  

    // Search a key in the BST  
    Node search(int key) {  
        return searchRec(root, key);  
    }  

    // Recursive function to search a key  
    Node searchRec(Node root, int key) {  
        // Base Cases: root is null or key is present at root  
        if (root == null || root.key == key)  
            return root;  
        // Key is greater than root's key  
        if (root.key < key)  
            return searchRec(root.right, key);  
        // Key is smaller than root's key  
        return searchRec(root.left, key);  
    }  

    // Delete a node  
    void deleteKey(int key) {  
        root = deleteRec(root, key);  
    }  

    // Recursive function to delete a key  
    Node deleteRec(Node root, int key) {  
        // Base case  
        if (root == null) return root;  

        // Recur down the tree  
        if (key < root.key)  
            root.left = deleteRec(root.left, key);  
        else if (key > root.key)  
            root.right = deleteRec(root.right, key);  
        else {  
            // Node with only one child or no child  
            if (root.left == null)  
                return root.right;  
            else if (root.right == null)  
                return root.left;  

            // Node with two children: Get the inorder successor (smallest in the right subtree)  
            root.key = minValue(root.right);  

            // Delete the inorder successor  
            root.right = deleteRec(root.right, root.key);  
        }  
        return root;  
    }  

    // Function to find the minimum value in a tree  
    int minValue(Node root) {  
        int minv = root.key;  
        while (root.left != null) {  
            minv = root.left.key;  
            root = root.left;  
        }  
        return minv;  
    }  

    // Inorder traversal of the tree  
    void inorder() {  
        inorderRec(root);  
    }  

    // Recursive function for inorder traversal  
    void inorderRec(Node root) {  
        if (root != null) {  
            inorderRec(root.left);  
            System.out.print(root.key + " ");  
            inorderRec(root.right);  
        }  
    }  

    public static void main(String[] args) {  
        BinarySearchTree bst = new BinarySearchTree();  
        bst.insert(50);  
        bst.insert(30);  
        bst.insert(20);  
        bst.insert(40);  
        bst.insert(70);  
        bst.insert(60);  
        bst.insert(80);  

        System.out.println("Inorder traversal of the given tree:");  
        bst.inorder();  

        System.out.println("\n\nDelete 20:");  
        bst.deleteKey(20);  
        bst.inorder();  

        System.out.println("\n\nDelete 30:");  
        bst.deleteKey(30);  
        bst.inorder();  

        System.out.println("\n\nDelete 50:");  
        bst.deleteKey(50);  
        bst.inorder();  

        System.out.println("\n\nSearch for 60:");  
        System.out.println(bst.search(60) != null ? "Found" : "Not Found");  
    }  
}