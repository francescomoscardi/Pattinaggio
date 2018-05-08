import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

public class Lista implements Serializable
{
	private Accesso[] elencoPattinatori;
	private final int MAX_NUM_PATTINATORI=100;
	
	private Nodo head;
	private int elementi;
	
	public Lista()
	{
		head=null;
		elementi=0;
	}
	

	
		
	
	public void inserisciPersona (Accesso persona)
	{
		
		Nodo p=creaNodo(persona, head);
		head=p;
		elementi++;
	}
	
	public void eliminaAccesso(int posizione) 
	{
		
		
		Nodo p;
		p=getLinkPosizione(posizione);
		Nodo precedente=getLinkPosizione(posizione-1);
		precedente.setLink(p.getLink());
		elementi--;
		
	}
	
	public void esportaCSV (String nomeFile) throws IOException
	{
		TextFile file= new TextFile (nomeFile,'W');
		String personaCSV;
		Accesso persona;
		
		for (int i = 1; i <= getElementi(); i++) 
		{
			persona=getAccesso(i);
			personaCSV=persona.getNome()+";"+persona.getCognome()+";";
			//file.toFile(personaCSV);
		}
		file.closeFile();
		
	}
	
	public Accesso getAccesso (int posizione) 
	{
		
		Nodo p=getLinkPosizione(posizione);
		return p.getInfo();		
	}
	
	
	
	private Nodo creaNodo(Accesso persona, Nodo link)
	{
		Nodo nodo= new Nodo(persona);
		nodo.setLink(link);
		return nodo;
	}
	
	private Nodo getLinkPosizione(int posizione) 
	{
		
		Nodo p;
		int n;
		p=head;
		n=1;

		while(p.getLink()!=null && n<posizione)
		{
			p=p.getLink();	//p va a puntare al nodo successivo
			n++;
		}
		
		return p;
	}
	
	public int cambiaAccessoENoleggio(int tariffaAccesso, int tariffaSupplementare)
	{
		System.out.println("vuoi cambiare le tariffe? 1=si 2=no");
		int cambiaTariffe=0;
		
		switch (cambiaTariffe) 
		{
		case 1:
			System.out.println("vuoi cambiare la tariffa di Accesso(1) o quella supplementare(2)?");
			int tipoTariffa=0;
			switch (tipoTariffa) 
			{
			case 1:
				System.out.println("inserisci la nuova tariffa di accesso:");
				int nuovaTariffaAccesso=0;
				Scanner tastiera=new Scanner(System.in);
				nuovaTariffaAccesso=tastiera.nextInt();
				
				tariffaAccesso=nuovaTariffaAccesso;
				return tariffaAccesso;
				
				
			case 2:
				System.out.println("inserisci la nuova tariffa supplementare");
				int nuovaTariffaSupplementare;
				Scanner tastiera1=new Scanner(System.in);
				nuovaTariffaSupplementare=tastiera1.nextInt();
				
				tariffaSupplementare=nuovaTariffaSupplementare;
				return tariffaSupplementare;
			default:
				return 0;
			
			}
			

		default:
			return 0;
			
		}
	}
	
	public void salvaLista(String nomeFile) throws IOException
	{
		FileOutputStream file =new FileOutputStream(nomeFile);
		ObjectOutputStream writer=new ObjectOutputStream(file);
		writer.writeObject(this);
		writer.flush();
		file.close();
	}
	
	public Lista caricaLista (String nomeFile) throws IOException, ClassNotFoundException 
	{
		FileInputStream file=new FileInputStream(nomeFile);
		ObjectInputStream reader= new ObjectInputStream(file);
		
		Lista lista1;
		
		lista1=(Lista)(reader.readObject());
		file.close();
		return lista1;
	}
	
	
	public int getElementi() 
	{
		return elementi;
	}

	public Accesso[] getElencoPattinatori() {
		return elencoPattinatori;
	}

	public void setElencoPattinatori(Accesso[] elencoPattinatori) {
		this.elencoPattinatori = elencoPattinatori;
	}

	public int getMAX_NUM_PATTINATORI() {
		return MAX_NUM_PATTINATORI;
	}

}
