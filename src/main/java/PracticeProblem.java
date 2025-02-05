import java.util.Scanner;
public class PracticeProblem {
	

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String name = in.nextLine();	
		System.out.println(name);	

	}

	public static void q2() {
	Scanner in = new Scanner(System.in);
	System.out.print("In: ");
	int a = in.nextInt();
	in.nextLine();
	System.out.print("In: ");
	int b = in.nextInt();
	in.nextLine();
	System.out.println(a/b);
	System.out.println(a%b);
	
	

	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String text = in.nextLine();
		System.out.println(text + " was the text you wrote");
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num = in.nextInt();
		in.nextLine();
		System.out.println(num * 5);		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean trueFalse = in.nextBoolean();
		in.nextLine();
		System.out.println(trueFalse + " is a boolean");
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double num = in.nextDouble();
		in.nextLine();
		System.out.println(num + (-3.2));
		
	}

}
