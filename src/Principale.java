import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Clock;
import java.time.Duration;


public class Principale {
	Processus process;
	
	public static void main(String[] args) throws IOException{
		
		Processus a= new Processus("p1",new Heure(12,30), new Duree(0,2) );
		System.out.print(a);
		
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
			Processus b=new Processus(split[0],new Heure(Integer.parseInt(heuree[0]),Integer.parseInt(heuree[1])), new Duree(Integer.parseInt(dureee[0]),Integer.parseInt(dureee[1])));

			System.out.println(b);
		}
		
		
		
	}
}
