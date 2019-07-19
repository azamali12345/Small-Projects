import java.util.ArrayList;

public class MainExp6
{

	public static void main(String[] args)
	{
		ArrayList fruits=new ArrayList(7);
		fruits.add("APPLE");
		fruits.add("ORANGE");
		fruits.add("GRAPES");
		fruits.add("MANGO");
		fruits.add("PINEAPPLE");
		System.out.println(fruits);//[APPLE, ORANGE, GRAPES, MANGO, PINEAPPLE]
		fruits.add(1,"BANANA");
		System.out.println(fruits);//[APPLE, BANANA, ORANGE, GRAPES, MANGO, PINEAPPLE]
		System.out.println(fruits.get(3));//GRAPES
		System.out.println(fruits.remove(2));//ORANGE
		System.out.println(fruits);//[APPLE, BANANA, GRAPES, MANGO, PINEAPPLE]
		System.out.println(fruits.indexOf("MANGO"));//3

	}

}
