package HackerRankSolution;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	Integer ltr = 0; //Set Sum of Integer from left to right diagonal to 0
    	Integer rtl = 0; //Set Sum of Integer from right to left diagonal to 0
    	int row = arr.size(); // total rows of List
    	int col = arr.get(0).size(); // total columns of a row
    	for (int i = 0; i < row; i++) {
			ltr += arr.get(i).get(i); // get value at row i, column i then sum up 
			rtl += arr.get(i).get((col-1)-i); // get value at row i, column (col-1)-i then sum up
		}
    	return Math.abs(ltr - rtl); // returns the absolute value of subtraction ltr and rtl 
    }

}
public class DiagonalDifference {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
