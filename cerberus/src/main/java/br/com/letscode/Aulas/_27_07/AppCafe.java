package br.com.letscode.Aulas._27_07;

import br.com.letscode.Aulas._27_07.maquinas.Expressavel;
import br.com.letscode.Aulas._27_07.maquinas.Maquina;
import br.com.letscode.Aulas._27_07.maquinas.MaquinaBasica;
import br.com.letscode.Aulas._27_07.maquinas.MaquinaPremium;

public class AppCafe {
	public static void main(String[] args) {
		
		Maquina mb = new MaquinaBasica();

		mb.tirarCafe();
		mb.recarregar();
		mb.tirarCafe();
		System.out.println();


		Maquina mp = new MaquinaPremium();
		mp.recarregar();
		mp.tirarCafe();
		if (mp instanceof Expressavel) {
			((Expressavel) mp).tirarExpresso();
			((Expressavel) mp).expressar(123456);
		}
	}
}
