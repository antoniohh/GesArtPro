/**
 * Javier Abellán, 20 Marzo 2006
 * Redefinicion de la clase ObjectOutputStream para que no escriba una cabecera
 * al principio del Stream.
 */

/**
 * Definimos el paquete de la clase.
 */
package gesartpro;

/**
 * Importamos las clases necesarias.
 */
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Redefinición de la clase ObjectOuputStream para que no escriba una cabecera
 * al inicio del Stream.
 * @author Javier Abellán.
 *
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    
    /** Constructor que recibe OutputStream
     * @param out
     * @throws java.io.IOException */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    
    /** Constructor sin parámetros
     * @throws java.io.IOException */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }
    
    /** Redefinición del método de escribir la cabecera para que no haga nada.
     * @throws java.io.IOException */
    @Override
    protected void writeStreamHeader() throws IOException {
    }
}