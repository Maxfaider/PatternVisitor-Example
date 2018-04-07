
package co.edu.unicartagena.visitor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan M.E
 * @see 14/04/2017
 */

public class ConverterJson implements Visitor {

    @Override
    public void visit(Cliente cliente) {
        String json = jsonPersona(cliente);
        
        json+="\"monto\": "+cliente.getMonto()+"\n";
        json+="}";
        writeJson(json);
    }
    
    @Override
    public void visit(Empleado empleado) {
        String json = jsonPersona(empleado);
        
        json+="\"sueldo\": "+empleado.getSueldo()+"\n";
        json+="}";
        writeJson(json);
    }
    
    private String jsonPersona(Persona persona) {
        String json = "{\n";
        json+="\"identificación\": \""+persona.getIdentificacion()+"\",\n";
        json+="\"nombres\": \""+persona.getNombre()+"\",\n";
        json+="\"apellidos\": \""+persona.getApellidos()+"\",\n";
        return json;
    }
    
    private void writeJson(String json) {
        try {
            FileWriter fw = new FileWriter("person.json");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(json);
            bw.close();
            System.out.println("====Archivo Creado=====");
        } catch (IOException ex) {
            Logger.getLogger(ConverterJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
