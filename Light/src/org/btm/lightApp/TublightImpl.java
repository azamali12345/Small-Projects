package org.btm.lightApp;
public class TublightImpl implements ISwitch 
{

	@Override
	public void sOn()
	{
		System.out.println("Tublight turned On");
	}

	@Override
	public void sOff() 
	{
		System.out.println("Tublight turned Off");
	}

}
