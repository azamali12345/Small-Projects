import java.util.*;
public class MainExp21 
{

	public static void main(String[] args)
	{
		ArrayDeque aq=new ArrayDeque();//Default 16
		aq.offer("AAA");
		aq.offer("DDD");
		aq.offer("CCC");
		aq.offer("BBB");
		aq.offer("ZZZ");
		aq.offer("QQQ");
		aq.offer("PPP");
		aq.add("YYY");
		aq.add("RRR");
		aq.add("SSS");
		aq.add("NNN");
		aq.add("TTT");
		aq.add("III");
		aq.add("LLL");
		System.out.println(aq);//[AAA, DDD, CCC, BBB, ZZZ, QQQ, PPP, YYY, RRR, SSS, NNN, TTT, III, LLL]
		aq.addFirst("FFF");
		aq.addLast("YYY");
		System.out.println(aq);//[FFF, AAA, DDD, CCC, BBB, ZZZ, QQQ, PPP, YYY, RRR, SSS, NNN, TTT, III, LLL, YYY]
		aq.add(123);
		System.out.println(aq);//[FFF, AAA, DDD, CCC, BBB, ZZZ, QQQ, PPP, YYY, RRR, SSS, NNN, TTT, III, LLL, YYY, 123]
		//System.out.println(null);
	}

}
