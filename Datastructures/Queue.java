package DataStructure;
public class Queue{
    Node first;
    Node last;
    int length=0;
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Queue()
    {
        first = null;
        last = first;
    }

    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if(first==null)
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public void dequeue()
    {
        if(first!=null)
        {
            System.out.println(first.data);
            Node newNode = first;
            first = first.next;
            newNode.next =null;
            length--;
        }
        else
        {
            System.out.println("queue is empty");
        }

       
    }
    void getLength()
    {
        System.out.println("\nLength:"+length);
    }
    void display()
    {
        
        if(first==null)
        {
            System.out.println("queue is empty");
            return;
        }
        System.out.println();
        Node current = first;
        while(current!=null)
        {
            System.out.print(current.data+"<-");
            current=current.next;
        }
    }
}