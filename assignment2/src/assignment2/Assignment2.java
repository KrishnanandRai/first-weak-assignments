
package assignment2;
import java.util.Scanner;
/**
 *
 * @author knrai
 */
public class Assignment2 {

    public static void main(String[] args) {
        
     // question no. 1
      System.out.println("OUTPUT OF QUESTION NO. 1 ");
         int i=6, j, fact=1;
          j=i;
          
          while( j>=1)
          {   
              fact= fact*j;
              j--;
               
          }
          System.out.println("factorial of " +i +" is: " +fact );
          
       //question no. 2
       System.out.println(" ");
       System.out.println("OUTPUT OF QUESTION NO. 2 ");
       int n= 589465, m=0,temp;
       temp = n;
       while(temp!= 0)
       {m = m*10 + temp%10;
         temp = temp/10;}
       System.out.println("Reverse of no. " +n +" is: " +m );
       
       
       
          //question no. 3
          System.out.println(" ");
          System.out.println("OUTPUT OF QUESTION NO. 3 ");
                
           int low=0,high=1;
            System.out.print(low+" ");
             while(high<300){
               System.out.print(high+" ");
                high=low+high;
                low=high-low;
                    
           
             }
             System.out.println("");
         
           
           
           //question no. 4
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 4 ");
             n=1634;temp=0;
            int k=n,h=n,digitpower;
            while(k!=0){
                digitpower=1;
                while(h!=0){
                    digitpower*=k%10;
                    h/=10;
                }
                h=n;
                k/=10;
                temp+=digitpower;
                       
            }
            
            if( temp==n)
                System.out.println(n+" is armstrong");
            else
                System.out.println(n+" is not armstrong");
            
            
            
            
            
            //question no. 5
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 5 ");  
            
           Scanner reader = new Scanner(System.in);
           System.out.println(" enter 3 numbers ");
           
           int int1= reader.nextInt();
           int int2= reader.nextInt();
           int int3= reader.nextInt();
           
           if (int1 > int2 && int1> int3){
               
                   System.out.println(int1 +" is largest number  ");}
                   
                   
              
               else if(int2 > int1 && int2 > int3)
                       {
                   System.out.println(int2 + " is largest numbur ");
               }
           
               else if(int3 > int1 && int3 > int2)
           {System.out.println(int3 +" is largest number ");
           }
               else{
                   System.out.println(" given numbers are not distinct ");
               }
              
               }
}
          
          
          
          
          
          
          
         
         
    
    

