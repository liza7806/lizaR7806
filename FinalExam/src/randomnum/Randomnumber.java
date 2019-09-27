package randomnum;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Randomnumber {
	Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> ts = new TreeSet<Integer>();
		Random rand = new Random();

		for (int i = 0; ts.size() < 500; i++) {
			int randomNum = rand.nextInt(700);
			ts.add(randomNum);

		}
		for (int item : ts) {

			System.out.println(Integer.toString(item));

		}
		System.out.println("total random numbers = " + ts.size());

	}

}
