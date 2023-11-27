import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
public class DoubleEndedQueue{
    public static void main(String args[]){
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        System.out.print(d);
    }
}