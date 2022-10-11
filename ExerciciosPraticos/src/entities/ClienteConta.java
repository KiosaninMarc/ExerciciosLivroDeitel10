package entities;

public class ClienteConta {

	private Integer nConta;
	private Integer saldoIniMes;
	private Integer totalGastosMes;
	private Integer credMes;
	private Integer credAutorizado;
	
	//Constructor
	public ClienteConta() {
	}
	
	public ClienteConta(Integer nConta, Integer saldoIniMes, Integer totalGastosMes, Integer credMes, Integer credAutorizado) {
		this.nConta = nConta;
		this.saldoIniMes = saldoIniMes;
		this.totalGastosMes = totalGastosMes;
		this.credMes = credMes;
		this.credAutorizado = credAutorizado;
	}

	//Getters and Setters
	public Integer getnConta() {
		return nConta;
	}

	public void setnConta(Integer nConta) {
		this.nConta = nConta;
	}

	public Integer getSaldoIniMes() {
		return saldoIniMes;
	}

	public void setSaldoIniMes(Integer saldoIniMes) {
		this.saldoIniMes = saldoIniMes;
	}

	public Integer getTotalGastosMes() {
		return totalGastosMes;
	}

	public void setTotalGastosMes(Integer totalGastosMes) {
		this.totalGastosMes = totalGastosMes;
	}

	public Integer getCredMes() {
		return credMes;
	}

	public void setCredMes(Integer credMes) {
		this.credMes = credMes;
	}

	public Integer getCredAutorizado() {
		return credAutorizado;
	}

	public void setCredAutorizado(Integer credAutorizado) {
		this.credAutorizado = credAutorizado;
	}
	
	//Methods
	public Integer novoSaldo() {
		return saldoIniMes + totalGastosMes - credMes;
	}
	
	@Override
	public String toString() {
		return "Numero da conta: "
				+ nConta
				+ "\nSaldo no inicio do mês: "
				+ saldoIniMes
				+ "\nTotal de gastos no mês: "
				+ totalGastosMes
				+ "\nCredito do mês: "
				+ credMes
				+ "\nLimite de credito autorizado: "
				+ credAutorizado;
	}
}
