package DataStructure;
import java.util.ArrayList;

public class HashTable{
    class Node{

        String key;
        int data;
        Node next;

        public Node(String key , int data)
        {
            this.key = key;
            this.data = data;
        }
    }
    int size = 7;
     Node[] datamap;

    public HashTable()
    {
        datamap = new Node[size];
    }
    public void set(String str , int data)
    {
        int num = hashFunction(str);
        if(datamap[num]==null)
        {
            datamap[num]=new Node(str,data);
        }
        else
        {
            Node newNode = new Node(str,data);
            newNode.next = datamap[num];
            datamap[num]=newNode;
        }

    }
    public void get(String str)
    {
        int num = hashFunction(str);
        Node temp = datamap[num];
            while( temp!=null)
            {
                if(temp.key.equals(str))
                {
                    System.out.printf("\n{key : %s  , value : %d}\n",temp.key,temp.data);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("not a valid key");
        
    }
    public int hashFunction(String str)
    {
        int num =0;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            num=(num+arr[i]*23)%datamap.length;
        }
        return num;
    }
    public void getKeys()
    {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<datamap.length;i++)
        {
            Node temp = datamap[i];
            while(temp!=null)
            {
                list.add(temp.key);
                temp = temp.next;
            }
        }
        System.out.println(list.toString());
    }
    
    

    public void display()
    {
        for(int i=0;i<datamap.length;i++)
        {
            System.out.print(i+" : ");
            Node current = datamap[i];
            while(current!=null)
            {
                System.out.print("{ Key : "+current.key+", value : "+current.data+"}");
                current = current.next;
            }
            System.out.println();
        }
    }
}