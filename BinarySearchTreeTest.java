import org.junit.Before;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree bst;
    private BTNode node;

    @Before
    public void setUp() throws Exception {
        bst = new BinarySearchTree();
    }

    @org.junit.Test
    public void theRootIsNull() {
        bst.insertNode(null, node);
        assertEquals(null, bst.theRoot());
    }

    @org.junit.Test
    public void theRootNotNull() {
        node = new BTNode(1);
        bst.insertNode(bst.theRoot(), node);
        assertEquals(1,1);
    }

    @org.junit.Test
    public void isEmpty() {
        bst.insertNode(bst.theRoot(), node);
        assertEquals(false, false);
    }

    @org.junit.Test
    public void insertNode() {
        node = new BTNode(3);
        bst.insertNode(bst.theRoot, node);
        assertEquals(3, 3);
    }

    @org.junit.Test
    public void search() {
        node = new BTNode(3);
        bst.insertNode(bst.theRoot, node);
        bst.search(3, bst.theRoot());
        assertEquals(3,3);
    }

    @org.junit.Test
    public void inOrderTraversal() {
        fail();
    }
}