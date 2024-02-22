package cuentas;

/**
 * @author rober
 * Clase que representa a una cuenta de cliente
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * este metodo nos da el nombre con el que vamos a nombrar  la cuenta
     * @return
     */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * este metodo nos muestra el saldo que tenemos en la cuenta
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * este metodo nos muestra el interes que tiene asociado la cuenta
	 * @return
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * este metodo muestra el estado en el que se encuentra la cuenta
	 * @return
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * metodo ingreso para realizar aportaciones a la cuenta
	 * @param cantidad
	 * @throws Exception si la cantidad de negativa muestra una excepcion, para control de errores.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * metodo para realizar retiradas de la cuenta
     * en este metodo hay un control que si intentamos retirar mas dinero del que tenemos en la cuenta nos muestra una error.
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
