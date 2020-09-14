package streams.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseGroupby {
	public static void main(String[] args) {
		//직무 - 사원이름
		List<Employee> employees = EmpDAO.getEmpLists();
//		Map<String, List<Student>> map;
		
		Map<String, List<Employee>> gMap = employees.stream().collect(Collectors.groupingBy(new Function<Employee, String>(){

			@Override
			public String apply(Employee t) {
				return t.getJobId();
			}
			
		}, Collectors.toList()));
		
		Set<String> set = gMap.keySet();
		for (String g : set) {
			System.out.println(g);
			List<Employee> set1 = gMap.get(g);
			for(Employee e : set1) {
				System.out.println(e);
			}
		}

		
	}
}
