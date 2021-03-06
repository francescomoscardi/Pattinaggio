import java.io.Console;
import java.io.IOException;
import java.util.Scanner;


public class Menu 
{
	private int numeroVoci;
	private String[] elencoVoci;
	
	public Menu(String[] elenco)
	{
		numeroVoci = elenco.length;
		elencoVoci = new String[numeroVoci];
		for (int i = 0; i <numeroVoci; i++)
		{
			elencoVoci[i] = elenco[i];
		}
	}
	
	
	public void visualizza()
	{
		for (int i = 0; i < numeroVoci; i++)
		{
			System.out.println(elencoVoci[i]);
		}
	}
	

	
	public int scelta()
	{
		ConsoleInput tastiera = new ConsoleInput();
		int voceScelta = -1;
		do 
		{
			visualizza();
			System.out.println("Scegli...");
			try
			{
				voceScelta = tastiera.readInt();
				if (voceScelta>= numeroVoci)
				{
					System.out.println("Opzione non disponibile");
					
				}
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("Formato non corretto, reinsrisci");
			}
			catch (IOException e)
			{
				System.out.println("Impossibile leggere dal dispositivo di input riprovare...");
			}
			
		} while (voceScelta <  0 || voceScelta >= numeroVoci);
		
		return voceScelta;
		
		
	}
}
