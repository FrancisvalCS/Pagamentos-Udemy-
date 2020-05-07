package entities;

public class FuncionarioExterno extends Funcionario{

	private Double cobrancaAdicional;
	
	public FuncionarioExterno() {
		super();
	}

	public FuncionarioExterno(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double payment() {
		return super.payment() + cobrancaAdicional * 1.1;
	}
	
}
