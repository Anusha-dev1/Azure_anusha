import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		

	}

}
