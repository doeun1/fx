package sreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample3 {
	
	static int sum=0; 
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("최재영", 90), new Student("김상민", 82), new Student("민해주", 88),
				new Student("최형준", 86));
		Stream<Student> students = list.stream();
		students.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				sum = t.score+sum;
			}
			
		});
		System.out.println(sum);
		// foreach(총점수,ㅠㅕㅇ균ㅇ=);
	}
}
