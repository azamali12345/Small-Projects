package org.btm.lightApp;

public class LightFactory 
{
public static ISwitch getLight(String type) 
{
	if(type.equalsIgnoreCase("TUBELIGHT"))
	{
		return new TublightImpl();
	}
	else if(type.equalsIgnoreCase("LED"))
	{
		return new LedImpl();
	}
	else 
	{
	System.err.println("No Light found");	
	}
	
	return null;
	
}

}
