package entities;

public class SalariosCalculador {

	private String funcionario;
	private Integer hsTrabalhada;
	private Double salHora;
	
	public SalariosCalculador() {
	}

	public SalariosCalculador(String funcionario, Integer hsTrabalhada, Double salHora) {
		this.funcionario = funcionario;
		this.hsTrabalhada = hsTrabalhada;
		this.salHora = salHora;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public Integer getHsTrabalhada() {
		return hsTrabalhada;
	}

	public void setHsTrabalhada(Integer hsTrabalhada) {
		this.hsTrabalhada = hsTrabalhada;
	}

	public Double getSalHora() {
		return salHora;
	}

	public void setSalHora(Double salHora) {
		this.salHora = salHora;
	}
	
	//Methods
	public int hrExtra() {
		if (hsTrabalhada > 40) {
			return hsTrabalhada - 40;
		}else {
			return 0;
		}
	}
	
	public Double salBase() {
		return salHora * 40.0;
	}
	
	public Double valorExtra() {
		if (hrExtra() != 0) {
			return (salHora + (salHora * 0.5));
		}else {
			return 0.0;
		}
	}
	
	public Double valorTotalExtra() {
		if (hrExtra() != 0) {
			return (salHora + (salHora * 0.5)) * hrExtra();
		}else {
			return 0.0;
		}
	}
	
	public Double salBruto() {
		return valorTotalExtra() + salBase();
	}
	
	@Override
	public String toString() {
		return "Nome: "
			+ funcionario
			+ "\nHoras trabalhada: "
			+ hsTrabalhada
			+ "\nValor da hora trabalhada: "
			+ salHora;
	}
	
}
