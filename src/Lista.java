import java.io.Serializable;

public class Lista implements Serializable
{
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
	
	private Nodo creaNodo(Accesso persona, Nodo link)
	{
		Nodo nodo= new Nodo(persona);
		nodo.setLink(link);
		return nodo;
	}
	
	public int getElementi() 
	{
		return elementi;
	}

}
