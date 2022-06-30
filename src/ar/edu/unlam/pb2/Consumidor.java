package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Consumidor {

	private Integer dni;
	private String nombre;
	private HashSet<MedioDePago> mediosDePagoDelComprador;

	public Consumidor(Integer dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		mediosDePagoDelComprador = new HashSet<>();
	}

	public Object getDni() {
		// TODO Auto-generated method stub
		return dni;
	}

	public Object getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public void agregarNuevoMedioDePagoAlConsumidor(MedioDePago nuevo) {
		// TODO Auto-generated method stub
		mediosDePagoDelComprador.add(nuevo);
	}

	public Integer getCantidadDeMediosDePago() {
		return mediosDePagoDelComprador.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((mediosDePagoDelComprador == null) ? 0 : mediosDePagoDelComprador.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (mediosDePagoDelComprador == null) {
			if (other.mediosDePagoDelComprador != null)
				return false;
		} else if (!mediosDePagoDelComprador.equals(other.mediosDePagoDelComprador))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public Pagadora getMedioPagador(Long numTarjeta) {
		for (MedioDePago mediosDePago : mediosDePagoDelComprador) {
			if (mediosDePago instanceof Pagadora) {
				if (((TarjetaDeCredito) mediosDePago).getNumero().equals(numTarjeta)) {
					return (Pagadora) mediosDePago;
				}
			}
		}
		return null;
	}
	

}
