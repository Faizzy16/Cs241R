package A2_S11197826.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "vaxdata")
public class Vaccine
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String CitizenID;

	@Column(name="VaccineID")
    private String VaccineID;
	
	   private String Fname;
	     @Column(name="fname")
	
    private String Dateofvaccination;
    @Column(name="dateofvaccination")
    
    
    private String vaccinationType;
    //@Column(name="VaccineType")
    
    
    
public Vaccine () {}
 
	
}

