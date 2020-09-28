package jieun.test.string;
// 한 단어에서 각 알파벳이 처음 등장하는 위치를 찾는 문제
import java.io.*;
public class Test10809_searchingAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] alphabet = new int[26]; // a:97
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String word = br.readLine();
		char[] wordChar = word.toCharArray();
		for(int i = 0; i < wordChar.length; i++) {
			int index = wordChar[i] - '0' -49;
			if(alphabet[index] == -1)
				alphabet[index] = i;
		}
		for(int i : alphabet) {
			sb.append(i + " ");
		}
		bw.write(sb.toString().trim());
		br.close();
		bw.flush(); bw.close();
	}
}
