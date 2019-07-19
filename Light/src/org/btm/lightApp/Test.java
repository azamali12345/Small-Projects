package org.btm.lightApp;
public class Test 
{
	public static void main(String[] args) 
	{
		ISwitch sw=	 LightFactory.getLight("Tublight");
		if(sw!=null)
		{
			sw.sOn();
			sw.sOff();
		}
	}
}
