
public class control_bonificacion {
	
	private double suma;
	
	private double registarsalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		return this.suma;
	}

}
