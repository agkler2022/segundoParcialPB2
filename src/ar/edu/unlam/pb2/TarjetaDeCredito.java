package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends MedioDePago implements Pagadora{

	private Long numero;
	private String titular;
	private String fechaVenc;
	private Double limiteCompraPesos;
	private Integer codSeguridad;
	private Double limiteCompraDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaVenc, Integer codSeguridad,
			Double limiteCompraPesos, Double limiteCompraDolares) {
		this.numero = numero;
		this.titular = titular;
		this.fechaVenc = fechaVenc;
		this.codSeguridad = codSeguridad;
		this.limiteCompraPesos = limiteCompraPesos;
		this.limiteCompraDolares = limiteCompraDolares;
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
		return codSeguridad;
	}

	@Override
	public Object getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return fechaVenc;
	}

	@Override
	public Object getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub

	}

	public Double getLimiteCompraPesos() {
		return limiteCompraPesos;
	}

	public Double getLimiteCompraDolares() {
		return limiteCompraDolares;
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		
	}

}
