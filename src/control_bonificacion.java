
public class control_bonificacion {

	private double suma;

	public double registarsalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("suma actual " + this.suma);
		return this.suma;
	}

	public double registarsalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;
		System.out.println("suma actual " + this.suma);
		return this.suma;
	}

	public double registarsalario(Contador contador) {
		this.suma = contador.getBonificacion() + this.suma;
		System.out.println("suma actual " + this.suma);
		return this.suma;
	}

}
