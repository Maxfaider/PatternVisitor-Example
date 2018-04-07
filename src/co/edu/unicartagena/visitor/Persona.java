
package co.edu.unicartagena.visitor;

/**
 *
 * @author Alan M.E
 * @see 14/04/2017
 */

public abstract class Persona {
    
    private String identificacion;
    private String nombre;
    private String apellidos;

    public Persona(String identificacion, String nombre, String apellidos) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public abstract void accept(Visitor visitor);
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
