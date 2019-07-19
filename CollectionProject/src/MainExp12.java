import java.util.Stack;

public class MainExp12 
{

	public static void main(String[] args)
	{
		Stack st=new Stack();
		System.out.println(st.capacity());//10
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");
		System.out.println(st);//[A, B, C, D, E]
		System.out.println(st.pop());//E
		System.out.println(st);//[A, B, C, D]
		st.push("J");
		System.out.println(st);//[A, B, C, D, J]
		System.out.println(st.peek());//J
		System.out.println(st);//[A, B, C, D, J]
		System.out.println("----------");//----------
		System.out.println(st.empty());//false
		System.out.println(st);//[A, B, C, D, J]
		System.out.println(st.search("C"));//3
		System.out.println(st.search("B"));//4
		System.out.println(st.search("D"));//2
		st.push("B");
		System.out.println(st);//[A, B, C, D, J, B]
		System.out.println(st.search("B"));//1
		System.out.println(st.search("C"));//4
		st.push("E");
		st.push("F");
		st.push("D");
		System.out.println(st);//[A, B, C, D, J, B, E, F, D]
		System.out.println(st.search("F"));//2
		System.out.println(st.search("D"));//1
		System.out.println(st);//[A, B, C, D, J, B, E, F, D]

	}

}
