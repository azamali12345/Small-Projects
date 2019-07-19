//Example Of Call By Reference
public class MainExp5 
{
	int data=50;
	void change(MainExp5 op)
	{  
	op.data=op.data+100;//changes will be in the instance variable  
	}
	 
	public static void main(String args[])
	{  
		MainExp5 ob=new MainExp5(); 
		System.out.println("before change "+ob.data);  
		ob.change(ob);//passing object  
		System.out.println("after change "+ob.data);
	}  
}
