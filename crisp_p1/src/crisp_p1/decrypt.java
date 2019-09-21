package crisp_p1;
import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data, a, b, c, d;
		
		
		System.out.println("Enter a 4 digit number to be decrypted:");		
		data = scnr.nextInt();
		
		a = data / 1000;
		b = (data / 100) % 10;
		c = (data / 10) % 10;
		d = data % 10;
		
		if (a >= 7)
			a = a - 7;
		else
			a = a + 3;
		
		if (b >= 7)
			b = b - 7;
		else
			b = b + 3;
		
		if (c >= 7)
			c = c - 7;
		else
			c = c + 3;
		
		if (d >= 7)
			d = d - 7;
		else
			d = d + 3;
		
		System.out.printf("%d%d%d%d\n", c, d, a, b);
		
		scnr.close();

	}

}