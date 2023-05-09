
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para seguntempoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="seguntempoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idtempo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguntempoc", propOrder = {
    "direimg",
    "fi",
    "fn",
    "idtempo",
    "name"
})
public class Seguntempoc {

    protected String direimg;
    protected String fi;
    protected String fn;
    protected int idtempo;
    protected String name;

    /**
     * Obtiene el valor de la propiedad direimg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireimg() {
        return direimg;
    }

    /**
     * Define el valor de la propiedad direimg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireimg(String value) {
        this.direimg = value;
    }

    /**
     * Obtiene el valor de la propiedad fi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFi() {
        return fi;
    }

    /**
     * Define el valor de la propiedad fi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFi(String value) {
        this.fi = value;
    }

    /**
     * Obtiene el valor de la propiedad fn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFn() {
        return fn;
    }

    /**
     * Define el valor de la propiedad fn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFn(String value) {
        this.fn = value;
    }

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
