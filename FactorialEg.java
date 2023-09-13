import java.util.Scanner;
public class FactorialEg
{
public static void main (String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter a Number.");
int num= sc.nextInt();
int temp= num;
int fact = 1;
for(; num>=1; num--)
{
fact = fact*num;
}
System.out.println("Factorial of" +num + " is = "+fact);
}
}
