package caso3;

		import java.util.Scanner;

		public class CuentaBancaria {
		    private String titular;
		    private double saldo;

		    public CuentaBancaria(String titular, double saldoInicial) {
		        this.titular = titular;
		        this.saldo = saldoInicial;
		    }

		    public void depositar(double cantidad) {
		        if (cantidad > 0) {
		            saldo += cantidad;
		            System.out.println("Depósito exitoso. Nuevo saldo: S/" + saldo);
		        } else {
		            System.out.println("Error: La cantidad a depositar debe ser positiva.");
		        }
		    }

		    public void retirar(double cantidad) {
		        if (cantidad > 0 && cantidad <= saldo) {
		            saldo -= cantidad;
		            System.out.println("Retiro exitoso. Saldo restante: S/" + saldo);
		        } else {
		            System.out.println("Error: Fondos insuficientes o cantidad inválida.");
		        }
		    }

		    public void mostrarSaldo() {
		        System.out.println("\n--- Estado de Cuenta ---");
		        System.out.println("Titular: " + titular);
		        System.out.println("Saldo actual: S/" + saldo);
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        CuentaBancaria miCuenta = new CuentaBancaria("Jonathan Pita", 1500.00);

		        miCuenta.mostrarSaldo();

		        System.out.print("\nIngrese la cantidad a depositar: ");
		        double montoDeposito = scanner.nextDouble();
		        miCuenta.depositar(montoDeposito);

		        System.out.print("\nIngrese la cantidad a retirar: ");
		        double montoRetiro = scanner.nextDouble();
		        miCuenta.retirar(montoRetiro);

		        miCuenta.mostrarSaldo();

		        scanner.close();
		    }
		}