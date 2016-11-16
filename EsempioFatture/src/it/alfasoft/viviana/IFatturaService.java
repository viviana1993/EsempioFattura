package it.alfasoft.viviana;

import java.util.List;

import javax.jws.WebMethod;

public interface IFatturaService {

	public abstract List<Fattura> getFatture();

	public abstract Fattura getFatturaConCodice(String cC);

}