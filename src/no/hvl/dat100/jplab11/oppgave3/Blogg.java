package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg [] innleggtabell;
	private int nesteledig ;

	public Blogg() {
		
		innleggtabell = new Innlegg [20];
		
		nesteledig = 0 ;
		
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg [lengde];

		nesteledig = 0 ; 
		
	}

	public int getAntall() {
	
		return nesteledig  ;
				
		
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for ( int i = 0 ; i < nesteledig; i++) {
			
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
			
		}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		int pos = 0;
		
		boolean funnet = false;
		
		while (pos < nesteledig && !funnet )
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}
			else 
				pos++;
		
	
		return funnet;
		
		
	}

	public boolean ledigPlass() {
		int pos =0;
		boolean ok = false;
		//boolean ok = finnInnlegg(innleggtabell[pos])!=-1;
		while (pos < nesteledig && !ok) {
		if ( nesteledig < innleggtabell.length) {
			ok = true;
			
		}else pos++;
		}
		if (ok)
			return true;
		else
			return false;
		
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		int pos =0;
		boolean ny = false;
		//boolean ny = 
		
		if (ny = finnInnlegg(innlegg) == -1 && nesteledig < innleggtabell.length) {
			
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			ny = true;
			
		}
			return ny;
	
	}
	
	public String toString() {
		
		String svar = "";
		for (int i = 0; i < nesteledig; i++) {
			svar += innleggtabell[i].toString() ;
		}
		svar = getAntall() +"\n"+ svar;
		return svar;
		
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg [] nyTab = new Innlegg [innleggtabell.length *2];
		
		for ( int pos = 0 ; pos < innleggtabell.length; pos ++ ) {
			nyTab[pos]= innleggtabell[pos];
			
		}
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}