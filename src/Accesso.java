import java.time.LocalTime;

public class Accesso 
{
	private String nome;
	private String cognome;
	private String codice;
	private LocalTime oraIngresso;
	private boolean noleggioSiNo;
	
	public Accesso(String nome, String cognome, String codice, int ore, int minuti, int secondi, boolean ingressoSiNo)
	{
		this.setNome(nome);
		this.setCognome(cognome);
		this.setCodice(codice);
		setOraIngresso(ore,  minuti,  secondi);
		this.noleggioSiNo=noleggioSiNo;
		
	}

	public LocalTime getOraIngresso() 
	{
		return oraIngresso;
	}

	public void setOraIngresso(int ore, int minuti, int secondi) 
	{
		oraIngresso=LocalTime.of(ore, minuti, secondi);
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
