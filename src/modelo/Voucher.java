package modelo;

public class Voucher {

	private Cliente cliente;
	private String dataDaViagem;
	private String horaDaViagem;
	private Operadora operadora;
	private PacotesTuristico pacote;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDataDaViagem() {
		return dataDaViagem;
	}
	public void setDataDaViagem(String dataDaViagem) {
		this.dataDaViagem = dataDaViagem;
	}
	public String getHoraDaViagem() {
		return horaDaViagem;
	}
	public void setHoraDaViagem(String horaDaViagem) {
		this.horaDaViagem = horaDaViagem;
	}
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	public PacotesTuristico getPacote() {
		return pacote;
	}
	public void setPacote(PacotesTuristico pacote) {
		this.pacote = pacote;
	}
	
	
}
