import java.util.Scanner;
class Calc
{
float first_number, second_number, add_result, sub_result, mult_result, div_result;

public void action()
	{
	add_result=first_number+second_number;
	sub_result=first_number-second_number;
	mult_result=first_number*second_number;	
	div_result=first_number/second_number;
	}
}

public class Calculator
{
public static void main(String[] args)

{

Calc obj = new Calc();

System.out.println("Enter the first number ");
Scanner input1 = new Scanner(System.in);
obj.first_number = input1.nextInt();

System.out.println("Enter the second number ");
Scanner input2 = new Scanner(System.in);
obj.second_number = input2.nextInt();

System.out.println("Enter 1 for Addition");
System.out.println("Enter 2 for Subtraction");
System.out.println("Enter 3 for Multiplication");
System.out.println("Enter 4 for Division");

Scanner input = new Scanner(System.in);
int selection = input.nextInt();

	switch(selection)
	{
		case 1:
		obj.action();
		System.out.print(obj.add_result);
		break;

		case 2:
		obj.action();
		System.out.print(obj.sub_result);
		break;

		case 3:
		obj.action();
		System.out.print(obj.mult_result);
		break;

		case 4:
		if(obj.second_number==0)
		{
		System.out.println("You should not divide a number by zero");
		break;
		}
		obj.action();
                System.out.println(obj.div_result);
		break;

		default:
		System.out.println("Invalid Selection");
	}

}
}
