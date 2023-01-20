package entities;

public class PessoaFisica extends Contribuinte{

	private double gastoSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda, double gastoSaude) {
		super(nome, renda);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calcularImposto() {
		double valor = 0.0;
		if(this.getRenda() < 20000) {
			if(this.getGastoSaude() > 0.0) {
				valor = (this.getRenda() * 0.15) - (this.getGastoSaude() * 0.50);
			}else {
				valor = (this.getRenda() * 0.15);
			}
		}else {
			if(this.getGastoSaude() > 0.0) {
				valor = (this.getRenda() * 0.25) - (this.getGastoSaude() * 0.50);
			}else {
				valor = (this.getRenda() * 0.25);
			}
		}
		if (valor < 0.0) {
			valor = 0.0;
		}
		return valor;
	}
	


}
