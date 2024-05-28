package DataStructure;
public class DoublyLinkedList {
   private Node head;
    private Node tail;
    private int length=0;

    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.previous=null;
        }
    }

    public DoublyLinkedList()
    {
        head = null;
        tail = null;
    }
    public void addAtStart(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            newNode.next = head;
            newNode.previous = null;
            head = newNode;
            tail = head;
        }
        else
        {
            newNode.next = head;
            head.previous = newNode;
            head =  newNode;
        }
        length+=1;
    }
    public void addAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head ==null)
        {
            head = newNode;
            tail = head;
        }
        else
        {   
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length+=1;
    }
    
    public void removeLast()
    {
        if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail=tail.previous;
            tail.next = null;
        }
        length-=1;
    }

    public void removeStart()
    {
        if(head.next ==null)
        {
            head = null;
        } 
        else
        {
            head = head.next;
            head.previous = null;
        }
        length-=1;
    }
    public void get(int index)
    {
        if(index<0 || index>=length) 
        {
            System.out.println("enter the valid index");
        }
        else
        {
            Node current = getLocation(index);
            System.out.println("index "+index+"="+current.data);
        }
    }
    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail=temp;
        Node current = head;
        while(current !=null)
        {
            temp= current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.next;
        }

    }
    public void set(int index,int data)
    {
        if(index<0 || index>=length)
        {
            System.out.println("enter the valid index");
        }
        else if(index==0)
        {
            head.data = data;
        }
        else if(index==length-1)
        {
            tail.data=data;
        }
        else
        {
            Node current = getLocation(index);
            current.data = data;
        }
    }

    public void insert(int index,int data)
    {
        if(index<0 ||  index>=length)
        {
            System.out.println("cant Insert");
        }
        else if(index==0)
        {
            addAtStart(data);
        }
        else if(index==length-1)
        {
            addAtEnd(data);
        }
        else
        {
            Node newNode = new Node(data);
            Node current = getLocation(index);
            newNode.next = current;
            newNode.previous=current.previous;
            current.previous = newNode;
            newNode.previous.next = newNode;
        }
        length+=1;
    }
    public void remove(int index)
    {
        if(index<=0 || index>=length)
        {
            System.out.println("out of range");
        }
        else if(index==0)
        {
            removeStart();
        }
        else if(index==length-1)
        {
            removeLast();
        }
        else
        {
            Node current = getLocation(index);
            current.previous.next = current.next;
        }
        length-=1;
    }

    public Node getLocation(int index)
    {
        Node current = head;
        for(int i=0;i<index;i++)
        {
            current=current.next;
        }
        return current;
    }

    public void display()
    {
        Node current = head;
        if(current==null)
        {
            System.out.println("list is empty");
            return;
        }
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("\nlength="+length);
    }
}
