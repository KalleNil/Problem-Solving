/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kalle
 */
public class BinaryTreeTraversal {
    
    Node root;
    
   
    public void addNode(int key, String name) {

 
        Node newNode = new Node(key, name);


        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {

                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;

                        return; 
                    }
                } else { 
                    focusNode = focusNode.rightChild;

                    if (focusNode == null) {
                        parent.rightChild = newNode;

                        return; 
                    }
                }
            }
        }
    }
    
    public void ascendingOrderTraversal(Node focusNode){
        if(focusNode != null){
            ascendingOrderTraversal(focusNode.leftChild);
            System.out.println(focusNode);
            ascendingOrderTraversal(focusNode.rightChild);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        BinaryTreeTraversal runescapeTree = new BinaryTreeTraversal();
        
        runescapeTree.addNode(17, "Cave slug");
        runescapeTree.addNode(20, "Rock slug");
        runescapeTree.addNode(22, "Desert lizzard");
        runescapeTree.addNode(55, "Turoth");
        runescapeTree.addNode(57, "Mutated zygomite");
        
        runescapeTree.ascendingOrderTraversal(runescapeTree.root);
        
        
    }
    
    
}

class Node{
    
    int key;
    String name;
    
    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
        
    }
    public String displayer(){
        return name + "has the key of" + key;
    }
    
    
}
