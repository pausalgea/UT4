
package cuentas;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 * @author paula salicio
 * @version 1.0
 * 
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(0);
    }

	/**
	 * Operativa cuenta.
	 *
	 * @param cantidad the cantidad
	 */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
