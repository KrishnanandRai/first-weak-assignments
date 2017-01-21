
package first.assignment;

/**
 *
 * @author knrai
 */
public class FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // question no. 1
      System.out.println("output of question no. 1 ");
        int i=5,j=6;
        System.out.println(i+j);
        
        
        //question no. 2
        System.out.println(" ");
         System.out.println("output of question no. 2 ");
        int n = 7;
        if( n % 2 == 0)
        {System.out.println("no is even");}
        else 
        {System.out.println("no is odd");} 
        
        
        //question no. 3
        System.out.println(" ");
         System.out.println("output of question no. 3 ");
        int a = 5, b=6, temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a is: " +a);
        System.out.println("the value of b is: " +b);
        
        
        
        //question no. 4
        System.out.println(" ");
         System.out.println("output of question no. 4 ");
        int p=4, q=5;
        p = p+q;
        q = p-q;
        p = p-q;
        System.out.println("the value of p is: " +p);
        System.out.println("the value of q is: " +q);
        
        
        
        
        // question no. 5
        System.out.println(" ");
         System.out.println("output of question no. 5 ");
       boolean isprime=true;
       
          int rootof=1755;//no. to be checked
          
          int low=1,high=rootof;
          while(high-low>1)
          { int mid=(low+high)/2;
              if(mid*mid>=rootof)
              high=mid;
          else 
              low=mid;
              }
          for(j=1;j<high;j++)
          {if(rootof%j==0)
          {isprime=false;
            break;
          }
           }
          if(isprime)
              System.out.println(rootof+" is prime");
          else
               System.out.println(rootof + " is not prime");
              
            
}
        }
        
    
    

