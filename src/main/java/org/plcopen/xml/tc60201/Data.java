package org.plcopen.xml.tc60201;

import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java-Klasse für anonymous complex type.
 * <p>
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="handleUnknown" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="preserve"/>
 *             &lt;enumeration value="discard"/>
 *             &lt;enumeration value="implementation"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "any"
})
public class Data implements PlcNode {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String name;
    @XmlAttribute(name = "handleUnknown", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handleUnknown;

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     *
     * @return possible object is
     * {@link Element }
     * {@link Object }
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link Element }
     *              {@link Object }
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der handleUnknown-Eigenschaft ab.
     *
     * @return possible object is
     * {@link String }
     */
    public String getHandleUnknown() {
        return handleUnknown;
    }

    /**
     * Legt den Wert der handleUnknown-Eigenschaft fest.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHandleUnknown(String value) {
        this.handleUnknown = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "any=" + any +
                ", name='" + name + '\'' +
                ", handleUnknown='" + handleUnknown + '\'' +
                '}';
    }
}
