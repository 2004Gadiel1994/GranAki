
package Excepciones;


public class LecturaExcepcion extends AKIExcepciones{
    public LecturaExcepcion(String message, java.sql.SQLClientInfoException ex) {
        super(message);
    }
}
