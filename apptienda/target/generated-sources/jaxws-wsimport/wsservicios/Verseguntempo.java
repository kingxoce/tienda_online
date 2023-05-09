
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verseguntempo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verseguntempo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idtempo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verseguntempo", propOrder = {
    "idtempo"
})
public class Verseguntempo {

    protected int idtempo;

    /**
     * Obtiene el valor de la propiedad idtempo.
     * 
     */
    public int getIdtempo() {
        return idtempo;
    }

    /**
     * Define el valor de la propiedad idtempo.
     * 
     */
    public void setIdtempo(int value) {
        this.idtempo = value;
    }

}
