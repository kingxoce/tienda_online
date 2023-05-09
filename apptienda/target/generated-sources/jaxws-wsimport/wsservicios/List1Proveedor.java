
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para list1Proveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="list1Proveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idpe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list1Proveedor", propOrder = {
    "dire",
    "idpe",
    "nombre",
    "tel"
})
public class List1Proveedor {

    protected String dire;
    protected int idpe;
    protected String nombre;
    protected int tel;

    /**
     * Obtiene el valor de la propiedad dire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDire() {
        return dire;
    }

    /**
     * Define el valor de la propiedad dire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDire(String value) {
        this.dire = value;
    }

    /**
     * Obtiene el valor de la propiedad idpe.
     * 
     */
    public int getIdpe() {
        return idpe;
    }

    /**
     * Define el valor de la propiedad idpe.
     * 
     */
    public void setIdpe(int value) {
        this.idpe = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tel.
     * 
     */
    public int getTel() {
        return tel;
    }

    /**
     * Define el valor de la propiedad tel.
     * 
     */
    public void setTel(int value) {
        this.tel = value;
    }

}
