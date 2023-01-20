package entities;

public abstract class Contribuinte {
	
	private String nome;
	private Double renda;
	
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, Double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public abstract double calcularImposto();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome() + " : ");
		sb.append("R$ " + String.format("%.2f", this.calcularImposto()));
		return sb.toString();
	}
	
}
