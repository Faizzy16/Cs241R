package a2s11197826.s2s11197526.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizen")
public class Citizen {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mail;
	private String psw;
	private String medical_condition;
	private String name;
	private String citizen_id;
	private String address;

	public Citizen() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getMedical_condition() {
		return medical_condition;
	}
	public void setMedical_condition(String medical_condition) {
		this.medical_condition = medical_condition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCitizen_id() {
		return citizen_id;
	}
	public void setCitizen_id(String citizen_id) {
		this.citizen_id = citizen_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
