

public class Processus {
	String nomProcessus;
	Heure tempArrive;
	Duree duree;
	
	Processus(String nom, Heure t, Duree d){
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
