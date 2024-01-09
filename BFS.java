

/* BFS TRAVERSAL LOGIC
Breadth-First Search (BFS) is the level order traversal. The basic idea is to visit all the neighbors of a starting vertex before moving on to their neighbors.

Here's a basic outline of the logic for BFS traversal:

1. Initialize Data Structures:
   - Create a queue to keep track of the vertices to be visited.
   - Create a set or array to mark visited vertices.
   - Enqueue the starting vertex into the queue and mark it as visited.

2. BFS Traversal:
   - While the queue is not empty:
     - Dequeue a vertex from the queue.
     - Process the dequeued vertex (print or store its value).
     - Enqueue all unvisited neighbors of the dequeued vertex and mark them as visited.

3. Repeat  Queue is Empty:
   - Continue the process until the queue is empty.




.
 * 
 */




//
import java.util.*;
/**
 * InnerBFS
 */
public class Node {
int data;
Node left,right;
public Node(int d){
    data=d;
    left=right=null;
}

    
}

class BFS{
    public static void main(String[] args) {
        int n=8;//num of vertics in graph
        boolean visit[]=new boolean[n];//track the record
        //adjacency matrix representain
        int adjmat[][]=new int[n][n];
        System.out.println(
            "Enter adjacency matrix"
        );

    
       
        
        for(int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            for(int j=0;j<=i;j++){
                adjmat[i][j]=sc.nextInt();           
            }
        }
        bfs(0,visit,adjmat,n);
    }
   public static void bfs(int start,boolean visit[],int adjmat[]){
    Queue<Integer> q=new LinkedList<>();
    q.add(start);
    visit[start]=true;
    System.out.println("visited"+start+" ");
    while(!q.isEmpty()){
        int node=q.peek();
        q.remove();

    }
    int k=findmin(q,visit,adjmat).data;
    if(k!=-1){
        q.add(k);
        System.out.println(k+" ");
        visit[k]=true;

    }
}




    
}


   
        
       
        


        



    
