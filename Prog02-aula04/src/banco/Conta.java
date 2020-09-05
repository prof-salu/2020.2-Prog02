package banco;

public class Conta implements Comparable<Conta>{
	private int agencia;
	private int numero;
	private double saldo;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		if(this.getNumero() > outraConta.getNumero()) {
			return 1;
		}else if(this.getNumero() < outraConta.getNumero()) {
			return -1;
		}else {
			return 0;
		}
	}
}
