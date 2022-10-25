import java.util.List;

public class Cuenta {
	String mNumero;
	String nTitular;
	Double saldo;
	List <Movimiento> mMovimientos; 
	
	
	
	

	public Cuenta(String mNumero, String nTitular, Double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getnTitular() {
		return nTitular;
	}

	public void setnTitular(String nTitular) {
		this.nTitular = nTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) {
		this.setSaldo(100.0);
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

	public void retirar(double x) {

	}
}
