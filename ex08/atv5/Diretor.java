package atv5;

public class Diretor  extends Funcionario{
	private double salario;
	
	public Diretor(double salario) {
		this.salario = salario;
	}

   @Override
	public double getBonificacao() {
		double lucro = (5 / 100) * 10;
		return this.salario + lucro;
	}

}
