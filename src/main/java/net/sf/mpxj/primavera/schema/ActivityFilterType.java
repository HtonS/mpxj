//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.11.30 at 05:04:43 PM GMT
//

package net.sf.mpxj.primavera.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for ActivityFilterType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivityFilterType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityFilterId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActivityFilterName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="FilterCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FilterCriteriaConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FilterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityFilterType", propOrder =
{
   "activityFilterId",
   "activityFilterName",
   "filterCriteria",
   "filterCriteriaConfig",
   "filterType",
   "userId"
}) public class ActivityFilterType
{

   @XmlElement(name = "ActivityFilterId") protected Integer activityFilterId;
   @XmlElement(name = "ActivityFilterName") protected String activityFilterName;
   @XmlElement(name = "FilterCriteria") protected String filterCriteria;
   @XmlElement(name = "FilterCriteriaConfig") protected String filterCriteriaConfig;
   @XmlElement(name = "FilterType") protected String filterType;
   @XmlElement(name = "UserId", nillable = true) protected Integer userId;

   /**
    * Gets the value of the activityFilterId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityFilterId()
   {
      return activityFilterId;
   }

   /**
    * Sets the value of the activityFilterId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityFilterId(Integer value)
   {
      this.activityFilterId = value;
   }

   /**
    * Gets the value of the activityFilterName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityFilterName()
   {
      return activityFilterName;
   }

   /**
    * Sets the value of the activityFilterName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityFilterName(String value)
   {
      this.activityFilterName = value;
   }

   /**
    * Gets the value of the filterCriteria property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getFilterCriteria()
   {
      return filterCriteria;
   }

   /**
    * Sets the value of the filterCriteria property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFilterCriteria(String value)
   {
      this.filterCriteria = value;
   }

   /**
    * Gets the value of the filterCriteriaConfig property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getFilterCriteriaConfig()
   {
      return filterCriteriaConfig;
   }

   /**
    * Sets the value of the filterCriteriaConfig property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFilterCriteriaConfig(String value)
   {
      this.filterCriteriaConfig = value;
   }

   /**
    * Gets the value of the filterType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getFilterType()
   {
      return filterType;
   }

   /**
    * Sets the value of the filterType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFilterType(String value)
   {
      this.filterType = value;
   }

   /**
    * Gets the value of the userId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserId()
   {
      return userId;
   }

   /**
    * Sets the value of the userId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUserId(Integer value)
   {
      this.userId = value;
   }

}
