package DataStructure;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<String,ArrayList<String>> vertices = new HashMap<>();
    
    public void addVertex(String vertex)
    {
        if(vertices.get(vertex)!=null)
        {
            System.out.println("not added");
            return;
        }
        vertices.put(vertex,new ArrayList<String>());
        System.out.println("added");
    }

    public void addEdge(String vertex1,String vertex2)
    {
        if(vertices.get(vertex1)!=null && vertices.get(vertex2)!=null)
        {
            if(!vertices.get(vertex1).contains(vertex2))
            {
                vertices.get(vertex1).add(vertex2);
                vertices.get(vertex2).add(vertex1);
                return;
            }
            System.out.println("already added");
            return;   
        }
        System.out.println("not possible");
    }

    public void removeEdge(String vertex1,String vertex2)
    {
        if(vertices.get(vertex1)!=null && vertices.get(vertex2)!=null)
        {
            if(vertices.get(vertex1).contains(vertex2))
            {
                 vertices.get(vertex1).remove(vertex2);
            vertices.get(vertex2).remove(vertex1);
                return;
            }
            System.out.println(vertex1+" " + vertex2+ " already removed");
            return;   
        }
        System.out.println("not possible");
    }

    public void removeVertex(String vertex1)
    {
        if(vertices.get(vertex1)==null)
        {
            System.out.println("no such vertex : "+vertex1);
            return;
        }
        for(String vertex2 : vertices.get(vertex1))
        {
            vertices.get(vertex2).remove(vertex1);
        }
        vertices.remove(vertex1);
    }

    public void display()
    {
            
            System.out.println(vertices);
        
    }
}
