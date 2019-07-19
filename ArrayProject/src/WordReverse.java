import java.util.*;
class WordReverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s, w="",rs="";
        char ch;
        int l,i;
        System.out.println("Enter the sentence: ");
        s = sc.nextLine();
        s= s+" ";
        l = s.length();
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
                w=ch+w;
            else
            {
                rs = rs + " " + w;
                w="";
            }
        }
        System.out.println("Result is: " + rs.substring(1));
        
    }
}