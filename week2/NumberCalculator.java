package week2;

public class NumberCalculator 
{
public int add(int a, int b)
{
  return(a+b);
}
public int sub(int a, int b) 
{
  return (a-b);
}
public int mul(int a, int b) 
{
  return (a*b);
}
public double div(double a, double b) 
{
  return (a-b);
}
public static void main (String[] args) 
{
	NumberCalculator Calculator = new NumberCalculator();
	System.out.println(Calculator.add(12,55));
	System.out.println(Calculator.sub(12,55));
	System.out.println(Calculator.mul(12,55));
	System.out.println(Calculator.div(12,55));
}
}
