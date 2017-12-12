import java.sql.Time;
import java.time.Duration;
import java.time.temporal.TemporalAmount;



public class Processus {
	String nomProcessus;
	Time tempArrive;
	Time duree;
	
	Processus(String nom, Time t, Time d){
		nomProcessus=nom;
		tempArrive=t;
		duree=d;
			
	}
	public String toString(){
		return(nomProcessus+" "+tempArrive+" "+duree);
	}
	
	public int ComparaTo(Processus p){
		return(this.nomProcessus.compareTo(p.nomProcessus));
	}
	
	
	
}
