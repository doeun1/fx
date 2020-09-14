package sreams.intermediate;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class reduceExample {
	public static void main(String[] args) {
		// 사원의 평균급여를 계산
		List<Employee> empList = EmpDAO.getEmpLists();
		// 전체 사원의 컬렉션을 통해 stream생성
		Stream<Employee> stream = empList.stream();
		// Employee -> Intstream 매핑
//		OptionalDouble avg = stream.flatMapToInt(new Function<Employee, IntStream>() {
//
//			@Override
//			public IntStream apply(Employee t) {
//				return IntStream.of(t.getEmployeeId());
//			}
//			
//		}).average();
//		System.out.println("평균 급여는 : "+ avg);
		
		OptionalDouble avg = stream.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getEmployeeId()== ;
			}
			
		}).flatMapToInt(new Function<Employee, IntStream>() {
			@Override
			public IntStream apply(Employee t) {
				return IntStream.of(t.getEmployeeId());
			}
			
		}).average();
	}
}
