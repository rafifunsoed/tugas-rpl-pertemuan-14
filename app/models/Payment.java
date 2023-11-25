package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Payment extends Model {
 	
	public Integer p_id;
	public Integer kd_id;
	public String email;
	public Integer total_bayar;
 	
}