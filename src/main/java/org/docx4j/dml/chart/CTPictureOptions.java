/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.chart;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_PictureOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PictureOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyToFront" type="{http://schemas.openxmlformats.org/drawingml/2006/chart}CT_Boolean" minOccurs="0"/>
 *         &lt;element name="applyToSides" type="{http://schemas.openxmlformats.org/drawingml/2006/chart}CT_Boolean" minOccurs="0"/>
 *         &lt;element name="applyToEnd" type="{http://schemas.openxmlformats.org/drawingml/2006/chart}CT_Boolean" minOccurs="0"/>
 *         &lt;element name="pictureFormat" type="{http://schemas.openxmlformats.org/drawingml/2006/chart}CT_PictureFormat" minOccurs="0"/>
 *         &lt;element name="pictureStackUnit" type="{http://schemas.openxmlformats.org/drawingml/2006/chart}CT_PictureStackUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PictureOptions", propOrder = {
    "applyToFront",
    "applyToSides",
    "applyToEnd",
    "pictureFormat",
    "pictureStackUnit"
})
public class CTPictureOptions {

    protected CTBoolean applyToFront;
    protected CTBoolean applyToSides;
    protected CTBoolean applyToEnd;
    protected CTPictureFormat pictureFormat;
    protected CTPictureStackUnit pictureStackUnit;

    /**
     * Gets the value of the applyToFront property.
     * 
     * @return
     *     possible object is
     *     {@link CTBoolean }
     *     
     */
    public CTBoolean getApplyToFront() {
        return applyToFront;
    }

    /**
     * Sets the value of the applyToFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBoolean }
     *     
     */
    public void setApplyToFront(CTBoolean value) {
        this.applyToFront = value;
    }

    /**
     * Gets the value of the applyToSides property.
     * 
     * @return
     *     possible object is
     *     {@link CTBoolean }
     *     
     */
    public CTBoolean getApplyToSides() {
        return applyToSides;
    }

    /**
     * Sets the value of the applyToSides property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBoolean }
     *     
     */
    public void setApplyToSides(CTBoolean value) {
        this.applyToSides = value;
    }

    /**
     * Gets the value of the applyToEnd property.
     * 
     * @return
     *     possible object is
     *     {@link CTBoolean }
     *     
     */
    public CTBoolean getApplyToEnd() {
        return applyToEnd;
    }

    /**
     * Sets the value of the applyToEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBoolean }
     *     
     */
    public void setApplyToEnd(CTBoolean value) {
        this.applyToEnd = value;
    }

    /**
     * Gets the value of the pictureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CTPictureFormat }
     *     
     */
    public CTPictureFormat getPictureFormat() {
        return pictureFormat;
    }

    /**
     * Sets the value of the pictureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPictureFormat }
     *     
     */
    public void setPictureFormat(CTPictureFormat value) {
        this.pictureFormat = value;
    }

    /**
     * Gets the value of the pictureStackUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CTPictureStackUnit }
     *     
     */
    public CTPictureStackUnit getPictureStackUnit() {
        return pictureStackUnit;
    }

    /**
     * Sets the value of the pictureStackUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTPictureStackUnit }
     *     
     */
    public void setPictureStackUnit(CTPictureStackUnit value) {
        this.pictureStackUnit = value;
    }

}
