package a2s11197826.s2s11197526.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "vaxdata")
public class vaxData
{
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
	private String full_name;
    private String c_id;
    private String fathers_name;
    private String address;
    private String email;
    private String gender;
    private String city;
    private String date_of_vaccination;
    private String nearest_venue;
    private String shot_type;
    private String premed_cond;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public String getC_id() {
        return c_id;
    }
    public void setC_id(String c_id) {
        this.c_id = c_id;
    }
    public String getFathers_name() {
        return fathers_name;
    }
    public void setFathers_name(String fathers_name) {
        this.fathers_name = fathers_name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDate_of_vaccination() {
        return date_of_vaccination;
    }
    public void setDate_of_vaccination(String date_of_vaccination) {
        this.date_of_vaccination = date_of_vaccination;
    }
    public String getNearest_venue() {
        return nearest_venue;
    }
    public void setNearest_venue(String nearest_venue) {
        this.nearest_venue = nearest_venue;
    }
    public String getShot_type() {
        return shot_type;
    }
    public void setShot_type(String shot_type) {
        this.shot_type = shot_type;
    }
    public String getPremed_cond() {
        return premed_cond;
    }
    public void setPremed_cond(String premed_cond) {
        this.premed_cond = premed_cond;
    }
    public vaxData() {
    }
    
    
   
    

}
