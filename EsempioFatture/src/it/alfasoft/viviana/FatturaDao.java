package it.alfasoft.viviana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;








public class FatturaDao {
	Map <String,Fattura> fatture;

	public FatturaDao() {
	fatture=new HashMap<String,Fattura>();
		Fattura f1=new Fattura("aaa",12.30,"aaa"); 
		Fattura f2=new Fattura("bbb",12.30,"bbb"); 
		Fattura f3=new Fattura("ccc",12.30,"ccc"); 
		Fattura f4=new Fattura("ddd",12.30,"ddd"); 
		
		
		fatture.put(f1.getCodiceCliente(), f1);
		fatture.put(f2.getCodiceCliente(), f2);
		fatture.put(f3.getCodiceCliente(), f3);
		fatture.put(f4.getCodiceCliente(), f4);
	}
	
	public List<Fattura> getTutteFatture(){
		List<Fattura> listaFatture=new ArrayList<Fattura>(fatture.values());
		return listaFatture;
	}
	
	public Fattura getFattura(String cC){
		Fattura f=fatture.get(cC);
		return f;
	}
	
}
