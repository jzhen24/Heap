import java.util.ArrayList;
import java.util.List;

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    public boolean isHeap(){
        if(getData()<getLeft().getData() && getData()<getRight().getData()) {
            if (getLeft().getData() == 0)
                getRight().isHeap();
            if (getRight().getData() == 0)
                getLeft().isHeap();
            getLeft().isHeap();
            getRight().isHeap();
        }
        else
            return false;
        return true;
    }

    public List<Integer> convertValues() {
        List<Integer> converted = new ArrayList<>();
        if (getLeft().getData() != 0) {
            converted.addAll(convertValues());
        }
        if (getRight().getData() != 0) {
            converted.addAll(convertValues());
        }
        converted.add(getData());
        return converted;
    }



    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }

    public int getData(){
        return this.data;
    }

    public IBinTree getLeft(){
        return this.left;
    }

    public IBinTree getRight(){
        return this.right;
    }
}
