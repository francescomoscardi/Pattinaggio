import java.time.LocalTime;
import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] elenco= {"Registra Accesso","Registra Uscita","Visualizza Elenco in ordine alfabetico","Visualizza elenco in ordine di accesso","Modifica tariffe", "Verifica se una persona è presente"};
		/*Accesso p=new Accesso("cesco", "mesco", 25505, 13, 59, 59, false);
		System.out.println(p.toString());*/
		
		
		
		Menu m1=new Menu(elenco);
		
		
		switch (m1.scelta()) 
		{
		case 1:
			
			
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
	} 

}
