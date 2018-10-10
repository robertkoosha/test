import java.util.Scanner;

public class Practice
{

	public static void main(String[] args)
	{
		//printing
		System.out.print("I know how to print");
		//printing the value of a variable
		String str = "some string";
	    int num = 2;
		double decimal = 3.75; // declared and initialized
		System.out.println("\n"+num);
		System.out.println(decimal);
		System.out.println(str);
		//add 30 to num subtract 25 from decimal
		//concatinate "more stuff" to str
		num += 30;
		decimal -= 25.012345;
		str += " more stuff";
		System.out.println("num: " + num);
		System.out.println("decimal: " + decimal);
		System.out.println("str: " + str);
		//create a scanner
		Scanner user = new Scanner(System.in);
		//create new string variable. prompt user to enter favorite sport
		//print your favorite sport is _ and mine is _
		String favsport;
		System.out.print("Please enter your favorite sport");
		favsport = user.nextLine();
		System.out.print("Your favorite sport is " + favsport + ", and mine is polo.");
	}

}
