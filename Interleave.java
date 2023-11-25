import java.util.LinkedList;
import java.util.Queue;
public class Interleave{
    public static void interleaved(Queue<Integer> q){
        Queue<Integer> firsthalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interleaved(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}