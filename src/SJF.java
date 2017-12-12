import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;


public class SJF {

	public static void Sjf(ArrayList<Processus> Ensemble){
		System.out.println("-----------------\nLecture a partir du fichier");
		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
		
		Collections.sort(Ensemble,new ComparateurDureeEtTemps());
		System.out.println("-----------------\nApres le tri");

		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
		
		for(int i=1; i<Ensemble.size();i++){
			Time tmp=new Time(Ensemble.get(i-1).tempArrive.getHours(),Ensemble.get(i-1).tempArrive.getMinutes()+Ensemble.get(i-1).duree.getMinutes(),0);
			if(Ensemble.get(i).tempArrive.before(tmp))
			Ensemble.get(i).tempArrive.setMinutes(Ensemble.get(i-1).tempArrive.getMinutes()+Ensemble.get(i-1).duree.getMinutes());
		}
		System.out.println("-----------------\n Sjf");
		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));

		
	}
}
