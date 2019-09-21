package crisp_p3;

import java.util.Scanner;

public class polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// List 5 things of importance
		// dogs, food, naps, Joey, cars
		
		String[] topics = new String[5];
		int[][] responses = new int[5][10];
		int users, extra, i, j, zero = 0;
	    double sumDogs = 0, sumFood = 0, sumNaps = 0, sumJoey = 0, sumCars = 0;
		
		topics[0] = "Dogs";
		topics[1] = "Food";
		topics[2] = "Naps";
		topics[3] = "Joey";
		topics[4] = "Cars";
		
		System.out.println("How many users (no more than 10) will be rating the topics?:");
		users = scnr.nextInt();
		
		if (users > 10)
		{
			System.out.println("Too many users. Goodbye.");
			System.exit(0);
		}
		
		extra = 10 - users;
		
		System.out.println("Please rate the following five topics from 1 (least important) to 10 (most important.");
		
		for (i = 0; i < users; i++)
		{
			System.out.printf("User #%d\n", i + 1);
			System.out.println("Dogs: ");
			responses[0][i] = scnr.nextInt();
			sumDogs += responses[0][i];
				
			System.out.println("Food: ");
			responses[1][i] = scnr.nextInt();
			sumFood += responses[1][i];

			System.out.println("Naps: ");
			responses[2][i] = scnr.nextInt();
			sumNaps += responses[2][i];
						
			System.out.println("Joey: ");
			responses[3][i] = scnr.nextInt();
			sumJoey += responses[3][i];
					
			System.out.println("Cars: ");
			responses[4][i] = scnr.nextInt();
			sumCars += responses[4][i];
						
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Topics   User #1   User #2   User #3   User #4   User #5   User #6   User #7   User #8   User #9   User #10   Average");
		
		System.out.println();
		for (i = 0; i < 5; i++)
		{
			System.out.print(topics[i]);
			
			for (j = 0; j < users; j++)
			{
				System.out.printf("%10d", responses[i][j]);
					
			}
			
			for (j = 0; j < extra; j++)
			{
				System.out.printf("%10d", zero);
			}
			
			if (i == 0)
				System.out.printf("%10.1f", sumDogs / users);
			else if (i == 1)
				System.out.printf("%10.1f", sumFood / users);
			else if (i == 2)
				System.out.printf("%10.1f", sumNaps / users);
			else if (i == 3)
				System.out.printf("%10.1f", sumJoey / users);
			else if (i == 4)
				System.out.printf("%10.1f", sumCars / users);
					
			System.out.println();
		}
		
		/*System.out.println();
		System.out.printf("sumDogs: %d\n", sumDogs);
		System.out.printf("sumFood: %d\n", sumFood);
		System.out.printf("sumNaps: %d\n", sumNaps);
		System.out.printf("sumJoey: %d\n", sumJoey);
		System.out.printf("sumCars: %d\n", sumCars);
		*/
		
		System.out.println();
		
		if (sumDogs >= sumFood && sumDogs >= sumNaps && sumDogs >= sumJoey && sumDogs >= sumCars)
			System.out.printf("Dogs has the highest point total of %.0f.\n", sumDogs);
		
		if (sumFood >= sumDogs && sumFood >= sumNaps && sumFood >= sumJoey && sumFood >= sumCars)
			System.out.printf("Food has the highest point total of %.0f.\n", sumFood);
		
		if (sumNaps >= sumFood && sumNaps >= sumDogs && sumNaps >= sumJoey && sumNaps >= sumCars)
			System.out.printf("Naps has the highest point total of %.0f.\n", sumNaps);
		
		if (sumJoey >= sumFood && sumJoey >= sumNaps && sumJoey >= sumDogs && sumJoey >= sumCars)
			System.out.printf("Joey has the highest point total of %.0f.\n", sumJoey);
		
		if (sumCars >= sumFood && sumCars >= sumNaps && sumCars >= sumJoey && sumCars >= sumDogs)
			System.out.printf("Cars has the highest point total of %.0f.\n", sumCars);
		
		System.out.println();
		
		if (sumDogs <= sumFood && sumDogs <= sumNaps && sumDogs <= sumJoey && sumDogs <= sumCars)
			System.out.printf("Dogs has the lowest point total of %.0f.\n", sumDogs);
		
		if (sumFood <= sumDogs && sumFood <= sumNaps && sumFood <= sumJoey && sumFood <= sumCars)
			System.out.printf("Food has the lowest point total of %.0f.\n", sumFood);
		
		if (sumNaps <= sumFood && sumNaps <= sumDogs && sumNaps <= sumJoey && sumNaps <= sumCars)
			System.out.printf("Naps has the lowest point total of %.0f.\n", sumNaps);
		
		if (sumJoey <= sumFood && sumJoey <= sumNaps && sumJoey <= sumDogs && sumJoey <= sumCars)
			System.out.printf("Joey has the lowest point total of %.0f.\n", sumJoey);
		
		if (sumCars <= sumFood && sumCars <= sumNaps && sumCars <= sumJoey && sumCars <= sumDogs)
			System.out.printf("Cars has the lowest point total of %.0f.\n", sumCars);
		
		
		scnr.close();
	}

}
