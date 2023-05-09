
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para categoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="categoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direccionimg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idcategoria2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoria", propOrder = {
    "direccionimg",
    "idcategoria",
    "idcategoria2",
    "nombre"
})
public class Categoria {

    protected String direccionimg;
    protected int idcategoria;
    protected int idcategoria2;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad direccionimg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionimg() {
        return direccionimg;
    }

    /**
     * Define el valor de la propiedad direccionimg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionimg(String value) {
        this.direccionimg = value;
    }

    /**
     * Obtiene el valor de la propiedad idcategoria.
     * 
     */
    public int getIdcategoria() {
        return idcategoria;
    }

    /**
     * Define el valor de la propiedad idcategoria.
     * 
     */
    public void setIdcategoria(int value) {
        this.idcategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad idcategoria2.
     * 
     */
    public int getIdcategoria2() {
        return idcategoria2;
    }

    /**
     * Define el valor de la propiedad idcategoria2.
     * 
     */
    public void setIdcategoria2(int value) {
        this.idcategoria2 = value;
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

}
