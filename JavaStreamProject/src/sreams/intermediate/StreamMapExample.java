package sreams.intermediate;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import common.EmpDAO;
import common.Employee;

public class StreamMapExample {
	public static void main(String[] args) {
		List<common.Employee> employees = EmpDAO.getEmpLists();
		Stream<common.Employee> stream = employees.stream();
		// salary가 10000이상인 사원 출력
//		LocalDate date = LocalDate.of(2020, 5, 1);
//		//2020-05-01
//		date.format(DateTimeFormatter.ISO_DATE);//데이트타입 -> 문자열.
//		LocalDate.parse("2020-05-05", DateTimeFormatter.ISO_DATE);//문자열 - > 데이트

//		Optional<common.Employee> op =
//		stream.filter(new Predicate<common.Employee>() {
//
//			@Override
//			public boolean test(common.Employee t) {
//				return t.getHireDate().getYear() > 1995;
//			}
//
//		}).forEach(new Consumer<common.Employee>() {
//
//			@Override
//			public void accept(Employee t) {
//				System.out.println(t);
//			}
//
//		});
//		
//		
	}
}

// reduce(new BinaryOperator<common.Employee>() {
//
//			@Override
//			public Employee apply(Employee t, Employee u) {
//				// TODO Auto-generated method stub
//				return t.getSalary() > u.getSalary() ? t:u;
//			}
//		});
//		System.out.println(op);
//	}
