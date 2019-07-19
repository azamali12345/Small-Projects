import java.util.ArrayList;

public class MainExp2 
{

	public static void main(String[] args) 
	{
		ArrayList greens=new ArrayList(5);
		greens.add("G1");
		greens.add("G2");
		greens.add("G3");
		greens.add("G4");
		greens.add("G5");
		System.out.println(greens);//[G1, G2, G3, G4, G5]
		ArrayList reds=new ArrayList(8);
		reds.add("R1");
		reds.add("R3");
		reds.add("R5");
		reds.add("R2");
		reds.add("R4");
		System.out.println(reds);//[R1, R3, R5, R2, R4]
		ArrayList blues=new ArrayList();
		blues.add("B5");
		blues.add("B1");
		blues.add("B3");
		blues.add("B5");
		blues.add("B2");
		System.out.println(blues);//[B5, B1, B3, B5, B2]
		ArrayList colors=new ArrayList();
		colors.add("Y1");
		colors.add("P1");
		colors.add("W1");
		System.out.println(colors);//[Y1, P1, W1]
		colors.addAll(blues);
		colors.addAll(reds);
		colors.addAll(greens);
		System.out.println(colors);//[Y1, P1, W1, B5, B1, B3, B5, B2, R1, R3, R5, R2, R4, G1, G2, G3, G4, G5]
		System.out.println(colors.size());//18
		System.out.println(colors.containsAll(greens));//true
		System.out.println(colors.contains("R5"));//true
		colors.removeAll(blues);
		System.out.println(colors);//[Y1, P1, W1, R1, R3, R5, R2, R4, G1, G2, G3, G4, G5]
		colors.retainAll(reds);
		System.out.println(colors);//[R1, R3, R5, R2, R4]

		
		
	}

}
