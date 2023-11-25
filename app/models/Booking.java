package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Booking extends Model {
 	
	public Integer booking_id;
	public Integer booking_tanggal;
	public Integer p_id;
	public Integer kd_id;
 	
}