/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.Scanner;

/**
 *
 * @author knrai
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//question no. 1
         System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 1");  
           
            Scanner reader = new Scanner(System.in);
           System.out.println(" enter 3 numbers ");
           
           int int1= reader.nextInt();
           int int2= reader.nextInt();
           int int3= reader.nextInt();int a;
            int largest = int3 > ( a = int2 > int1 ? int2 : int1 ) ? int3 : a;
            System.out.println(largest +" is largest number");
            
            
          
            




 //question no. 2
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 2");
           int n= 121, m=0,temp;
       temp = n;
       while(temp!= 0)
       {m = m*10 + temp%10;
         temp = temp/10;}
       if(n==m){
       
           System.out.println(n +" is a Palindrome number");
       }
       else{
           System.out.println(n +" is not a Palindrome number");
       }
        
       
        
           
          
           
       
//question no. 3
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 3");
       
         n=5;
            n--;
        int x=0,y;
        
        for(y=n;y>=0;y--){
            for(x=0;x<=2*n;){
                if((x<=2*n-y)&&(x>=y)){
                    System.out.print("* ");
                    x+=2;
                }
                else{
                    System.out.print(" ");
                    x++;
                }
                    
            }
               System.out.println(" "); 
            }
                   
        
           
          
          
          
          
          
          
          
        
//question no. 4
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 4");
                     
           n=5;
                            for(y=(n-1); y>=0; y--)
                            {
                                for(x=0; x<=4*(n-1); x++)
                                {
                                    if(x>=2*(n-1-y) &&x<=2*(y+n-1) &&(x%2==0) ){
                                          System.out.print("*");
                       
                   }
                   else
                   {
                       System.out.print(" ");
                   }
               }
                   System.out.println(" ");
                     }
                            
                            
                            
                            
                            
                        
         
               
                            
//question no. 5
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 5");
           n=5;
           for(y=2*(n-1);y>=0;y--){
            for(x=0;x<=2*(2*n-1); x++){
                if(x>=2*(n-1-y) &&x<=2*(y+n-1) && x>=2*(y-(n-1))&& x<=2*((2*(n-1)-y)+(n-1))&&(x%2==0)) 
                    System.out.print("*");
                else
                    System.out.print(" ");   
            }
            System.out.println("");
                
            }
     
                  
//question no. 5
           System.out.println(" ");
           System.out.println("OUTPUT OF QUESTION NO. 5");
           n=5;
           for(y=2*(n-1);y>=0;y--){
            for(x=0;x<=2*(2*n-1); x++){
                if(x>=2*(n-1-y) &&x<=2*(y+n-1) && x>=2*(y-(n-1))&& x<=2*((2*(n-1)-y)+(n-1))&&(x%2==0)) 
                    System.out.print("*");
                else
                    System.out.print(" ");   
            }
            System.out.println("");
                
}}
}