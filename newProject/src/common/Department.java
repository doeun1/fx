package common;

public class Department {
	int departmentId;
	String deparmentName;
	int managerId;
	int locationId;
	
	
	public Department(int di, String dn, int mi, int li) {}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDeparmentName() {
		return deparmentName;
	}


	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public int getLocationId() {
		return locationId;
	}


	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
}
