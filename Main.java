public class Main {
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        BTNode node1 = new BTNode(50);
        BTNode node2 = new BTNode(25);
        BTNode node3 = new BTNode(75);
        BTNode node4 = new BTNode(12);
        BTNode node5 = new BTNode(30);
        BTNode node6 = new BTNode(60);
        BTNode node7 = new BTNode(80);
        BTNode node8 = new BTNode(26);




        tree.insertNode(tree.theRoot(),node1);
        tree.insertNode(tree.theRoot(),node2);
        tree.insertNode(tree.theRoot(),node3);
        tree.insertNode(tree.theRoot(),node4);
        tree.insertNode(tree.theRoot(),node5);
        tree.insertNode(tree.theRoot(),node6);
        tree.insertNode(tree.theRoot(),node7);
        tree.insertNode(tree.theRoot(),node8);
        tree.inOrderTraversal(tree.theRoot());


        BTNode foundNode = tree.search(node3.getElem(),tree.theRoot);
        if(foundNode == null){
            System.out.println("nothing is found");
        }else{
            System.out.println("\n"+foundNode.getElem() + " is found");
        }
    }
}
