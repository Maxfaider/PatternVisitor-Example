
package co.edu.unicartagena.visitor;

/**
 *
 * @author Alan M.E
 * @see 14/04/2017
 */

public class Empleado extends Persona {

    private double sueldo;
    
    public Empleado(String identificacion, String nombre, String apellidos, double sueldo) {
        super(identificacion, nombre, apellidos);
        this.sueldo = sueldo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
