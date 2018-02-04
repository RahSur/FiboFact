
package learning;

import java.util.Scanner;

public class Learning {
     Scanner s = new Scanner(System.in);

 public void fiboSeries()
 {
      int a=0,b=1;
        System.out.println("Fibo Series");
        System.out.print("Enter the number of terms to be generated : ");
        int n = s.nextInt();
        System.out.print(a +" "+ b + " ");
        for(int i=1;i<n;i++)
        {
            int c = a+b; a=b; b=c;
            System.out.print(c+" ");
        }
 }
    public void factorial()
    {
        System.out.println("\nFactorial");
        System.out.print("Enter a number : ");
        int f = s.nextInt();
        int fn = 1;
        for(int i=1;i<=f;i++)
        {
            fn = fn *i;
        }
        System.out.println("Factorial  : " +fn);
        
    }
    
    public static void main(String[] args) 
    {
     Learning ob = new Learning();
     ob.fiboSeries();
     ob.factorial();
    }
    
}
