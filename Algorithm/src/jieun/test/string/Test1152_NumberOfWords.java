package jieun.test.string;
// 단어의 개수를 구하는 문제
import java.io.*;
import java.util.StringTokenizer;
public class Test1152_NumberOfWords {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sBuilder = new StringBuilder();
		String input;
		while((input = bReader.readLine()) != null && input.length() != 0) {
			StringTokenizer st = new StringTokenizer(input.trim(), " ");
			sBuilder.append(st.countTokens());
			sBuilder.append("\n");
		}
		bWriter.write(sBuilder.toString());		
		bReader.close();
		bWriter.flush(); bWriter.close();
	}
}
