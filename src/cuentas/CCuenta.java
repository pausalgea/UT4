package cuentas;

// TODO: Auto-generated Javadoc
/**
 * The Class CCuenta.
 * @author paula salicio
 * @version 1.0
 */
public class CCuenta {
    
    /** The nombre. */
    private String nombre;
    
    /** The cuenta. */
    private String cuenta;
    
    /** The saldo. */
    private double saldo;
    
    /** The tipo interés. */
    private double tipoInterés;

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the cuenta.
	 *
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Sets the cuenta.
	 *
	 * @param cuenta the new cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Gets the saldo.
	 *
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Sets the saldo.
	 *
	 * @param saldo the new saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Gets the tipo interés.
	 *
	 * @return the tipo interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Sets the tipo interés.
	 *
	 * @param tipoInterés the new tipo interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Instantiates a new c cuenta.
	 */
	public CCuenta()
    {
    }

    /**
     * Instantiates a new c cuenta.
     *
     * @param nom the nom
     * @param cue the cue
     * @param sal the sal
     * @param tipo the tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Estado.
     *
     * @return the double
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresar.
     *
     * @param cantidad the cantidad
     * @throws Exception the exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retirar.
     *
     * @param cantidad the cantidad
     * @throws Exception the exception
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
