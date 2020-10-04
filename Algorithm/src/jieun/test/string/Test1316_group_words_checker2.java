package jieun.test.string;
import java.io.*;
public class Test1316_group_words_checker2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		while(number-- > 0) {
			String input = br.readLine();
			boolean[] alpha = new boolean[26]; // 소문자 알파벳
			boolean checker = true;
			char prev = input.charAt(0);
			alpha[prev - 97] = true;
			for(int i = 1; i < input.length(); i++) {
				char current = input.charAt(i);
				if(!alpha[current - 97] && current != prev) {
					alpha[current - 97] = true;
					prev = input.charAt(i);
				}
				else if(alpha[current - 97] && current != prev) {
					checker = false;
					break;
				}
			}
			if(checker) count++;
		}
		System.out.println(count);
		br.close();
	}
}
