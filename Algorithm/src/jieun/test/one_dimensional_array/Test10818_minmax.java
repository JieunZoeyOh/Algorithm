package jieun.test.one_dimensional_array;
// 최솟값과 최댓값을 찾는 문제
import java.io.*;
public class Test10818_minmax {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine(), 10);
		String[] numbers = br.readLine().split(" ");
		int max = Integer.parseInt(numbers[0]);
		int min = Integer.parseInt(numbers[0]);
		for(int i = 1; i < num; i++) {
			if(Integer.parseInt(numbers[i]) > max) 
				max = Integer.parseInt(numbers[i]);
		
			if(Integer.parseInt(numbers[i]) < min)
				min = Integer.parseInt(numbers[i]);
		}
		System.out.println(min + " " + max);
	}
}
