
public class cuenta_corriente extends cuenta {

	public cuenta_corriente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void retirar(double valor) {
		double comision = 0.2;
		super.retirar(valor + comision);
	}

}
