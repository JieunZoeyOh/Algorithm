package jieun.test.function;
// 함수를 구현해 봅시다.
// Java: long sum(int[] a); (클래스 이름: Test)
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 
// (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합
public class Test15596_sum {
	public long sum(int[] a) {
		long result = 0;
		for(int x : a) 
			result += x;
		return result;
	}
}
