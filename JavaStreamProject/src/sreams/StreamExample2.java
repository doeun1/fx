package sreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student{
	String name;
	int score;
//	public Student(String name, int score) {}
	public String getName() {return name; }
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public int getScore() {return score;}
}
public class StreamExample2 {
	public static void main(String[] args) {
		//최재영,90/민해주 88/ 김상민 83/최형준 86
		//score >= 85 몇명인지? rcnt변수에 담기
		//리스트 츌력
		List<Student> list = Arrays.asList(
				new Student("최재영",90),
				new Student("김상민",82),
				new Student("민해주",88),
				new Student("최형준",86));
		Stream<Student> students = list.stream();
		long iCnt = students.filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.score >= 85;
			}
			
		}).peek(new Consumer<Student>() {//중간처리 메소드

			@Override
			public void accept(Student t) {
				System.out.println("peek=> "+t.name+","+t.score);
			}
			
	
	}).count();//최종처리 메소드 -> 없으면 에러남
		System.out.println("총인원"+iCnt);
}
}