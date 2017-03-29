import java.lang.*;
import java.util.Scanner;

class FlipCoin{
     public static void main(String[] args){
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of times to flipcoin");
         int n=sc.nextInt();
         int hc=0,tc=0,hp=0,tp=0;
         for(int i=0;i<n;i++)
            {
              double x=Math.random();
             System.out.println("Random numbers generated are "+x); 

              if(x<0.500000000000000000000)
               {
                 hc++;
               }
               else
               {
                 
                  tc++;
               }
             }
                       

              hp=((hc/n)*100);
              tp=((tc/n)*100);
              
             System.out.println("the percentage of head count is "+hp);
             System.out.println("the percentage of tail count is "+tp);
           
             }
}

                



         
        
