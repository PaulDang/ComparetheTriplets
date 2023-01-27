package HackerRankSolution;

/*
 * Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		// Write your code here
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - 1 - i) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

}

public class Staircase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.staircase(n);

		bufferedReader.close();
	}
}
