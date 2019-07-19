
public class Pen 
{
	String color;
	int price;
	Pen(String color,int price)
	{
		this.color=color;
		this.price=price;
	}
	public int hashCode()
	{
		return price;
	}
}
