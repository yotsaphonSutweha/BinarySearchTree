import org.junit.Before;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    private BinarySearchTree bst;
    private BTNode node;
    BTNode node1 = new BTNode(50);
    BTNode node2 = new BTNode(25);
    BTNode node3 = new BTNode(75);

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
        BTNode root = bst.theRoot();
        assertEquals(1,root.getElem());
    }

    @org.junit.Test
    public void isEmpty() {
        bst.insertNode(bst.theRoot(), node);
        boolean test = bst.isEmpty();
        assertEquals(true, test);
    }

    @org.junit.Test
    public void insertNode() {
        node = new BTNode(3);
        bst.insertNode(bst.theRoot, node);

        assertEquals(3, bst.theRoot().getElem());
    }

    @org.junit.Test
    public void search() {
        node = new BTNode(3);
        bst.insertNode(bst.theRoot, node);
        BTNode search = bst.search(3, bst.theRoot());
        assertEquals(3,search.getElem());
    }

    @org.junit.Test
    public void testInorderTraversal(){
        bst.insertNode(bst.theRoot(), node1);
        bst.insertNode(bst.theRoot(), node2);
        bst.insertNode(bst.theRoot(), node3);
        assertEquals("25 50 75", bst.inOrderTraversalHelper(bst.theRoot()));
    }


}