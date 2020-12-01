//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.11.30 at 05:04:43 PM GMT
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for StepUserDefinedValueUpdateType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="StepUserDefinedValueUpdateType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AllData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ApprovalUserName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ApprovalUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ForeignObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HeldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverrideUDFRAGType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="None"/&amp;gt;
 *               &amp;lt;enumeration value="Red"/&amp;gt;
 *               &amp;lt;enumeration value="Yellow"/&amp;gt;
 *               &amp;lt;enumeration value="Green"/&amp;gt;
 *               &amp;lt;enumeration value="Blue"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OverrideUdfCodeId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OverrideUdfCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverrideUdfEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverrideUdfInteger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverrideUdfNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="-1.0E12"/&amp;gt;
 *               &amp;lt;maxInclusive value="1.0E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OverrideUdfStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverrideUdfText" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PendingUDFRAGType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="None"/&amp;gt;
 *               &amp;lt;enumeration value="Red"/&amp;gt;
 *               &amp;lt;enumeration value="Yellow"/&amp;gt;
 *               &amp;lt;enumeration value="Green"/&amp;gt;
 *               &amp;lt;enumeration value="Blue"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PendingUdfCodeId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="0.0"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PendingUdfCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingUdfEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingUdfInteger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingUdfNumber" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&amp;gt;
 *               &amp;lt;minInclusive value="-1.0E12"/&amp;gt;
 *               &amp;lt;maxInclusive value="1.0E12"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="PendingUdfStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PendingUdfText" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RejectedBy" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="RejectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResubmittedBy" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResubmittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Status" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Pending"/&amp;gt;
 *               &amp;lt;enumeration value="Held"/&amp;gt;
 *               &amp;lt;enumeration value="Approved"/&amp;gt;
 *               &amp;lt;enumeration value="Rejected"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UDFDataType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Text"/&amp;gt;
 *               &amp;lt;enumeration value="Start Date"/&amp;gt;
 *               &amp;lt;enumeration value="Finish Date"/&amp;gt;
 *               &amp;lt;enumeration value="Cost"/&amp;gt;
 *               &amp;lt;enumeration value="Double"/&amp;gt;
 *               &amp;lt;enumeration value="Integer"/&amp;gt;
 *               &amp;lt;enumeration value="Indicator"/&amp;gt;
 *               &amp;lt;enumeration value="Code"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UDFTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "StepUserDefinedValueUpdateType", propOrder =
{
   "allData",
   "approvalDate",
   "approvalUserName",
   "approvalUserObjectId",
   "changeSetObjectId",
   "createUser",
   "date",
   "foreignObjectId",
   "heldDate",
   "overrideUDFRAGType",
   "overrideUdfCodeId",
   "overrideUdfCost",
   "overrideUdfEndDate",
   "overrideUdfInteger",
   "overrideUdfNumber",
   "overrideUdfStartDate",
   "overrideUdfText",
   "pendingUDFRAGType",
   "pendingUdfCodeId",
   "pendingUdfCost",
   "pendingUdfEndDate",
   "pendingUdfInteger",
   "pendingUdfNumber",
   "pendingUdfStartDate",
   "pendingUdfText",
   "projectObjectId",
   "rejectedBy",
   "rejectedDate",
   "requestUserObjectId",
   "resubmittedBy",
   "resubmittedDate",
   "status",
   "udfDataType",
   "udfTypeObjectId"
}) public class StepUserDefinedValueUpdateType
{

   @XmlElement(name = "AllData") protected String allData;
   @XmlElement(name = "ApprovalDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date approvalDate;
   @XmlElement(name = "ApprovalUserName") protected String approvalUserName;
   @XmlElement(name = "ApprovalUserObjectId", nillable = true) protected Integer approvalUserObjectId;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date date;
   @XmlElement(name = "ForeignObjectId") protected Integer foreignObjectId;
   @XmlElement(name = "HeldDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date heldDate;
   @XmlElement(name = "OverrideUDFRAGType") protected String overrideUDFRAGType;
   @XmlElement(name = "OverrideUdfCodeId", nillable = true) protected Double overrideUdfCodeId;
   @XmlElement(name = "OverrideUdfCost", nillable = true) protected Double overrideUdfCost;
   @XmlElement(name = "OverrideUdfEndDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date overrideUdfEndDate;
   @XmlElement(name = "OverrideUdfInteger", nillable = true) protected Integer overrideUdfInteger;
   @XmlElement(name = "OverrideUdfNumber", nillable = true) protected Double overrideUdfNumber;
   @XmlElement(name = "OverrideUdfStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date overrideUdfStartDate;
   @XmlElement(name = "OverrideUdfText") protected String overrideUdfText;
   @XmlElement(name = "PendingUDFRAGType") protected String pendingUDFRAGType;
   @XmlElement(name = "PendingUdfCodeId", nillable = true) protected Double pendingUdfCodeId;
   @XmlElement(name = "PendingUdfCost", nillable = true) protected Double pendingUdfCost;
   @XmlElement(name = "PendingUdfEndDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date pendingUdfEndDate;
   @XmlElement(name = "PendingUdfInteger", nillable = true) protected Integer pendingUdfInteger;
   @XmlElement(name = "PendingUdfNumber", nillable = true) protected Double pendingUdfNumber;
   @XmlElement(name = "PendingUdfStartDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date pendingUdfStartDate;
   @XmlElement(name = "PendingUdfText") protected String pendingUdfText;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RejectedBy") protected String rejectedBy;
   @XmlElement(name = "RejectedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date rejectedDate;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "ResubmittedBy") protected String resubmittedBy;
   @XmlElement(name = "ResubmittedDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date resubmittedDate;
   @XmlElement(name = "Status") protected String status;
   @XmlElement(name = "UDFDataType") protected String udfDataType;
   @XmlElement(name = "UDFTypeObjectId") protected Integer udfTypeObjectId;

   /**
    * Gets the value of the allData property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getAllData()
   {
      return allData;
   }

   /**
    * Sets the value of the allData property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setAllData(String value)
   {
      this.allData = value;
   }

   /**
    * Gets the value of the approvalDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getApprovalDate()
   {
      return approvalDate;
   }

   /**
    * Sets the value of the approvalDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApprovalDate(Date value)
   {
      this.approvalDate = value;
   }

   /**
    * Gets the value of the approvalUserName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getApprovalUserName()
   {
      return approvalUserName;
   }

   /**
    * Sets the value of the approvalUserName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setApprovalUserName(String value)
   {
      this.approvalUserName = value;
   }

   /**
    * Gets the value of the approvalUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getApprovalUserObjectId()
   {
      return approvalUserObjectId;
   }

   /**
    * Sets the value of the approvalUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setApprovalUserObjectId(Integer value)
   {
      this.approvalUserObjectId = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getChangeSetObjectId()
   {
      return changeSetObjectId;
   }

   /**
    * Sets the value of the changeSetObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setChangeSetObjectId(Integer value)
   {
      this.changeSetObjectId = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the date property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDate(Date value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the foreignObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getForeignObjectId()
   {
      return foreignObjectId;
   }

   /**
    * Sets the value of the foreignObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setForeignObjectId(Integer value)
   {
      this.foreignObjectId = value;
   }

   /**
    * Gets the value of the heldDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getHeldDate()
   {
      return heldDate;
   }

   /**
    * Sets the value of the heldDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setHeldDate(Date value)
   {
      this.heldDate = value;
   }

   /**
    * Gets the value of the overrideUDFRAGType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOverrideUDFRAGType()
   {
      return overrideUDFRAGType;
   }

   /**
    * Sets the value of the overrideUDFRAGType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideUDFRAGType(String value)
   {
      this.overrideUDFRAGType = value;
   }

   /**
    * Gets the value of the overrideUdfCodeId property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverrideUdfCodeId()
   {
      return overrideUdfCodeId;
   }

   /**
    * Sets the value of the overrideUdfCodeId property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverrideUdfCodeId(Double value)
   {
      this.overrideUdfCodeId = value;
   }

   /**
    * Gets the value of the overrideUdfCost property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverrideUdfCost()
   {
      return overrideUdfCost;
   }

   /**
    * Sets the value of the overrideUdfCost property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverrideUdfCost(Double value)
   {
      this.overrideUdfCost = value;
   }

   /**
    * Gets the value of the overrideUdfEndDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getOverrideUdfEndDate()
   {
      return overrideUdfEndDate;
   }

   /**
    * Sets the value of the overrideUdfEndDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideUdfEndDate(Date value)
   {
      this.overrideUdfEndDate = value;
   }

   /**
    * Gets the value of the overrideUdfInteger property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getOverrideUdfInteger()
   {
      return overrideUdfInteger;
   }

   /**
    * Sets the value of the overrideUdfInteger property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setOverrideUdfInteger(Integer value)
   {
      this.overrideUdfInteger = value;
   }

   /**
    * Gets the value of the overrideUdfNumber property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverrideUdfNumber()
   {
      return overrideUdfNumber;
   }

   /**
    * Sets the value of the overrideUdfNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverrideUdfNumber(Double value)
   {
      this.overrideUdfNumber = value;
   }

   /**
    * Gets the value of the overrideUdfStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getOverrideUdfStartDate()
   {
      return overrideUdfStartDate;
   }

   /**
    * Sets the value of the overrideUdfStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideUdfStartDate(Date value)
   {
      this.overrideUdfStartDate = value;
   }

   /**
    * Gets the value of the overrideUdfText property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOverrideUdfText()
   {
      return overrideUdfText;
   }

   /**
    * Sets the value of the overrideUdfText property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOverrideUdfText(String value)
   {
      this.overrideUdfText = value;
   }

   /**
    * Gets the value of the pendingUDFRAGType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPendingUDFRAGType()
   {
      return pendingUDFRAGType;
   }

   /**
    * Sets the value of the pendingUDFRAGType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingUDFRAGType(String value)
   {
      this.pendingUDFRAGType = value;
   }

   /**
    * Gets the value of the pendingUdfCodeId property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingUdfCodeId()
   {
      return pendingUdfCodeId;
   }

   /**
    * Sets the value of the pendingUdfCodeId property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingUdfCodeId(Double value)
   {
      this.pendingUdfCodeId = value;
   }

   /**
    * Gets the value of the pendingUdfCost property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingUdfCost()
   {
      return pendingUdfCost;
   }

   /**
    * Sets the value of the pendingUdfCost property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingUdfCost(Double value)
   {
      this.pendingUdfCost = value;
   }

   /**
    * Gets the value of the pendingUdfEndDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getPendingUdfEndDate()
   {
      return pendingUdfEndDate;
   }

   /**
    * Sets the value of the pendingUdfEndDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingUdfEndDate(Date value)
   {
      this.pendingUdfEndDate = value;
   }

   /**
    * Gets the value of the pendingUdfInteger property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getPendingUdfInteger()
   {
      return pendingUdfInteger;
   }

   /**
    * Sets the value of the pendingUdfInteger property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setPendingUdfInteger(Integer value)
   {
      this.pendingUdfInteger = value;
   }

   /**
    * Gets the value of the pendingUdfNumber property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getPendingUdfNumber()
   {
      return pendingUdfNumber;
   }

   /**
    * Sets the value of the pendingUdfNumber property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setPendingUdfNumber(Double value)
   {
      this.pendingUdfNumber = value;
   }

   /**
    * Gets the value of the pendingUdfStartDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getPendingUdfStartDate()
   {
      return pendingUdfStartDate;
   }

   /**
    * Sets the value of the pendingUdfStartDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingUdfStartDate(Date value)
   {
      this.pendingUdfStartDate = value;
   }

   /**
    * Gets the value of the pendingUdfText property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPendingUdfText()
   {
      return pendingUdfText;
   }

   /**
    * Sets the value of the pendingUdfText property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPendingUdfText(String value)
   {
      this.pendingUdfText = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the rejectedBy property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRejectedBy()
   {
      return rejectedBy;
   }

   /**
    * Sets the value of the rejectedBy property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRejectedBy(String value)
   {
      this.rejectedBy = value;
   }

   /**
    * Gets the value of the rejectedDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getRejectedDate()
   {
      return rejectedDate;
   }

   /**
    * Sets the value of the rejectedDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRejectedDate(Date value)
   {
      this.rejectedDate = value;
   }

   /**
    * Gets the value of the requestUserObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getRequestUserObjectId()
   {
      return requestUserObjectId;
   }

   /**
    * Sets the value of the requestUserObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the resubmittedBy property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResubmittedBy()
   {
      return resubmittedBy;
   }

   /**
    * Sets the value of the resubmittedBy property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setResubmittedBy(String value)
   {
      this.resubmittedBy = value;
   }

   /**
    * Gets the value of the resubmittedDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getResubmittedDate()
   {
      return resubmittedDate;
   }

   /**
    * Sets the value of the resubmittedDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setResubmittedDate(Date value)
   {
      this.resubmittedDate = value;
   }

   /**
    * Gets the value of the status property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

   /**
    * Gets the value of the udfDataType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getUDFDataType()
   {
      return udfDataType;
   }

   /**
    * Sets the value of the udfDataType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setUDFDataType(String value)
   {
      this.udfDataType = value;
   }

   /**
    * Gets the value of the udfTypeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUDFTypeObjectId()
   {
      return udfTypeObjectId;
   }

   /**
    * Sets the value of the udfTypeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUDFTypeObjectId(Integer value)
   {
      this.udfTypeObjectId = value;
   }

}
