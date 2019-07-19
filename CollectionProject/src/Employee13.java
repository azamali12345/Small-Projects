
public class Employee13 
{
int Eid;
String Ename;
double Esal;
public Employee13(int eid, String ename, double esal) 
{
	Eid = eid;
	Ename = ename;
	Esal = esal;
}


@Override
public String toString() 
{
	return "EMPLOYEE [ID= "+Eid+", NAME= "+Ename+" SALARY= "+Esal+"]";
}


/*
@Override
public int hashCode() 
{
	return this.Eid;
}
*/


/*
@Override
public int hashCode() 
{

	return this.Ename.hashCode();
}
*/


@Override
public int hashCode()
{
	Double d=this.Esal;
	return d.hashCode();
}


@Override
public boolean equals(Object obj)
{
	return this.hashCode()==obj.hashCode();
}









}
