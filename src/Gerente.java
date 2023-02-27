
public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Gerente(AutenticacionUtil util) {
		this.util = new AutenticacionUtil();
	}

	// Sobre-escritura de metodo
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
	}
}
