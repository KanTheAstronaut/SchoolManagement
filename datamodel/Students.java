package datamodel;

import java.util.List;

public class Students {

	private String studId;
	private String name;
	private String age;
	private List<String> course;
	private String department;
	private String year;
	private double fee;
	private String paid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String string) {
		this.department = string;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	@Override
	public String toString() {
		return "Students [studId=" + studId + ", name=" + name + ", age=" + age + ", course=" + course + ", department="
				+ department + ", year=" + year + ", fee=" + fee + ", paid=" + paid + "]" + "\n";
	}

}
