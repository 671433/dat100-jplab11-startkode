package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

	
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(mappe + filnavn);
			fileWriter.append(samling.toString());
			fileWriter.close();
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	
	}
}
