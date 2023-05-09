
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lastproduct complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lastproduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idlastproduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lastproduct", propOrder = {
    "idlastproduct"
})
public class Lastproduct {

    protected int idlastproduct;

    /**
     * Obtiene el valor de la propiedad idlastproduct.
     * 
     */
    public int getIdlastproduct() {
        return idlastproduct;
    }

    /**
     * Define el valor de la propiedad idlastproduct.
     * 
     */
    public void setIdlastproduct(int value) {
        this.idlastproduct = value;
    }

}
