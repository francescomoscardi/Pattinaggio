import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		String[] elenco= {"Registra Accesso","Registra Uscita","Visualizza Elenco in ordine alfabetico","Visualizza elenco in ordine di accesso","Modifica tariffe", "Verifica se una persona è presente"};
	
		ConsoleInput console=new ConsoleInput();
		Scanner tastiera=new Scanner(System.in);
		int tariffaAccesso=5;
		int tariffaSupplementare=2;
		
		
		System.out.println("Pattinaggio by Moscardi Francesco\n");
		Lista l1=new Lista();
		Accesso a1=new Accesso("", null, 0, 0, 0, 0, false);
		Menu m1=new Menu(elenco);
		String nomeFile = "file.txt";
		l1.caricaLista(nomeFile);
		
		switch (m1.scelta()) 
		{
		case 1:
			System.out.println("Vuoi registrare un accesso? 1=Si, 2=No");
			int entrata=0;
			entrata=tastiera.nextInt();
			
			
			switch (entrata) 
			{
			case 1:
				
				System.out.println("inserisci nome");
				a1.setNome(tastiera.nextLine());
				
				System.out.println("inserisci cognome");
				a1.setCognome(tastiera.nextLine());
				System.out.println("inserisci codice");
				a1.setCodice(tastiera.nextInt());
				System.out.println("acquisisco l'ora, attendere");
				LocalTime oraAttuale=LocalTime.now();
				System.out.println("ora acquisita");
				System.out.println("vuoi noleggiare i pattini? 1=si 2=no");
				int vuoiPattini;
				vuoiPattini=tastiera.nextInt();
				
				switch (vuoiPattini) 
				{
				case 1:
					a1.setTariffaAccesso(5);
					l1.inserisciPersona(a1);
					break;
				case 2:
					System.out.println("ok");
				default:
					break;
					
					
					
				}
				
				
				l1.salvaLista(nomeFile);
				break;
				
			case 2:
				System.out.println("allora niente");

			default:
				break;
			}
		
			break;
		case 2:
			System.out.println("vuoi registrare un uscita?");
			
		case 3:
			System.out.println("Visualizza ordine alfabetico");
			a1.toString();
		
		case 4:
			System.out.println("Visualizza in ordine di tempo");
			
			
		case 5:
			
			l1.cambiaAccessoENoleggio(tariffaAccesso, tariffaSupplementare);
			l1.salvaLista(nomeFile);
			
			case 6:
			System.out.println("verifica presenza nella lista");

		default:
			break;
		
		
		}
		
		
		
		
		
		
		
	} 

}
