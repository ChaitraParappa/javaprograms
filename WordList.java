import java.util.*;
import java.io.*;

class WordList
{ 
    static Scanner x1=null;
      public static void main(String[] args)
        {
         Scanner x=new Scanner(System.in);
         String st[]=new String[7];
          int i=0;
         try{
          
          
         x1 = new Scanner(new File("word.txt"));
        x1.useDelimiter(",");
              }
         catch(Exception e){
        System.out.println("Could not find file");
          }
        while(x1.hasNext()){
    
        String id = x1.next();
          st[i]=id;    
          i++;
            }
           for(int j=0;j<st.length;j++)
            {
               System.out.print(st[j]+" ");
            }
            
              sort(st);
            System.out.println("Enter the key");
            String key=x.next();
               int in=binarysearch(st,key);
            if(in==-1)
             System.out.println("key not found");
               else
             System.out.println("key found at index "+(in-1));
             
            }


       static void sort(String st1[])
         {
             Arrays.sort(st1);
            System.out.println("after sorting");
          for(int l=0;l<st1.length;l++)
             {
               System.out.print(st1[l]+" ");
              }
               System.out.println();
          }
        
       static int binarysearch(String st1[],String k)
          {
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
        




}
          
