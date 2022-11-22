package vaccination;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String ename;
    private int mobile;
    private String vaccinetype;

    public Citizen() {
	
	}
	public Citizen(Long id, String ename, int mobile, String vaccinetype) {
	
		this.id = id;
		this.ename = ename;
		this.mobile = mobile;
		this.vaccinetype = vaccinetype;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getvaccinetype() {
		return vaccinetype;
	}
	public void setvaccinetype(String vaccinetype) {
		this.vaccinetype = vaccinetype;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", mobile=" + mobile + ", vaccinetype="  + "]";
	}
}