package common.excel;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class ExcelExample {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      EmployeeExcelWriter writer = new EmployeeExcelWriter();
      
         List<Employee> list = EmpDAO.getEmpLists();
         List<Employee> ls =list.stream().filter(new Predicate<Employee> () {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
        	 
         }).collect(Collectors.toList());
         
         
         
         writer.xlsWriter(ls);
         System.out.println("엑셀완료");
   }

}