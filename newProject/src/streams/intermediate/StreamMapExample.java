package streams.intermediate;

import java.sql.SQLException;
import java.util.List;

import common.Department;
import common.EmpDao;

public class StreamMapExample {
	public static void main(String[] args) {
		List<Department> list = null;
		try {
			list = EmpDao.getDeptList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
