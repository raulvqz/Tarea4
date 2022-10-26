import java.util.ArrayList;
import java.util.List;

enum signo{D,H};



public class Cuenta {
	String mNumero;
	String nTitular;
	Double saldo;
	List<Movimiento> Movimientos;

	public Cuenta(String mNumero, String nTitular, Double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
		this.Movimientos = new ArrayList<>();
		
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
		return Movimientos;
	}

	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.Movimientos = mMovimientos;
	}

	public void ingresar(double x) throws Exception {
		if (x < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");

		Movimiento m = new Movimiento(x, signo.H, "ingreso");
		this.Movimientos.add(m);

		this.setSaldo(this.getSaldo() + x);
	}

	public void retirar(double x) throws Exception {
		if (x < 0) {
			throw new Exception("El valor no puede ser negativo");
		} else {
			if (saldo - x < -500) {
				throw new Exception("Saldo no disponible");
			} else {
				saldo = saldo - x;
				Movimiento m = new Movimiento(x, signo.H, "ingreso");
				this.Movimientos.add(m);
			}
		}
	}

	
}
