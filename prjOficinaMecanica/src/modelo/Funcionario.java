package modelo;

import java.util.Set;
import java.util.TreeSet;

public class Funcionario extends Pessoa {

	int matricula;
	String funcao;
	Set<Servico> nomeServico;
	Set<OrdemDeServico> ordemDeServicos;

	public Funcionario(String nome, String cpf, int matricula, String funcao) {
		super(nome, cpf);
		this.setMatricula(matricula);
		this.setFuncao(funcao);
		this.nomeServico = new TreeSet<Servico>();
		this.ordemDeServicos = new TreeSet<OrdemDeServico>();
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		// validarMatricula//colocar validar no SET (ver prjMVC)
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void addOrdemServico(OrdemDeServico novaOS) {
		if (this.ordemDeServicos.contains(novaOS))
			return;
		this.ordemDeServicos.add(novaOS);
		novaOS.setFuncionario(this);
	}

	public void removeOrdemServico(OrdemDeServico oS) {
		if (!this.ordemDeServicos.contains(oS))
			return;
		this.ordemDeServicos.remove(oS);
		oS.setFuncionario(null);

	}

	public void addServico(Servico servico) {
		if (this.nomeServico.contains(servico))
			return;
		this.nomeServico.add(servico);
		servico.addFuncionario(this);
	}

	public void removeServico(Servico servico) {
		if (!this.nomeServico.contains(servico))
			return;
		this.nomeServico.remove(servico);
		servico.removeFuncionario(this);

	}

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", funcao=" + funcao + "]";
	}

	// public static void validar matricula(int matricula){
	//
	// }
	// if(this.gerente == gerente)
	// return;
	// if(gerente == null){
	// Funcionario antigo = this.gerente;
	// this.gerente = null;
	// }

}
