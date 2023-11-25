package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Vehicle extends Model {
 	
	public Integer kd_id;
	public String kd_tipe;
	public String kd_kategori;
	public String kd_nama;
	public Integer mitra_id;
 	
}