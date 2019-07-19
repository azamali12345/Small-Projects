//Call by Value and Call by Reference in Java
public class MainExp4 
{
	        int data=50;  
	        void change(int data)
	        {  
	        data=data+100;//changes will be in the local variable only  
	        } 
	            
	        public static void main(String args[]){  
	          MainExp4 ob=new MainExp4();  
	         
	          System.out.println("before change "+ob.data);  
	          ob.change(500);  
	          System.out.println("after change "+ob.data);  
	         
	        }  
	         

	

}
