package ocorrencia;

import com.dio.AcaoAtirar;
import com.dio.AcaoLiberar;
import com.dio.AcaoPrender;
import com.dio.Executar;
import com.dio.Policial;

public class Abordagem {
	
	
	 static boolean ladrao = false;
	 static boolean atira = true;
	


	public static void main(String[] args) {
		
		Policial policial = new Policial();
		Executar atirar = new AcaoAtirar();
		Executar liberar = new AcaoLiberar();
		Executar prender = new AcaoPrender();
		
		
		if(ladrao && atira) {
			policial.setExecutar(atirar);
			policial.acao();
		}
		else if(ladrao == true && atira == false) {
			policial.setExecutar(prender);
			policial.acao();
		}
		else if(ladrao == false && atira == true) {
			policial.setExecutar(atirar);
			policial.acao();
		}
		else {
			policial.setExecutar(liberar);
			policial.acao();
		}
		
		

	}

}
