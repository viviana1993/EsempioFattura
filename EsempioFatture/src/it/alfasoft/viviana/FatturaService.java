package it.alfasoft.viviana;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public class FatturaService implements IFatturaService {
	FatturaDao fDao=new FatturaDao();
	
	
	/* (non-Javadoc)
	 * @see it.alfasoft.viviana.IFatturaService#getFatture()
	 */
	
	
	@Override
	@WebMethod
	public List<Fattura> getFatture(){
		return fDao.getTutteFatture();
	}
	
	/* (non-Javadoc)
	 * @see it.alfasoft.viviana.IFatturaService#getFatturaConCodice(java.lang.String)
	 */
	@Override
	@WebMethod
	public Fattura getFatturaConCodice(String cC){
		return fDao.getFattura(cC);
	}
	
	
}
