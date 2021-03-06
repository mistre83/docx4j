/*
 *  Copyright 2009, Plutext Pty Ltd.
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
package org.docx4j.model.properties.paragraph;

import java.math.BigInteger;

import org.apache.log4j.Logger;
import org.docx4j.UnitsOfMeasurement;
import org.docx4j.jaxb.Context;
import org.docx4j.model.properties.Property;
import org.docx4j.wml.PPr;
import org.docx4j.wml.PPrBase.Ind;
import org.docx4j.wml.PPrBase.Spacing;
import org.w3c.dom.Element;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.CSSValue;

public class LineSpacing extends AbstractParagraphProperty {
	
	protected static Logger log = Logger.getLogger(LineSpacing.class);		
	
	public final static String CSS_NAME = "line-height"; //??  	
	public final static String FO_NAME  = "line-height"; 
	
	/**
	 * @since 2.7.2
	 */	
	public String getCssName() {
		return CSS_NAME;
	}	
	
	/*
	 *       <w:spacing w:line="276" />  // twips
	 */
	
	public LineSpacing(BigInteger val) {
		this.setObject(val);
	}
	
	public LineSpacing(CSSValue value) {	
		
		debug(CSS_NAME, value);
		
		CSSPrimitiveValue cssPrimitiveValue = (CSSPrimitiveValue)value;	
		short ignored = 1;
		float fVal = cssPrimitiveValue.getFloatValue(ignored); // unit type ignored in cssparser

		int twip;
		
		short type = cssPrimitiveValue.getPrimitiveType();
		if (CSSPrimitiveValue.CSS_IN == type) {
			twip = UnitsOfMeasurement.inchToTwip(fVal);
		} else if (CSSPrimitiveValue.CSS_MM == type) {
			twip = UnitsOfMeasurement.mmToTwip(fVal);		
		} else if (CSSPrimitiveValue.CSS_PERCENTAGE == type) {
			twip = twipFromPercentage(fVal);		
		} else {
			log.error("No support for unit " + type);
			twip = 0;
		}
		this.setObject(BigInteger.valueOf(twip) );
		
	}

	int MAGIC_NUMBER = 240;
	
	private int twipFromPercentage(float fVal) {		
		return Math.round(MAGIC_NUMBER*fVal/100);		
	}
	private int twipToPercentage(int val) {		
		return Math.round(100*val/MAGIC_NUMBER);		
	}
	
	@Override
	public String getCssProperty() {
		return  composeCss(CSS_NAME, twipToPercentage(
				((BigInteger)this.getObject()).intValue())+"%" );		
	}
	

	@Override
	public void setXslFO(Element foElement) {

		foElement.setAttribute(FO_NAME, twipToPercentage(
				((BigInteger)this.getObject()).intValue())+"%" );		
	}

	@Override
	public void set(PPr pPr) {
		if (pPr.getSpacing()==  null) {
			Spacing spacing = Context.getWmlObjectFactory().createPPrBaseSpacing();
			pPr.setSpacing(spacing);
		}
		pPr.getSpacing().setLine((BigInteger)this.getObject() );
	}
	
}
