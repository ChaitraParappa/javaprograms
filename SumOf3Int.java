import java.util.Scanner;
class SumOf3Int
{
       public static void main(String args[])
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the array size");
           int n=sc.nextInt();
           int a[]=new int[n];
           System.out.println("Enter the elements");
           for(int i=0;i<a.length;i++)
            {
              a[i]=sc.nextInt();
            }
            System.out.println("The array is");
            display(a);
            sum(a);
          }
         
        static void display(int a1[])
           {
             for(int i=0;i<a1.length;i++)
                {
                   System.out.print(a1[i]+" ");
                 }
                   System.out.println();   
            }
        static void sum(int a1[])
            {
               int count=0;
              for(int i=0;i<a1.length-2;i++)
                 {
                    for(int j=i+1;j<a1.length;j++)
                       { 
                          for(int k=j+1;k<a1.length;k++)
                             {
                                if(a1[i]+a1[j]+a1[k]==0)
                                  {
                                     count++;
                                    System.out.println("The triplets "+a1[i]+" "+a1[j]+" "+a1[k]);

                                   }
                              }
                        }
                   }
                   System.out.println("Count "+count);
              }
}
         

















         
