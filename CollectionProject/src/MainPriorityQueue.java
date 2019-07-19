import java.util.*;
public class MainPriorityQueue 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();//Defailt Capacity 11
		pq.offer('C');
		pq.offer('O');
		pq.offer('O');
		pq.offer('D');
		pq.offer('I');
		pq.offer('N');
		pq.offer('G');
		
		//pq.offer(123);
		//pq.offer(null);
		System.out.println(pq);//[C, D, G, O, I, O, N]
		System.out.println(pq.size());//7
		
		System.out.println(pq.peek());//C
		System.out.println(pq.poll());//C
		System.out.println(pq.poll());//D
		System.out.println(pq.poll());//G
		System.out.println(pq.poll());//I
		System.out.println(pq);//[N, O, O]
		System.out.println("----------------");
		
		pq=new PriorityQueue(new PriorityQueueComparator());
		pq.offer('C');
		pq.offer('O');
		pq.offer('D');
		pq.offer('I');
		pq.offer('N');
		pq.offer('G');
		System.out.println(pq.poll());//O
		System.out.println(pq.poll());//N
		System.out.println(pq.poll());//I
		System.out.println(pq.poll());//G
		System.out.println(pq);//[D, C]
	}

}
