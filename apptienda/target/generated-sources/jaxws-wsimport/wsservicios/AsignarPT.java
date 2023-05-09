
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asignarPT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asignarPT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idtempo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id product" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asignarPT", propOrder = {
    "idtempo",
    "id0020Product"
})
public class AsignarPT {

    protected int idtempo;
    @XmlElement(name = "id product")
    protected int id0020Product;

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

    /**
     * Obtiene el valor de la propiedad id0020Product.
     * 
     */
    public int getId_0020Product() {
        return id0020Product;
    }

    /**
     * Define el valor de la propiedad id0020Product.
     * 
     */
    public void setId_0020Product(int value) {
        this.id0020Product = value;
    }

}
