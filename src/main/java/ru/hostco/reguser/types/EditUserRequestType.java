//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.04 at 06:16:44 PM YEKT 
//


package ru.hostco.reguser.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0417\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u043e\u0432 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f \u0432 \u0435\u0434\u0438\u043d\u043e\u0439 \u0431\u0430\u0437\u0435 \u0434\u0430\u043d\u043d\u044b\u0445 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u0435\u0439 \u0437\u0434\u0440\u0430\u0432\u043e\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u044f \u0425\u041c\u0410\u041e-\u042e\u0433\u0440\u044b
 * 
 * <p>Java class for EditUserRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditUserRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/reguser/types}LoginType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mcode" type="{http://www.hostco.ru/reguser/types}MuCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.hostco.ru/reguser/types}token"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditUserRequestType", propOrder = {
    "mcode"
})
public class EditUserRequestType
    extends LoginType
{

    protected String mcode;
    @XmlAttribute(name = "token", namespace = "http://www.hostco.ru/reguser/types")
    protected String token;

    /**
     * Gets the value of the mcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcode() {
        return mcode;
    }

    /**
     * Sets the value of the mcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcode(String value) {
        this.mcode = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
