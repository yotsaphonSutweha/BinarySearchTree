public class BinarySearchTree {
    BTNode theRoot;

    public BinarySearchTree() {
        theRoot = null;
    }

    public BTNode theRoot() {
        return theRoot;
    }

    public boolean isEmpty(){
        if(theRoot == null){
            return true;
        }
        return false;
    }

    public void insertNode(BTNode startNode, BTNode newNode){
        if(theRoot == null){
            theRoot = newNode;
        }else{
            if(newNode.getElem() > startNode.getElem()){
                if(startNode.getRightC() == null){
                    startNode.setRightC(newNode);
                }else{
                    insertNode(startNode.getRightC(), newNode);
                }
            }
            else if(newNode.getElem() < startNode.getElem()){
                if(startNode.getLeftC() == null){
                    startNode.setLeftC(newNode);
                }else{
                    insertNode(startNode.getLeftC(), newNode);
                }
            }
            else if(newNode.getElem() == startNode.getElem()){
                System.out.println("value already exists");
            }
        }
    }

    public BTNode search(int elem, BTNode startNode){
        if(startNode.getElem() == elem){
            return startNode;
        }
        else{
            if(startNode.getElem() > elem){
                return  search(elem, startNode.getLeftC());
            }else if(startNode.getElem() < elem){
                return search(elem,startNode.getRightC());
            }
        }
        return startNode;

    }

    public void inOrderTraversal(BTNode theStart){
        if(theStart == null){
            return;
        }else{
            inOrderTraversal(theStart.getLeftC());
            System.out.println(theStart.getElem());
            inOrderTraversal(theStart.getRightC());

        }
    }

}
