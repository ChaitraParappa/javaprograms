import java.util.Scanner;
class Palindrome
{
     public static void main(String[] args)
      {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String st=sc.next();
        if(st.length()%2==0)
         {
           char ch[]=st.toCharArray();
           int j=ch.length-1;
           int mid=ch.length/2-1;
           System.out.println("length"+mid);
           for(i=0;i<=mid;i++)
             {
               if(ch[i]!=ch[j])
                 {
                 System.out.println("not palindrome");
                  break;
		 }
                 j--;
              }
             if(i==mid+1)
             System.out.println("palindrome");

           }else
	   {
	   char ch[]=st.toCharArray();
           int j=ch.length-1;
           int mid=ch.length/2;
           for(i=0;i<mid;i++)
             {
               if(ch[i]!=ch[j])
                 {
                 System.out.println("not palindrome");
                  break;
		 }
                 j--;
              }
             if(i==mid)
             System.out.println("palindrome");
               
            }
       }
}
























          
