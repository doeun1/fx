package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static List<Department> getDeptList() throws SQLException {
		Connection conn = DBConnection.getConnection();
		List<Department> list = new ArrayList<>();
		String sql = "select * from departments";
		PreparedStatement stmt =  conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Department dept = new Department(
					rs.getInt("department_id"),
					rs.getString("department_name"),
					rs.getInt("manager_id"),
					rs.getInt("location_id")
			);		
		}
		
		return list;
	}
}
