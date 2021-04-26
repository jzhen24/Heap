import java.util.List;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();
    // returns depth of longest branch in the tree
    int height();
    // Determine if the heap given is a heap
    boolean isHeap();
    int getData();
    IBinTree getLeft();
    IBinTree getRight();
    public List<Integer> convertValues();
}
