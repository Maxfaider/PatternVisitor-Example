
package co.edu.unicartagena;

import co.edu.unicartagena.visitor.Cliente;
import co.edu.unicartagena.visitor.ConverterJson;
import co.edu.unicartagena.visitor.Persona;
import co.edu.unicartagena.visitor.Visitor;

/**
 *
 * @author Alan M.E
 * @see 14/04/2016
 */
public class PatronVisitor {

    public static void main(String[] args) {
        Visitor visitor = new ConverterJson();
        
        Persona cliente = new Cliente("123456789", "Alan",
                "Marquez", 200000);
        cliente.accept(visitor);
    }
    
}
