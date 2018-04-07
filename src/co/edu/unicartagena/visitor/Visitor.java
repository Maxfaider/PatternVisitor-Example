
package co.edu.unicartagena.visitor;

/**
 *
 * @author Alan M.E
 * @see 14/04/2017
 */

public interface Visitor {
    
    public void visit(Cliente cliente);
    public void visit(Empleado empleado);
    
}
