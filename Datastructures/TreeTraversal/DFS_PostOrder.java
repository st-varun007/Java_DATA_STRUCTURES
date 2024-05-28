package DataStructure.TreeTraversal;
import DataStructure.BinarySearchTree.*;
import java.util.ArrayList;
public class DFS_PostOrder {

    public ArrayList<Integer> PostOrder(Node current)
    {
        ArrayList<Integer> list = new ArrayList<>();

        class traverse{
            traverse(Node current)
            {
                    if(current.left != null )
                    {
                        new traverse(current.left);
                    }
                    list.add(current.data);
                    if(current.right!=null)
                    {
                        new traverse(current.right);
                    }
                    // list.add(current.data);
            }

        }
        new traverse(current);
        return list;
    }
    
}
