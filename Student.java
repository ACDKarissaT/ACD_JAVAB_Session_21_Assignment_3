package a20_3;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Student {
	

	private int stud_id;
	

	private String stud_name;
	

	private int stud_marks;
	
	private Date stud_join_date;
	
	public Student() {
		
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getStud_marks() {
		return stud_marks;
	}

	public void setStud_marks(int stud_marks) {
		this.stud_marks = stud_marks;
	}

	public Date getStud_join_date() {
		return stud_join_date;
	}

	public void setStud_join_date(Date stud_join_date) {
		this.stud_join_date = stud_join_date;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_marks=" + stud_marks
				+ ", stud_join_date=" + stud_join_date + "]";
	}
	
	
}
