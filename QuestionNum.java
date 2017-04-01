import java.util.Scanner;
class QuestionNum
{ 
       public static void main(String[] args)
           {
              String yes="yes",no="no";
              int n=Integer.parseInt(args[0]);
              int pw=2;
              for(int i=0;i<n;i++)
               {
                  pw=pw*2;
                }
               n=pw;
           
              int j=binary(0,n-1);
              System.out.println("the number is "+j);              
            }
            
             static int binary(int low,int high)
                {
                  String yes="yes",no="no";
                  Scanner sc=new Scanner(System.in);
                   if(high-low==1)
                     return low; 
                   int mid=(low+high)/2;
                   System.out.println("Is your number less than "+mid);
                   String b=sc.next();
                    if(b==yes)
                     return binary(low,mid);
                       else
                     return binary(mid,high);
                 }
             
                   
 }
                  



 


