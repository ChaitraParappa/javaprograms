import java.util.*;
import java.io.*;
class Utility
{
 
  public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         util u=new util();
       long sta=0,sp=0;
       
       int i[]={6,8,3,1,8,9,5,4};
       String s[]={"mango","apple","orange","grapes","pineapple"};
       System.out.println("The integer numbers");
        for(int j=0;j<i.length;j++)
         {
          System.out.print(i[j]+" ");
          }
         System.out.println();
          System.out.println();
        
        System.out.println("The Strings ");
        for(int k=0;k<s.length;k++)
         {
            System.out.print(s[k]+" ");
          }
         System.out.println();
         System.out.println();

          u.binsrch4Int(i,8);
          System.out.println();

         int a=u.binsrch4Strng(s,"apple"); 
         System.out.println("key found at "+a);
         System.out.println();
           
         u.intertsrtn4Int(i);
         System.out.println();

         u.intertsrt4Strng(s);
         System.out.println();

         u.bubble4Int(i);

         u.bubble4Strng(s);
         System.out.println();

      }
 }


class util
{

         void binsrch4Int(int a[],int key)
            {  
               System.out.println("binary search for integer ");  
               int n=8;
               int first  = 0;
               int last   = n - 1;
               int middle = (first + last)/2;
               while( first <= last )
                  {
                     if ( a[middle] < key )
                     first = middle + 1;    
                     else if ( a[middle] == key ) 
                      {
                      System.out.println(key + " found at location " + (middle + 1) + ".");
                       break;
                       }
                     else
                     last = middle - 1;
                     middle = (first + last)/2;
                  }
               if ( first > last )
              System.out.println(key + " is not present in the list.\n");
        }

      int binsrch4Strng(String st1[],String k)
        {
          System.out.println("binary search for strings "); 
             // Arrays.sort(st1);
           return search(k,st1, 0, st1.length);
         }
       static int search(String key, String a[], int low, int high) 
         {

               if (high <= low) return -1;
               int mid = low + (high - low) / 2;
              int cmp = a[mid].compareTo(key);
               if(cmp > 0) 
                   return search(key, a, low, mid);
               else if (cmp < 0) 
                   return search(key, a, mid+1, high);
               else              
                   return mid;
         }

         void intertsrtn4Int(int array[])
         {
           System.out.println("insertion sort for integers");
             int n = array.length;  
             for(int j=1;j<n;j++)
               {  
                   int key=array[j];  
                   int i=j-1;  
                   while((i>-1)&&(array[i]>key))
                  {  
                     array[i+1]=array[i];  
                      i--;  
                  }  
                      array[i+1] = key; 
                }
                System.out.print("After sorted "); 
              for(int k=0;k<array.length;k++)
              {
                 System.out.print(array[k]+ " ");
              }
               System.out.println();
         }

          void intertsrt4Strng(String st[])
          {
             System.out.println("insertion sort for strings");
             for(int i=1;i<st.length;i++)
                {
                     String item = st[i];
                     int j = i;
                   while (j > 0 && item.compareTo(st[j - 1]) < 0)
                       {
                         st[j] = st[j- 1];
                         j--;
                       }
                    st[j] = item;
                }
            System.out.print("After sorted "); 
              for(int k=0;k<st.length;k++)
              {
                 System.out.print(st[k]+ " ");
              }
               System.out.println();

           }

           void bubble4Int(int arr[])
            {  
                System.out.println("bubble sort for integers");  
                int n = arr.length;  
                int temp = 0;  
                for(int i=0; i < n; i++)
                   {  
                     for(int j=1; j < (n-i); j++)
                         {  
                           if(arr[j-1] > arr[j])
                                {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                                 }  
                          }
                    } 
                 System.out.print("After sorted "); 
                 for(int k=0;k<arr.length;k++)
                   {
                     System.out.print(arr[k]+ " ");
                   }
                  System.out.println();
            }
           
            void bubble4Strng(String array[])
              { 
                    System.out.println("bubble sort for strings");
                     String temp;
                     for(int i=0; i<array.length; i++)
                          {
                            for(int j=0; j<array.length-1-i; j++)
                              {
                                 if(array[j].compareTo(array[j+1])>0)
                                    {
                                       temp = array[j];
                                       array[j] = array[j+1];
                                       array[j+1] = temp;
                                    }

                               }
                           }
                      System.out.print("After sorted "); 
                     for(int k=0;k<array.length;k++)
                      {
                        System.out.print(array[k]+ " ");
                       }
                      System.out.println();
              }  





 
} 

