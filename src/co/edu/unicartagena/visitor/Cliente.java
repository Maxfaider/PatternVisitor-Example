
package co.edu.unicartagena.visitor;

/**
 *
 * @author Alan M.E
 * @see 14/04/2017
 */

public class Cliente extends Persona {
    
    private double monto;

    public Cliente(String identificacion, String nombre, String apellidos, double monto) {
        super(identificacion, nombre, apellidos);
        this.monto = monto;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
