import java.io.Serializable;

public class Nodo implements Serializable
{
	private Accesso info;
	private Nodo link;
	
	public Nodo(Accesso persona)
	{
		setInfo(persona);
		link=null;
	}

	public Accesso getInfo() 
	{
		return info;
	}

	public void setInfo(Accesso info) 
	{
		this.info = info;
	}

	public Nodo getLink() 
	{
		return link;
	}

	public void setLink(Nodo link) 
	{
		this.link = link;
	}
}
