/*******************************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Erik R Serating
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *********************************************************************************************/
package com.google.code.siren4j.component.builder;

import org.apache.commons.lang.ArrayUtils;

import com.google.code.siren4j.component.Link;
import com.google.code.siren4j.component.impl.LinkImpl;
import com.google.code.siren4j.error.BuilderValidationException;

public class LinkBuilder extends BaseBuilder<Link> {

    private LinkBuilder() {

    }

    public static LinkBuilder newInstance() {
	return new LinkBuilder();
    }

    public LinkBuilder setRelationship(String... rel) {
	addStep("setRel", new Object[] { rel });
	return this;
    }

    public LinkBuilder setHref(String href) {
	addStep("setHref", new Object[] { href });
	return this;
    }

    @Override
    protected Link createInstance() {
	return new LinkImpl();
    }

    @Override
    protected void validate(Link obj) {
	String requiredMsg = "Required property.";
	if (obj.getRel() == null || ArrayUtils.isEmpty(obj.getRel())) {
	    throw new BuilderValidationException("rel", obj.getClass(),
		    requiredMsg);
	}
	if (obj.getHref() == null) {
	    throw new BuilderValidationException("href", obj.getClass(),
		    requiredMsg);
	}
    }

}