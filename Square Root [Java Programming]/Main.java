import java.util.Scanner;  
class Main   
{  
    public static void main(String[] args)    
    {   
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        System.out.println(squareRoot(n));  
    }  

public static double squareRoot(int num)   
{  
    double prev,t; 
    double sqrt=num/2;  
   do
   {
     t=sqrt;
     sqrt=(t+(num/t))/2;
   }
  while((t-sqrt)!=0);
    return sqrt;  
    }  
}  
