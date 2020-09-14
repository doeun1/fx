package streams.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sreams.intermediate.Student;

public class CollectionExample {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();//set은 순서가 없음
		setStr.add(new String("최재영"));
		setStr.add(new String("민해주"));
		setStr.add(new String("김상민"));
//		for(String s : setStr) {	
//		}

		Iterator<String> iter = setStr.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("허성준",80));
		students.add(new Student("ddd",90));
		for(Student s : students) {
			System.out.println(s);
			}
		
		List<Student> studentw = new ArrayList<>();
		studentw.add(new Student("김다희",80));
		studentw.add(new Student("나",90));
		
		List<Student> studentr = new ArrayList<>();
		studentr.add(new Student("김도은",80));
		studentr.add(new Student("나",90));
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("동광희", 25);
		map.put("김시무", 26);
		Set<String> key = map.keySet();
		Iterator<String> itr = key.iterator();
		while(itr.hasNext()) {
			String k = itr.next();//key에 해당하는 값 가져옴
			System.out.println(map.get(k));// value 값을 가지고 옴
		}
		
		
		Map<String, List<Student>> stMap = new HashMap<>();//키값은 스트링ㄹ 벨류값이 리스트?
		stMap.put("남자", students);
		stMap.put("여자", studentw);
		stMap.put("재평가", studentr);
		Set<String> setk = stMap.keySet();
		for(String s : setk) {
			System.out.println(s);
			List<Student> valueList = stMap.get(s);
			for(Student st : valueList) {
				System.out.println(st);
			}
		}
	}
}
