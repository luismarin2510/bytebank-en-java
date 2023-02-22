
public class test_funcionario {

	public static void main(String[] args) {

		Funcionario Luis = new Funcionario();
		Luis.setNombre("Luis Marin");
		Luis.setDocumento("1099368");
		Luis.setSalario(250);
		Luis.setTipo(0);
		System.out.println(Luis.getNombre() + " salario " + Luis.getSalario());
		System.out.println("bonificacion "+ Luis.getBonificacion());
		
		Funcionario gerente = new Funcionario();
		gerente.setSalario(2000);
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());

	}

}
