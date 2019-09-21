package crisp_p1;
import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data, a, b, c, d;
		
		System.out.println("Enter a 4 digit number to be encrypted:");
		data = scnr.nextInt();
		
		a = data / 1000;
		b = (data / 100) % 10;
		c = (data / 10) % 10;
		d = data % 10;
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		System.out.printf("%d%d%d%d\n", c, d, a, b);
		
		scnr.close();

	}

}