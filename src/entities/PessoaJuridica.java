package entities;

public class PessoaJuridica extends Contribuinte{

	private Integer numeroFunc;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double renda, Integer numeroFunc) {
		super(nome, renda);
		this.numeroFunc = numeroFunc;
	}

	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public double calcularImposto() {
		double valor = 0.0;
		
		if(this.getNumeroFunc() > 10) {
			valor = this.getRenda() * 0.14;
		}else {
			valor = this.getRenda() * 0.16;
		}
		return valor;
	}

}
