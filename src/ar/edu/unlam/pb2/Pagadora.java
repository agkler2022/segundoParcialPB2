package ar.edu.unlam.pb2;

public interface Pagadora {

	void setSaldo(Double saldo);

	Object getNumero();

	Object getTitular();

	Object getCodigoDeSeguridad();

	Object getFechaDeVencimiento();

	Object getSaldo();

	void pagar();




}
