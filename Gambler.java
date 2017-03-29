import java.util.Scanner;
class Gambler
{
        public static void main(String[] args)
          {  
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the stake value");
            int stake=sc.nextInt();
            System.out.println("Enter the Goal value");
             int goal=sc.nextInt();
            System.out.println("Enter the Number of times to play");
            int n=sc.nextInt();
            double w=0,l=0;
            double wp=0,lp=0;
            for(int i=1;i<=n;i++)
             {
                  
              
                 if(stake>0 && stake<goal)
                    {
                      double x=Math.random();
                 
                       

                      if(x<0.50000)
                        {
                          
                          stake--;
                          l++;
                          
               
                         }
                        else
                         {
                           
                           stake++;
                           w++;
                           
                         }
                     }
             }
             if(stake==goal)
              w++;
            
           
          System.out.println("The number of wins are "+w);
          System.out.println("The number of loss are "+l);
            wp=((w/n)*100);
            lp=((l/n)*100);
          
          System.out.println("Win percentage "+wp);
          System.out.println("Loss percentage "+lp);
          }
}
          

      
