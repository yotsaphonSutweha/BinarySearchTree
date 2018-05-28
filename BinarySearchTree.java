public class BinarySearchTree<T extends Comparable<T>> {
    BTNode<T> theRoot;
    String x;

    public BinarySearchTree() {
        theRoot = null;
        x ="";
    }

    public BTNode<T> theRoot() {
        return theRoot;
    }

    public boolean isEmpty(){
        if(theRoot == null){
            return true;
        }
        return false;
    }

    public void insertNode(BTNode<T> startNode, BTNode<T> newNode){
        if(theRoot == null){
            theRoot = newNode;
        }else{
            if(newNode.getElem().compareTo(startNode.getElem()) > 0){
                if(startNode.getRightC() == null){
                    startNode.setRightC(newNode);
                }else{
                    insertNode(startNode.getRightC(), newNode);
                }
            }
            else if(newNode.getElem().compareTo(startNode.getElem()) < 0){
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

    public BTNode search(T elem, BTNode<T> startNode){
        if(startNode.getElem() == elem){
            return startNode;
        }
        else{
            if(startNode.getElem().compareTo(elem) > 0){
                return  search(elem, startNode.getLeftC());
            }else if(startNode.getElem().compareTo(elem) < 0){
                return search(elem,startNode.getRightC());
            }
        }
        return startNode;

    }

    public BTNode<T> delete(Comparable<T> elem, BTNode start){
        if(start == null){
            return start;
        }else{
            if(start.getElem().compareTo(elem) > 0){
                start.setLeftC(delete(elem, start.getLeftC()));
            }else if(start.getElem().compareTo(elem) < 0){
                start.setRightC(delete(elem, start.getRightC()));
            }else{
                // node to delete has 1 or 2 child
                if(start.getLeftC() == null){
                    return start.getRightC();
                }else if(start.getRightC() == null){
                    return start.getLeftC();
                }else{
                    start.setElem(predecessor(start).getElem());
                    System.out.println(predecessor(start).getElem());
                    start.setRightC(delete(start.getElem(), start.getRightC()));
                }
            }
        }
        return start;
    }

    public BTNode<T> predecessor(BTNode<T> node){
        if(node.getRightC() == null){
            return node;
        }else{
            return(predecessor(node.getRightC()));
        }
    }

    public void inOrderTraversal(BTNode<T> theStart){
        x = "";
        System.out.println(inOrderTraversalHelper(theStart));
    }


    public String inOrderTraversalHelper(BTNode<T> theStart) {
        if(theStart != null){
            inOrderTraversalHelper(theStart.getLeftC());
            x+=theStart.getElem() + " ";
            inOrderTraversalHelper(theStart.getRightC());
        }

        return x.trim();
    }

}
