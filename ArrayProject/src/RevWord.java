class RevWord
{
    public static void main(String args[])
    {
    	
        String s="Hello Azam Welcome In Bridge Lab";
        String w="",rs="";
        char ch;
        int l,i;
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