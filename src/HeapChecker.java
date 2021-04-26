import java.util.ArrayList;
import java.util.List;

public class HeapChecker {

    public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded){
        boolean hasElt = false;
        boolean hasEqual = false;
        if(hAdded.isHeap()) {
            List<Integer> ogHeap = hOrig.convertValues();
            List<Integer> cBst = hAdded.convertValues();
            if (ogHeap.size() == cBst.size() - 1) {
                for (Integer num : ogHeap) {
                    for (int i = 0; i < cBst.size() - 1; i++) {
                        if (cBst.get(i) == elt)
                            hasElt = true;
                        if (num == cBst.get(i)) {
                            i = cBst.size() - 1;
                            hasEqual = true;
                        }
                    }
                    if (!(hasEqual))
                        return false;
                    hasEqual = false;
                }
            }
            return hasElt;
        }
        return false;
    }


    public boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved){
        /*boolean hasElt = false;
        boolean hasEqual = false;
        if(hRemoved.isHeap()) {
            List<Integer> ogHeap = hOrig.convertValues();
            List<Integer> cBst = hRemoved.convertValues();
            int smallest = ogHeap.get(0);
            if (ogHeap.size() == cBst.size() + 1) {
                for (Integer num : ogHeap) {
                    for (int i = 0; i < cBst.size() - 1; i++) {
                        if (cBst.get(i) == elt)
                            hasElt = true;
                        if (num == cBst.get(i)) {
                            i = cBst.size() - 1;
                            hasEqual = true;
                        }
                    }
                    if (!(hasEqual))
                        return false;
                    hasEqual = false;
                }
            }
            return hasElt;
        }*/
        return false;
    }
}
