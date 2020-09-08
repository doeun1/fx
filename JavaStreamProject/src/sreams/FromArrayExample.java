package sreams;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromArrayExample {
	public static void main(String[] args) {
		int[] intAry = {3,6,4,9,7};
		Arrays.stream(intAry);//리턴값이 인트스트림
		IntStream iStream = Arrays.stream(intAry);
		iStream.filter(value -> value >5)
			.forEach(value-> System.out.println(value));
		
		iStream = Arrays.stream(intAry);
//		long cnt = iStream.count();//count로 봐도 되고 sum으로 봐도 됨
		long cnt = iStream.sum();
		System.out.println("cnt : "+cnt);
		iStream = Arrays.stream(intAry,0,4);
		cnt = iStream.peek(t -> System.out.println(t)).count();//peek: 중간 출력메소드
		System.out.println("cnt : "+cnt);
//		iStream.filter(new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				// TODO Auto-generated method stub
//				return value>5;
//			}
//			
//		}).forEach(new IntConsumer() {//foreach는 최종메소드
//
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//			
//		});;
	}
}
