package modelo;

import java.util.Set;

public class Veiculo {

	String placa;
	String modelo;
	Cliente proprietario;
	Set<OrdemDeServico> ordemDeServicos;
	
	
	public Veiculo(String placa, String modelo) {
		super();
		this.placa = placa;
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cliente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Cliente proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo
				+ ", proprietario=" + proprietario + ", ordemDeServicos="
				+ ordemDeServicos + "]";
	}
	
	
	
	
}