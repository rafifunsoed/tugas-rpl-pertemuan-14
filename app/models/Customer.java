package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Customer extends Model {
 	
	public Integer customer_id;
	public String customer_nama;
	public Integer customer_notelp;
	public String customer_alamat;
	public String customer_email;
 	
}