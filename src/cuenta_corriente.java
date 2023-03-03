
public class cuenta_corriente extends cuenta {

	public cuenta_corriente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void depositar(double valor) {
		double comision = 0.2;
		super.depositar(valor + comision);
	}

}
