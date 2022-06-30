package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Billetera {

	private String nombre;
	private HashSet<Comercio> comerciosAgregados;
	private HashSet<Consumidor> consumidoresAgregados;

	public Billetera(String nombre) {
		this.nombre = nombre;
		comerciosAgregados = new HashSet<Comercio>();
		consumidoresAgregados = new HashSet<Consumidor>();

	}

	public void agregarComercio(Comercio comercio) {
		// TODO Auto-generated method stub
		comerciosAgregados.add(comercio);
	}

	public String getNombre() {
		return nombre;
	}

	public Object getCantidadDeComercios() {
		// TODO Auto-generated method stub
		return comerciosAgregados.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		// TODO Auto-generated method stub
		consumidoresAgregados.add(consumidor);
	}

	public Object getCantidadDeConsumidores() {
		// TODO Auto-generated method stub
		return consumidoresAgregados.size();
	}

	public void agregarMedioDePago(Integer dniComprador, MedioDePago nuevo) {
		// TODO Auto-generated method stub
		Consumidor comprador = getCompradorPorDni(dniComprador);
		comprador.agregarNuevoMedioDePagoAlConsumidor(nuevo);

	}

	private Consumidor getCompradorPorDni(Integer dniComprador) {
		// TODO Auto-generated method stub
		for (Consumidor consumidor : consumidoresAgregados) {
			if (consumidor.getDni().equals(dniComprador)) {
				return consumidor;
			}
		}
		return null;
	}

	public Object getCantidadDeMediosDePago(Integer dniComprador) {
		// TODO Auto-generated method stub
		Consumidor compradorActual = getCompradorPorDni(dniComprador);
		return compradorActual.getCantidadDeMediosDePago();

	}

	public Compra generarCodigoQR(Long numeroComercio, Double monto) {
		// TODO Auto-generated method stub
		Compra nuevaCompra = new Compra(numeroComercio, monto);
		return nuevaCompra;
	}

	public Consumidor getConsumidor(Integer dniComprador) {
		// TODO Auto-generated method stub
		for (Consumidor consumidor : consumidoresAgregados) {
			if (consumidor.getDni().equals(dniComprador)) {
				return consumidor;
			}
		}
		return null;
	}

	public Boolean pagar(Compra codigoQR, Pagadora medioPagador) {
		if(codigoQR.getMonto() <= (TarjetaDeCredito)medioPagador.getSaldo()) {
			return true;
		}
	}



}
