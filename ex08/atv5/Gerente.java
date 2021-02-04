package atv5;


public class Gerente extends Funcionario{
	private double participacao_lucro;
	private double salario;
	
	public Gerente(double salario) {
		this.salario = salario;
		this.participacao_lucro = salario / 3;
	}

	@Override
	public double getBonificacao() {
		double lucro = (participacao_lucro / 100) * 10;
		return this.salario + lucro;
	}

	}


