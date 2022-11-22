package vaccination;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Citizen_New {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Fnames")
	private String Fnames;
	@Column(name = "Email")
	private String Email;
	@Column(name = "Address")
	private String Address;
//	@Column(name = "Date of birth")
//	private Date dob;
	@Column(name = "medicalconditions")
	private String medicalconditions;
	private String psw;
	//@Column(name = "psw")
	public Citizen_New() {}
	public int getId() {
		return id;
	}

	
	
	
	public String getFnames() {
		return Fnames;
	}
	public void setFnames(String fnames) {
		Fnames = fnames;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
	public String getMedcialconiditions() {
		return medicalconditions;
	}
	public void setMedcialconiditions(String medcialconiditions) {
		this.medicalconditions = medcialconiditions;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public void setId(int id) {
		this.id = id;
	}









	




	public Citizen_New(String fnames, String Email, String Address,Date dob, String medicalconditions,String psw) {
		super();
		Fnames = fnames;
		this.Email = Email;
		//this.dob = dob;
		this.medicalconditions = medicalconditions;
		this.psw = psw;
	}

}
