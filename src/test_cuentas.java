
public class test_cuentas {

	public static void main(String[] args) {
		
		
		cuenta_corriente corriente = new cuenta_corriente(1, 1);
		cuenta_ahorros ahorros = new cuenta_ahorros(1, 2);
		
		corriente.depositar(2000);
		corriente.transferir(1000, ahorros);
		
		System.out.println(corriente.getSaldo());
		System.out.println(ahorros.getSaldo());
		
		
		

	}

}
