package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends MedioDePago implements Pagadora {

	private Long numero;
	private String fechaVenc;
	private String titular;
	private Integer codigoSeguridad;
	private Double saldo;

	public TarjetaDeDebito(Long numero, String titular, String fechaVenc,
			Integer codigoSeguridad) {
		this.numero=numero;
		this.titular=titular;
		this.fechaVenc=fechaVenc;
		this.codigoSeguridad=codigoSeguridad;
		this.saldo= 0.0;
	}

	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub
		this.saldo=saldo;
	}

	@Override
	public Object getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	@Override
	public Object getTitular() {
		// TODO Auto-generated method stub
		return titular;
	}

	@Override
	public Object getCodigoDeSeguridad() {
		// TODO Auto-generated method stub
		return codigoSeguridad;
	}

	@Override
	public Object getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return fechaVenc;
	}

	@Override
	public Object getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
