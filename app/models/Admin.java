package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Admin extends Model {
 	
	public Integer id ;
	public String admin_nama;
	public String admin_notelp;
	public String admin_email;
 	
}