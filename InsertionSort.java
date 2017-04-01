import java.util.Scanner;
class InsertionSort
{
    public static void main(String args[])
      { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of strings");
       int n=sc.nextInt();
       String st[]=new String[n];
       System.out.println("Enter the strings to sort");
       
       for(int i=0;i<st.length;i++)
        {
         st[i]=sc.next();
         }
          System.out.println();
          System.out.println("Before sorting");
         
        for(int j=0;j<st.length;j++)
        {
         System.out.print(st[j]+" ");
         }
         System.out.println();
         list(st);
      }
 
      static void list(String s[])
      {
        for(int i=1;i<s.length;i++)
         
        {
            String item = s[i];
            int j = i;
            while (j > 0 && item.compareTo(s[j - 1]) < 0)
            {
                s[j] = s[j- 1];
                j--;
            }
            s[j] = item;
         }
         System.out.println();
         System.out.println("After sorting");
          
      for(int k=0;k<s.length;k++)
        {
         System.out.print(s[k]+" ");
         }
         System.out.println();




      }
}
