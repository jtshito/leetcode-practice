package leetcode;
import java.util.*;
import java.*;

public class hamming {

	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		int n = 15;
		
		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 && i % 5 == 0){
				result.add("FizzBuzz");
				continue;
			}
			if(i % 3 == 0){result.add("Fizz");continue;}
			if(i % 5 == 0){result.add("Buzz");continue;}
			result.add(Integer.toString(i));
			
		}
		for(int i = 0; i < n;i++){
			System.out.println(result.get(i));
		}
	}

}
