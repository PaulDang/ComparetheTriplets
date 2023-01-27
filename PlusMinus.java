package HackerRankSolution;

/*
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	                int size = arr.size();
	        float positiveCount = 0; // let positiveCount to 0
	        float negativeCount = 0;// let negativeCount to 0
	        float zeroCount = 0;// let zeroCount to 0
	        
	        for (int i = 0; i < size; i++) {
	            if(arr.get(i) > 0) {
	                positiveCount++;
	            }else if(arr.get(i) < 0) {
	                negativeCount++;
	            }else {
	                zeroCount++;
	            }
	        }
	        System.out.printf("%6f\n", positiveCount/size); // format output to have the same result as requirement
	        System.out.printf("%6f\n", negativeCount/size);
	        System.out.printf("%6f", zeroCount/size);
	    }
}

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
