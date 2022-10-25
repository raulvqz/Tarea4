import java.util.List;

enum signo{D,H};

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
	
	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = mMovimientos;
	}

	public void ingresar(double x) {
		if(x<0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		
		Movimiento m = new Movimiento(x, signo.H, "ingreso");
		this.movimientos.add(m);
	}

	

	public void retirar(double x) {
		if((saldo - x) >= -500)
			this.saldo = this.saldo - x;
	}
}
