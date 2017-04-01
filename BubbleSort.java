import java.util.Scanner;
class BubbleSort
{
     public static void main(String[] args)
       {
               	  Scanner sc=new Scanner(System.in);
          	  System.out.println("Enter the number");
                  int n=sc.nextInt();
                  int a[]=new int[n];
                  System.out.println("enter the numbers for sorting"); 
                  for(int i=0;i<n;i++)
                      {
                         a[i]=sc.nextInt();
                      }
                  System.out.println();
                  System.out.println("before sorting"); 
                  for(int j=0;j<n;j++)
                      {
                         System.out.print(a[j]+" ");
                      }
                  bubblesort(a);
       }
 
        static void bubblesort(int b[])
             {  
                   int n = b.length;  
                   int temp = 0;  
                   for(int i=0;i<n;i++)
                      {  
                         for(int j=1;j<(n-i);j++)
                            {  
                               if(b[j-1]>b[j])
                                   {  
                                       temp=b[j-1];  
                                       b[j-1]=b[j];  
                                       b[j]=temp;  
                                   }  
                            }  
                       }
                    System.out.println();
                    System.out.println("after sorting"); 
                    for(int k=0;k<n;k++)
                     {
                        System.out.print(b[k]+" ");
                     } 
               }
} 
            
