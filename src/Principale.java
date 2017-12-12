import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;


public class Principale extends SJF	 {
	Processus process;
	
	public static void main(String[] args) throws IOException{
		
		
		ArrayList<Processus> Ensemble= new ArrayList<Processus>();
		
		
		FileReader f=new FileReader("file1.txt");
		BufferedReader r= new BufferedReader(f);
		String ss= "";
		
		while((ss=r.readLine())!=null){			
			String[] split=ss.split(" ");
			String[] heuree=split[1].split(":");
			String[] dureee=split[2].split(":");
			Ensemble.add(new Processus(split[0],
					new Time(Integer.parseInt(heuree[0]),	Integer.parseInt(heuree[1]),0),
				new Time(Integer.parseInt(dureee[0]), Integer.parseInt(dureee[1]), 0  )));
		}
		/*
		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
			
		*/
		Sjf(Ensemble);
		
		
		//Graphique
		Affichage fenetre=new Affichage();
		
		
		
	}
}
