
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarPorIDcategoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarPorIDcategoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarPorIDcategoria", propOrder = {
    "idcategoria"
})
public class ListarPorIDcategoria {

    protected int idcategoria;

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

}
