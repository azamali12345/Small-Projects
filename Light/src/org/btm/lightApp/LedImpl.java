package org.btm.lightApp;
public class LedImpl  implements ISwitch
{
	@Override
	public void sOn()
	{
		System.out.println("LED Light turned on");
	}
	@Override
	public void sOff() 
	{
		System.out.println("LEd Light turned Off");
	}

}
