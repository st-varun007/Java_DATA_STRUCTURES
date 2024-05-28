import java.util.ArrayList;
import DataStructure.*;
import DataStructure.TreeTraversal.*;

public class Main {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        DFS_PostOrder T = new DFS_PostOrder();
        int[] arr = {6, 2, 8, 0, 4, 7, 9, 1, 3, 5};
        for(int x : arr)
        {
            tree.insert(x);
        }

        ArrayList<Integer> list  = T.PostOrder(tree.root);
        System.out.println(list);

    }

    
}
