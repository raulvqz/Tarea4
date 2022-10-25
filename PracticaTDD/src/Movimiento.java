public class Movimiento {
	double importe;
	enum signo{D,H};
	String detalle;
	
	public Movimiento(double importe, signo s ,String detalle) {
		super();
		this.importe = importe;
		this.detalle = detalle;
	}
}
