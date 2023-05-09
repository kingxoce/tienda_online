
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pricestock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pricestock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idpc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idpro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricestock", propOrder = {
    "existencia",
    "idpc",
    "idpro",
    "precio"
})
public class Pricestock {

    protected int existencia;
    protected int idpc;
    protected int idpro;
    protected float precio;

    /**
     * Obtiene el valor de la propiedad existencia.
     * 
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     */
    public void setExistencia(int value) {
        this.existencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idpc.
     * 
     */
    public int getIdpc() {
        return idpc;
    }

    /**
     * Define el valor de la propiedad idpc.
     * 
     */
    public void setIdpc(int value) {
        this.idpc = value;
    }

    /**
     * Obtiene el valor de la propiedad idpro.
     * 
     */
    public int getIdpro() {
        return idpro;
    }

    /**
     * Define el valor de la propiedad idpro.
     * 
     */
    public void setIdpro(int value) {
        this.idpro = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
    }

}
