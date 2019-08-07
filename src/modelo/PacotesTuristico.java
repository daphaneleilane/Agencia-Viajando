package modelo;

public class PacotesTuristico {
	private double codigo;
	private String nome;
	private String local;
	private String hotel;
	private String periodo;
	private String tours;
	private String translados;
	private Operadora operadora;
	private double preco;
	
	
	public double getCodigo() {
		return codigo;
	}
	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTours() {
		return tours;
	}
	public void setTours(String tours) {
		this.tours = tours;
	}
	public String getTranslados() {
		return translados;
	}
	public void setTranslados(String translados) {
		this.translados = translados;
	}
	
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
