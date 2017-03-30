import java.util.Scanner;
class Array
{
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
         System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
           {
             for(int j=0;j<a[i].length;j++)
               {
                 a[i][j]=sc.nextInt();
                }
            }
          display(a);
        }
       static void display(int a1[][])
        { 
           System.out.println("The 2D Array");
           for(int i=0;i<a1.length;i++)
              {
                for(int j=0;j<a1[i].length;j++)
                  {   
                     System.out.print(a1[i][j]+" ");
                   }
                   System.out.println();
               }
          }
}
