package sreams.intermediate;

import java.util.Objects;

public class Student implements Comparable <Student> {
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		//return this.score;
		
		return Objects.hash(this.name,this.score);
		//위에거랑 같은 뜻 return Objects.hashcode(this.name) + this.score;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student that = (Student) obj;
			return this.name.equals(that.name) && this.score==that.score;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Student that) {
		return this.score - that.score;
	}
	
	
}
