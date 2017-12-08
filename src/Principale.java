import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Clock;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;


public class Principale  {
	Processus process;
	public int ComparaTo(Processus p){
		return(process.nomProcessus.compareTo(p.nomProcessus));
	}
	public static void main(String[] args) throws IOException{
		
		//Processus a= new Processus("p1",new Heure(12,30), new Duree(0,2) );
		ArrayList Ensemble= new ArrayList();
		
		PrintWriter p= new PrintWriter("file1.txt");
		for(int i=0;i<10;i++)
			p.write(a.toString()+"\n");
		p.close();
		
		FileReader f=new FileReader("file1.txt");
		BufferedReader r= new BufferedReader(f);
		String ss= "";
		
		while((ss=r.readLine())!=null){			
			String[] split=ss.split(" ");
			String[] heuree=split[1].split(":");
			String[] dureee=split[2].split(":");
			Ensemble.add(new Processus(split[0],
					new Heure(Integer.parseInt(heuree[0]),	Integer.parseInt(heuree[1])),
				new Duree(Integer.parseInt(dureee[0]),(int) (/*Integer.parseInt(dureee[1])*/Math.random()*10))));
		}
		/*
		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
			
		*/
		//Collections.sort(Ensemble,new Comparateur());
		for(int i=0; i<Ensemble.size();i++)
			System.out.println(Ensemble.get(i));
		
		//Graphique
		Affichage fenetre=new Affichage();
		//Panneau panneau=new Panneau();
		
		
		
	}
}
