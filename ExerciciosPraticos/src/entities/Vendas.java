package entities;

public class Vendas {

	private Double value;

	public Vendas() {
	}
	
	public Vendas(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return " R$ "
				+ value;
	}
}
