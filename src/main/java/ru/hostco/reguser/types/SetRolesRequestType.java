//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.04 at 06:16:44 PM YEKT 
//


package ru.hostco.reguser.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * \u0417\u0430\u043f\u0440\u043e\u0441 \u043d\u0430 \u043f\u0440\u0438\u0441\u0432\u0430\u0438\u0432\u0430\u043d\u0438\u0435 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044e \u0441\u043f\u0438\u0441\u043a\u0430 \u0440\u043e\u043b\u0435\u0439
 * 
 * <p>Java class for SetRolesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetRolesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/reguser/types}UserIDType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleList" type="{http://www.hostco.ru/reguser/types}RoleListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetRolesRequestType", propOrder = {
    "roleList"
})
public class SetRolesRequestType
    extends UserIDType
{

    @XmlElement(name = "RoleList", required = true)
    protected RoleListType roleList;

    /**
     * Gets the value of the roleList property.
     * 
     * @return
     *     possible object is
     *     {@link RoleListType }
     *     
     */
    public RoleListType getRoleList() {
        return roleList;
    }

    /**
     * Sets the value of the roleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleListType }
     *     
     */
    public void setRoleList(RoleListType value) {
        this.roleList = value;
    }

}
