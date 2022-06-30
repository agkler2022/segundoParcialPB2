package ar.edu.unlam.pb2;

public class Compra {
	private Double monto;
	private Long cuit;

	public Compra(Long cuit, Double monto){
		this.cuit=cuit;
		this.monto=monto;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Long getCuit() {
		return cuit;
	}

	public void setCuit(Long cuit) {
		this.cuit = cuit;
	}
}
