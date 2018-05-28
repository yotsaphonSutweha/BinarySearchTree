public class BTNode<T extends Comparable<T>> {
    private T elem;
    private  BTNode leftC;
    private  BTNode rightC;

    public BTNode(T elem) {
        this.elem = elem;
        this.leftC = null;
        this.rightC = null;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public BTNode getLeftC() {
        return leftC;
    }

    public void setLeftC(BTNode leftC) {
        this.leftC = leftC;
    }

    public BTNode getRightC() {
        return rightC;
    }

    public void setRightC(BTNode rightC) {
        this.rightC = rightC;
    }

    public boolean isExternal(BTNode node){
        return node.getLeftC() == null && node.getRightC() == null;
    }

    public boolean isInternal(BTNode node){
        return node.getLeftC() != null || node.getRightC() != null;
    }



}
