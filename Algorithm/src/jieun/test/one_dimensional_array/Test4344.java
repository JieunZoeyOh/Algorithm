package jieun.test.one_dimensional_array;
// 평균은 넘겠지
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
// 당신은 그들에게 슬픈 진실을 알려줘야 한다.
import java.io.*;
public class Test4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int caseNum = Integer.parseInt(br.readLine()); // 총 과목 수
		String[] caseTest = new String[caseNum];
		
		for(int i = 0; i < caseTest.length; i++) {
			caseTest[i] = br.readLine();
		}
		
		for(String test : caseTest) {
			int sum = 0;
			String[] arr = test.split(" ");
			int numberOfStudents = Integer.parseInt(arr[0]);
			for(int i = 1; i < arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			double avg = (double)sum / numberOfStudents;
			int count = 0;
			for(int i = 1; i < arr.length; i++) {
				if(Integer.parseInt(arr[i]) > avg)
					count++;
			}
			System.out.printf("%.3f", (double)count/numberOfStudents * 100);
			System.out.println("%");
		}
		br.close();
	}
}