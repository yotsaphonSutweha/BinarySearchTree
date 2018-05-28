public class Main {
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        BTNode<String> node1 = new BTNode<>("50");
        BTNode<String> node2 = new BTNode<>("25");
        BTNode<String> node3 = new BTNode<>("75");
        BTNode<String> node4 = new BTNode<>("12");
        BTNode<String> node5 = new BTNode<>("30");
        BTNode<String> node6 = new BTNode<>("60");
        BTNode<String> node7 = new BTNode<>("80");
        BTNode<String> node8 = new BTNode<>("26");




        tree.insertNode(tree.theRoot(),node1);
        tree.insertNode(tree.theRoot(),node2);
        tree.insertNode(tree.theRoot(),node3);
        tree.insertNode(tree.theRoot(),node4);
        tree.insertNode(tree.theRoot(),node5);
        tree.insertNode(tree.theRoot(),node6);
        tree.insertNode(tree.theRoot(),node7);
        tree.insertNode(tree.theRoot(),node8);


        BTNode foundNode = tree.search(node3.getElem(),tree.theRoot);
        if(foundNode == null){
            System.out.println("nothing is found");
        }else{
            System.out.println("\n"+foundNode.getElem() + " is found");
        }

        tree.inOrderTraversal(tree.theRoot());
//        tree.delete(80, tree.theRoot());
        tree.inOrderTraversal(tree.theRoot());
        tree.delete("75", tree.theRoot());
        tree.inOrderTraversal(tree.theRoot());
        tree.delete("25", tree.theRoot());
        tree.inOrderTraversal(tree.theRoot());



    }
}
