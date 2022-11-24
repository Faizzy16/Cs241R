package a2s11197826.s2s11197526.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "vaxadmindata")
public class addvax
{
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
	private String full_name;
    private String c_id;
    private String v_id; 
    private String date_of_vaccination;
    private String shot_type;
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
    public String getV_id() {
        return v_id;
    }
    public void setV_id(String v_id) {
        this.v_id = v_id;
    }
    public String getDate_of_vaccination() {
        return date_of_vaccination;
    }
    public void setDate_of_vaccination(String date_of_vaccination) {
        this.date_of_vaccination = date_of_vaccination;
    }
    public String getShot_type() {
        return shot_type;
    }
    public void setShot_type(String shot_type) {
        this.shot_type = shot_type;
    }
    public addvax() {
    }


}