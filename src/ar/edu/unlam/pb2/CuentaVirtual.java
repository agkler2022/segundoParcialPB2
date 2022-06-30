package ar.edu.unlam.pb2;

public class CuentaVirtual extends MedioDePago implements Transferible {

	private String cvu;
	private String entidad;
	private String titular;

	public CuentaVirtual(String cvu, String entidad, String titular) {
		this.cvu=cvu;
		this.entidad=entidad;
		this.titular=titular;
	}

	@Override
	public Object getCbu() {
		// TODO Auto-generated method stub
		return null;
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
		return cvu;
	}

}
