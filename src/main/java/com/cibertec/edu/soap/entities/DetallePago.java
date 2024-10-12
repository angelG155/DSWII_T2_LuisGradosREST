//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package com.cibertec.edu.soap.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetallePago complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="DetallePago">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="idPago" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="montoTotalPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetallePago", propOrder = {
    "idPago",
    "fechaPago",
    "montoTotalPago",
    "moneda"
})
public class DetallePago {

    protected long idPago;
    @XmlElement(required = true)
    protected String fechaPago;
    protected double montoTotalPago;
    @XmlElement(required = true)
    protected String moneda;

    /**
     * Obtiene el valor de la propiedad idPago.
     * 
     */
    public long getIdPago() {
        return idPago;
    }

    /**
     * Define el valor de la propiedad idPago.
     * 
     */
    public void setIdPago(long value) {
        this.idPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalPago.
     * 
     */
    public double getMontoTotalPago() {
        return montoTotalPago;
    }

    /**
     * Define el valor de la propiedad montoTotalPago.
     * 
     */
    public void setMontoTotalPago(double value) {
        this.montoTotalPago = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

}
