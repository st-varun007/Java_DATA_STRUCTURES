package DataStructure.TreeTraversal;
import java.util.*;
import DataStructure.BinarySearchTree.Node;

public class DFS_PreOrder {

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> traverse(Node root)
    {
        class traverse
        {
            traverse(Node current)
            {
                list.add(current.data);
                if(current.left!=null)
                {
                    new traverse(current.left);
                }
                if(current.right !=null)
                {
                    new traverse(current.right);
                }
            }
        }
        new traverse(root);
        return list;
    }
    
}