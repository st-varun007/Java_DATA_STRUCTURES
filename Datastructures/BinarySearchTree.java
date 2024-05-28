package DataStructure;


public  class BinarySearchTree {
        public Node root;
   public class Node{
        public int data;
        public Node right;
        public Node left;
        public Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;   
        }
    }

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(root ==null)
        {
            root = newNode;
        }
        else{
            Node current = root;
            while(true)
            {
                if(newNode.data == current.data)
                {
                    System.out.println("already extist");
                    break;
                }
                if(newNode.data < current.data)
                {
                    if(current.left==null)
                    {
                        current.left = newNode;
                        break;
                    }
                        current=current.left;
                }
                else
                {
                     if(current.right==null)
                    {
                        current.right = newNode;
                        break;
                    }
                    current=current.right;
                }
            }
        }
    }

    public boolean contains(int data)
    {
        Node current = root;
        while(current!=null)
        {
            if(current.data == data)
            {
                return true;
            }
            if(data<current.data)
            {
                current=current.left;
            }
            else
            {
                current=current.right;
            }
        }   
        return false;
        }


 /*below all the methods are going to be recursive 
 ****************************************************************/       
    public boolean rcontains(int data)
    {
        return rcontains(root,data);
    }
    
    private boolean rcontains(Node currentNode,int data)
    {
        if(currentNode==null)
        {
            return false;
        }
        else if(data>currentNode.data)
        {
            return rcontains(currentNode.right,data);
        }
        else if(data<currentNode.data)
        {
            return rcontains(currentNode.left,data);
        }
        else{
            return true;
        }
    }
    public void rInsert(int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return;
        }
        rInsert(root, data);
    }
    private Node rInsert(Node currentNode, int data)
    {
        if(currentNode==null)
        {
            return new Node(data);
        }
        if(data<currentNode.data)
        {
            currentNode.left = rInsert(currentNode.left,data);
        }
        else if(data> currentNode.data)
        {
            currentNode.right = rInsert(currentNode.right, data);
        }
        return currentNode;
    }

    public void rRemove(int data)
    {
        rRemove(root,data);
    }
    private Node rRemove(Node currentNode,int data)
    {
        if(currentNode==null)
        {
            System.out.println("elementNot present");
            return null;
        }
        if(data<currentNode.data)
        {
            currentNode.left = rRemove(currentNode.left, data);
        }
        else if(data> currentNode.data)
        {
            currentNode.right = rRemove(currentNode.right, data);
        }
        else{
            if(currentNode.left == null && currentNode.right==null)
            {
                return null;
            }
            else if(currentNode.left!= null && currentNode.right==null)
            {
                return currentNode.left;
            }
            else if(currentNode.left== null && currentNode.right!=null)
            {
                return currentNode.right;
            }
            else
            {
                int min = helper(currentNode.right);
                currentNode.data = min;
                currentNode.right = rRemove(currentNode.right, min);
            }
        }
        return currentNode;
    }

    private int helper(Node currentNode)
    {
        if(currentNode.left == null)
        {
            return currentNode.data;
        }
        else
        {
            return helper(currentNode.left);
        }
    }

}
