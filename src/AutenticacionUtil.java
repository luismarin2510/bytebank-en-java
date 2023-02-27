
public class AutenticacionUtil {

	private String Clave;

	boolean iniciarSesion(String clave) {
		return this.Clave == clave;

	}

	public void setClave(String clave) {
		this.Clave = clave;
	}

}
