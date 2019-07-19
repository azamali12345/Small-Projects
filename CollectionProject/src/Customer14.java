
public class Customer14 
{
String cName;
long cMob;
public Customer14(String cname, long cmob) 
{
	cName = cname;
	cMob = cmob;
}

@Override
public String toString() 
{
	return "["+cName+","+cMob+"]";
}

@Override
public int hashCode()
{
return ((Long)cMob).hashCode();
}

@Override
public boolean equals(Object obj) 
{
return this.hashCode()==obj.hashCode();	
}


}
