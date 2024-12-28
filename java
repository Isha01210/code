import java.util.Scanner;
class Calculator
{ //Instance variables
int num1;
int num2;
//static variable
static int result;

//Constructor
public Calculator(int num1, int num2)
{
this.num1=num1;
this.num2=num2;
}}
public void add()
{
result=this.num1+this.num2;
}
public void subtract()
{
result=this.num1+this.num2;
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number.");
int num1 = sc.nextInt();
System.out.println("Enter second number.");
int num2 = sc.nextInt();
Calculator calc=new Calculator(num1,num2);
calc.display();
System.out.println(result);
}

