
public abstract class cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0;

	public void depositar(double valor) { /// saca
		this.saldo = this.saldo + valor;
	}

	public void retirar(double valor) {
		if (this.saldo < valor) {
			throw new SinSaldoSuficienteException("no tienes saldo");
		}
		this.saldo -= valor;
	}

	public boolean transferir(double valor, cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	/// encapsulamiento de saldo
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/// encapsulamiento de agencia 
	public int getAgencia() {
		return agencia;
	}

	// public void setAgencia(int agencia) {
	// if (agencia > 0) {
	// this.agencia = agencia;
	// } else {
	// System.out.println("No se permite numeros negativos ");
	// }

	// }
	/// constructor /// para evitar agencias con numeros negativos

	public cuenta(int agencia, int numero) {

		if (agencia <= 0) {
			this.agencia = 1;
			this.numero = numero;
		} else {
			this.agencia = agencia;
			this.numero = numero;
		}
		total++;
		System.out.println("cuentas que van creadas " + total);
	}

/// encapsulamiento de numero 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/// encapsulamiento de titular
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static void setTotal(int total) {
		cuenta.total = total;
	}

	public static int getTotal() {
		return total;
	}

}
