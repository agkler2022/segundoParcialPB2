package ar.edu.unlam.pb2;

public class CuentaBancaria extends MedioDePago implements Transferible {

	private String cbu;
	private String entidad;
	private String titular;

	public CuentaBancaria(String cbu, String entidad, String titular) {
		this.cbu=cbu;
		this.entidad=entidad;
		this.titular=titular;
	}

	@Override
	public Object getCbu() {
		// TODO Auto-generated method stub
		return cbu;
	}

	@Override
	public Object getEntidad() {
		// TODO Auto-generated method stub
		return entidad;
	}

	@Override
	public Object getTitular() {
		// TODO Auto-generated method stub
		return titular;
	}

	@Override
	public Object getCvu() {
		// TODO Auto-generated method stub
		return null;
	}

}
