package common;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/
//sql의 모든 걸 임포트 해주겠다
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EmpDAO {
//입력
	
	
	
	public static List<Employee> getEmpLists() {
		Connection conn = DBConnection.getConnection();// 필드안에 카피해도 되지만 클래스 바로 밑에 입력하면 모든 필드 적용됨
//		insert into emp_temp(employee_id, last_name, email, hire_date, job_id)
		String sql = "select * from employees" ;
		ObservableList<Employee> list = FXCollections.observableArrayList();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {// 여기 안에서 돌면서 배열에 하나하나 넣을거임
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getDate("hire_date").toLocalDate());
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			
				list.add(emp);
			}
			
			System.out.println("--end of data--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//	public void updateEmp(Employee emp) {
//		Connection conn = DBConnection.getConnection();
//		String upd= "update emp_temp set salary="+emp.getSalary()+"where employee_id="+emp.getEmployeeId();
//		System.out.println(upd);
//		
//		try {
//			PreparedStatement psmt = conn.prepareStatement(upd);
//			int r = psmt.executeUpdate();
//			System.out.println(r+"건 수정되었습니다.");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	public void removeEmp(int empId) {//삭제하기
//		
//		Connection conn = DBConnection.getConnection();
//		String del= "delete from emp_temp where employee_Id="+ empId;
//		System.out.println(del);
//		
//		
//		
//		try {
//			PreparedStatement psmt = conn.prepareStatement(del);
//			int r = psmt.executeUpdate();
//			System.out.println(r+"건 삭제되었습니다.");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	public List<sreams.intermediate.Employee> getEmpList() {
//		Connection conn = DBConnection.getConnection();
//		Employee[] employees = new Employee[100];// 나중엔 배열안씀 ㅠㅠ 배열도 이해못했는데,,,,,,,,,ㅠㅠㅠㅠ
//		try {
//			String sql = "select * from emp_temp";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			int idx = 0;
//			while (rs.next()) {// 여기 안에서 돌면서 배열에 하나하나 넣을거임
//				Employee emp = new Employee(idx, sql, sql, sql, null, sql, idx);// 에러난 이유는 메인값이 없는 ? 기본 생성자를 안만들어줘서 그럼
//				String firstName = rs.getString("first_name");
//				emp.setFirstName(firstName);// 이렇게 해도 되지만
//				emp.setLastName(rs.getString("last_name"));// 이렇게 해도 됨? 망했다,,,
//				emp.setEmployeeId(rs.getInt("employee_id"));
//				emp.setSalary(rs.getInt("salary"));
//				emp.setEmail(rs.getString("email"));
//				emp.setJobId(rs.getString("job_id"));
//				emp.setHireDate(rs.getString("hire_date"));
//				emp.setPhoneNumber(rs.getString("phone_number"));
//
//				employees[idx++] = emp;
//			}
//			System.out.println("--end of data--");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return employees;// 배열 반환,,,ㅠㅠ//에러 이유: 임플로이즈라는 변수가 변수로 이해가 안되서 ?
//	}// end of getEmpList()
//
////	public static void main(String[] args) {
////		DBConnection dbCon = new DBConnection();
////		Connection conn= DBConnection.getConnection();//static 타입이라서 바로 호출 가능?
//	/*
//	 * try { String sql = "select * from emp_temp"; PreparedStatement pstmt =
//	 * conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery();
//	 * while(rs.next()) { System.out.println(rs.getString("first_name") +","+
//	 * rs.getString("last_name") +","+rs.getString("email") +","+rs.getInt("salary")
//	 * ); } System.out.println("--end of data--"); } catch (SQLException e) { //
//	 * TODO Auto-generated catch block e.printStackTrace(); }
//	 */
////		System.out.println("프로그램 종료.");
////	}//end of main()
//}// end of class
}