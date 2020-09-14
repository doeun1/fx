package sreams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntExample {
	public static void main(String[] args) {
		//1~10까지 정수형 배열
		//배열로 부터 스트림 생성방법
		//스트림 생성 후 filter를 통해서 짝수값을
		//최종집계처리는 sum()을 가져오는 코드구현.
		
		int[] intAry = {1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(intAry);
		IntStream iStream = Arrays.stream(intAry);
		int sum = iStream.filter(value -> value%2==0)
		.sum();
		System.out.println(sum);
		
		
		IntStream.range(1, 10).forEach(s -> System.out.println(s));
		System.out.println("--rangeClosed");
		IntStream.rangeClosed(1, 10).filter(n -> n>5)//filter타입은 
		.forEach(System.out::println);
	}
}
