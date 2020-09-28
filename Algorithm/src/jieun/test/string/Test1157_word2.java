package jieun.test.string;
// 알파벳 대소문자로 된 단어가 주어지면, 
// 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
// 단, 대문자와 소문자를 구분하지 않는다.
import java.io.*;
public class Test1157_word2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphabet = new int[26];
		char[] word = br.readLine().toCharArray();
		
		for(int i = 0; i < word.length; i++) {
			int code = word[i];
			if(code > 'Z') 
				alphabet[code - 'a']++;
			else 
				alphabet[code - 'A']++;
		}
		
		int maxIndex = 0, maxCount = 0, check = 0;
		for(int i = 0; i < alphabet.length; i++) {
			if(maxCount == alphabet[i])
				check++;
			if(maxCount < alphabet[i]) {
				maxCount = alphabet[i];
				maxIndex = i;
				check = 0;
			}
		}

		char result ='?';
		if(check == 0)
			result = (char)(maxIndex+65);
		System.out.println(result);
	}
}
