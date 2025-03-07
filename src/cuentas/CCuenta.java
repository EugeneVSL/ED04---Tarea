
/**
 * Clase CCuenta implementa atributos y metodos para representar un objeto de tipo cuenta.   
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // default constructor
    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {

        nombre = nom;
        cuenta = cue;
    }

    // getters and setters
    public double estado()
    {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
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

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Implementa la operation de ingresar la cuenta 
     * @param cantidad      Es la candidad de ingresar
     * @throws Exception    Si se entuentra en error, se pasa la los niveles superiores
     */
    public void ingresar(double cantidad) throws Exception {

        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }

        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
