import java.util.ArrayList;
import java.util.Collections;


public class SJF {

	public static void Sjf(ArrayList<Processus> Ensemble){

		
		Collections.sort(Ensemble,new ComparateurDureeEtTemps());

		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
		
	}
}
