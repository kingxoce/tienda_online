
package wsservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para firspricestock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="firspricestock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="stockmin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stockmax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idproveedor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="porcent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="exist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "firspricestock", propOrder = {
    "fechaad",
    "cost",
    "stockmin",
    "stockmax",
    "idproveedor",
    "porcent",
    "exist",
    "idproducto"
})
public class Firspricestock {

    protected String fechaad;
    protected float cost;
    protected int stockmin;
    protected int stockmax;
    protected int idproveedor;
    protected float porcent;
    protected int exist;
    protected int idproducto;

    /**
     * Obtiene el valor de la propiedad fechaad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaad() {
        return fechaad;
    }

    /**
     * Define el valor de la propiedad fechaad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaad(String value) {
        this.fechaad = value;
    }

    /**
     * Obtiene el valor de la propiedad cost.
     * 
     */
    public float getCost() {
        return cost;
    }

    /**
     * Define el valor de la propiedad cost.
     * 
     */
    public void setCost(float value) {
        this.cost = value;
    }

    /**
     * Obtiene el valor de la propiedad stockmin.
     * 
     */
    public int getStockmin() {
        return stockmin;
    }

    /**
     * Define el valor de la propiedad stockmin.
     * 
     */
    public void setStockmin(int value) {
        this.stockmin = value;
    }

    /**
     * Obtiene el valor de la propiedad stockmax.
     * 
     */
    public int getStockmax() {
        return stockmax;
    }

    /**
     * Define el valor de la propiedad stockmax.
     * 
     */
    public void setStockmax(int value) {
        this.stockmax = value;
    }

    /**
     * Obtiene el valor de la propiedad idproveedor.
     * 
     */
    public int getIdproveedor() {
        return idproveedor;
    }

    /**
     * Define el valor de la propiedad idproveedor.
     * 
     */
    public void setIdproveedor(int value) {
        this.idproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad porcent.
     * 
     */
    public float getPorcent() {
        return porcent;
    }

    /**
     * Define el valor de la propiedad porcent.
     * 
     */
    public void setPorcent(float value) {
        this.porcent = value;
    }

    /**
     * Obtiene el valor de la propiedad exist.
     * 
     */
    public int getExist() {
        return exist;
    }

    /**
     * Define el valor de la propiedad exist.
     * 
     */
    public void setExist(int value) {
        this.exist = value;
    }

    /**
     * Obtiene el valor de la propiedad idproducto.
     * 
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * Define el valor de la propiedad idproducto.
     * 
     */
    public void setIdproducto(int value) {
        this.idproducto = value;
    }

}
