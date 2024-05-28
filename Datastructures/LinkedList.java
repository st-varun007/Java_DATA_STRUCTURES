package DataStructure;
public class LinkedList{
    private int length=0;
    Node head;
    Node tail;
     class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList()
    {
        head = null;
    }

    public void addElement_End(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            head = newNode;
            tail = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public void addElement_Start(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void deleteElement_End()
    {
        Node current = head;
        while(current.next!=null && current.next.next!=null)
        {
            current = current.next;
        }
        if(current.next==null)
        {
            head = null;
            tail = null;
        }
        else
        {
        tail = current;
        current.next=null;
        }
        length--;
        
    }
    public void deleteElement_Start()
    {
        Node newNode = head;
        head = head.next;
        newNode.next = null;
        length--;
        if(length==0)
        {
            tail = null;
        }
    }

    public int get(int index)
    {
        int i=0;
        Node current = head;
        while(i<index && current!=null)
        {
            current=current.next;
            i++;
        }
        if(current!=null)
        return current.data;
        else
        return -1;
    }


    public void set(int index,int data)
    {
        if(index<0 || index>=length) 
        {
            System.out.println("enter the vaild index");
        }
        else
        {
            Node current = head;
            int i=0;
            while(i<index && current!=null)
            {
                i++;
                current = current.next;
            }
            current.data = data;
        }
    }

    public void insert(int index,int data)
    {
        if(index<0 || index>=length)
        {
            System.out.println("enter the valid index");
        }
        else if(index==0)
        {
            addElement_Start(data);
        }
        else if(index == length-1)
        {
            addElement_End(data);
        }
        else{
            Node current = head;
            Node  newNode = new Node(data);
            int i=0;
            while(i<index-1)
            {
                current = current.next;
                i++;
            }
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    public void remove(int index)
    {
         if(index<0 || index>=length)
        {
            System.out.println("enter the valid index");
        }
        else if(index==0)
        {
            deleteElement_Start();
        }
        else if(index == length-1)
        {
            deleteElement_End();
        }
        else
        {
            Node current = head;
            int i=0;
            while(i<index-1)
            {
                current = current.next;
                i++;
            }
            current.next = current.next.next;
            length--;
        }

    }
    public void reverse()
    {
        Node current = head;
        Node next = current.next;
        Node previous = null;
        head = tail;
        tail = current;
        while(next!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current= next;
        }
        head = previous;
    }
    public void display()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
        System.out.println("length ="+length);
    }
}