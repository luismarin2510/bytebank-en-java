
public class test_referencia {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Luis");
		funcionario.setSalario(2000);

		Gerente gerente = new Gerente();
		gerente.setNombre("Ximena");
		gerente.setSalario(10000);

		Contador contador = new Contador();
		contador.setNombre("Cesar");
		contador.setSalario(2500);

		control_bonificacion control_bonificacion = new control_bonificacion();

		control_bonificacion.registarsalario(funcionario);
		control_bonificacion.registarsalario(gerente);
		control_bonificacion.registarsalario(contador);

	}

}
