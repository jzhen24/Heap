import java.util.ArrayList;
import java.util.List;

class MtBT implements IBinTree {
    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since empty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    @Override
    public boolean isHeap() {
        return true;
    }

    @Override
    public List<Integer> convertValues() {
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

    @Override
    public int getData() {
        return 0;
    }

    @Override
    public IBinTree getRight() {
        return null;
    }

    @Override
    public IBinTree getLeft() {
        return null;
    }
}
