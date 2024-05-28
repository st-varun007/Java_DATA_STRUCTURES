package DataStructure.TreeTraversal;
import java.util.*;
import DataStructure.BinarySearchTree.Node;

public class BFS{
    public ArrayList<Integer> BreathFirstSearch(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);

        while(queue.size()>0)
        {
            Node current = queue.remove();
            list.add(current.data);
            if(current.left != null)
            {
                queue.add(current.left);
            }
            if(current.right !=null)
            {
                queue.add(current.right);
            }
        }
        return list;
    }
}
