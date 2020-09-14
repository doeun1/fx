package sreams.intermediate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//맵은 신경써야한다
public class FlatMapExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.flatMap(new Function<Integer, Stream<Integer>>() {

			@Override
			public Stream<Integer> apply(Integer t) {

				return Stream.of(t * 2);
			}

		}).forEach(System.out::println);
		;
		System.out.println("------------------------------");
		

//		DoubleStream.of(0.3); 예시
		System.out.println("");
		OptionalDouble result = Employee.employees().stream().flatMapToDouble(new Function<Employee, DoubleStream>() {

			@Override
			public DoubleStream apply(Employee t) {
				return DoubleStream.of(t.getIncome());
			}
		}).filter(n -> n>2000).reduce(new DoubleBinaryOperator() {

			@Override
			public double applyAsDouble(double left, double right) {
				return left < right ? left : right;
			}
			
		});
//		}).filter(n -> n>5000).min();//filter 기준 최솟값 구하기
//}).filter(n -> n>5000).max(); // filter 기준 최댓값 구하기		
//		if(result.isPresent())
//			System.out.println("result:"+result);
//		else
//			System.out.println("결과 없음");
			
//		}).reduce(new DoubleBinaryOperator() {
//
//			@Override
//			public double applyAsDouble(double left, double right) {
//				System.out.println(left + ","+ right);
//				return left+right;
//			}
//		});
		
			
		System.out.println(result);
		System.out.println("------------------------------");
		
		
		
		System.out.println("날짜 :");
		Optional<LocalDate> result2 = Employee.employees().stream().flatMap(new Function<Employee, Stream<LocalDate>>(){

			@Override
			public Stream<LocalDate> apply(Employee t) {
				return Stream.of(t.getDateOfBirth());
			}
		}).reduce(new BinaryOperator<LocalDate>() {//min값 가져올라고 하는거임

			@Override
			public LocalDate apply(LocalDate t, LocalDate u) {
				System.out.println(t+","+u);
				return t.isBefore(u) ? t:u;
			}
			
		});
		System.out.println("min 값 : "+ result2);
//		}).forEach(System.out::println);;
		System.out.println("------------------------------");
		
		
		
		System.out.println("첫번째 이름:");
		Employee.employees().stream().flatMap(new Function<Employee, Stream<String>>() {

			@Override
			public Stream<String> apply(Employee t) {
				return Stream.of(t.getName());
			}

		}).findFirst().ifPresent(System.out::println);
		System.out.println("-----------------------------");
	}
}