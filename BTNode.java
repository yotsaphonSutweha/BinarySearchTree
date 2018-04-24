public class BTNode {
    private int elem;
    private  BTNode leftC;
    private  BTNode rightC;

    public BTNode(int elem) {
        this.elem = elem;
        this.leftC = null;
        this.rightC = null;
    }

    public int getElem() {
        return elem;
    }

    public void setElem(int elem) {
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
}
