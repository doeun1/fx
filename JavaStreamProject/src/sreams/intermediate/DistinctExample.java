package sreams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		String[] strAry = {"Hong","Park","Choi","Kim","Hong"};
		Stream<String> sStream = Arrays.stream(strAry);
		sStream.distinct().forEach(System.out::println);	
		
		sStream = Arrays.stream(strAry);
		
//		sStream.distinct().forEach(System.out::println);//distinct메소드는 중복값은 거르고 출력
		Student[] students = {new Student("이화진",70), 
				new Student("aa",50),
				new Student("ss",60),
				new Student("dd",30)};
	
		Stream<Student> tStream = Arrays.stream(students);
//		tStream.distinct().forEach(System.out::println);
//		tStream.sorted().forEach(System.out::println);
		tStream.sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.score-o1.score;
			}
			
		}).forEach(System.out::println);
	}
}
