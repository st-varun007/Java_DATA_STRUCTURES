package DataStructure;
public class Stack {
   private Node top;
   private int size;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Stack()
    {
        top = null;
    }
    public void push(int data)
    {
        Node newNode = new Node(data);
        if(top ==null)
        {
            top = newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        size++;
    }
    public void pop()
    {
        Node temp = top;
        top=top.next;
        temp.next =null;
        size--;
        System.gc();
    }
    public void getTop()
    {
        if(top==null)
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println(top.data);
        }
    }
    public void display()
    {
        Node current = top;
        while(current!=null)
        {
            System.out.print(current.data+"\n|\n");
            current=current.next;
        }
        System.out.println("size = "+size);
    }
}
