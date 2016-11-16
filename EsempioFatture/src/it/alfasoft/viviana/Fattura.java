package it.alfasoft.viviana;




public class Fattura {
	
	
	private String codiceCliente;
	private double importo;
	private String ragioneSociale;
	
	
	public Fattura(String codiceCliente, double importo, String ragioneSociale) {
		super();
		this.codiceCliente = codiceCliente;
		this.importo = importo;
		this.ragioneSociale = ragioneSociale;
	}


	public Fattura() {
		
	}


	public String getCodiceCliente() {
		return codiceCliente;
	}


	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}


	public double getImporto() {
		return importo;
	}


	public void setImporto(double importo) {
		this.importo = importo;
	}


	public String getRagioneSociale() {
		return ragioneSociale;
	}


	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	
}
