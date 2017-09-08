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
package com.google.code.siren4j.component;

import com.google.code.siren4j.component.impl.ActionImpl.Method;

import java.util.List;
import java.util.Map;

/**
 * Represents a Siren Action. Actions show available behaviors an entity exposes.
 */

public interface Action extends Component{
    
    /**
     * A string that identifies the action to be performed. (Required).
     * @return never <code>null</code> or empty.
     */
    public String getName();

    /**
     * An enumerated attribute mapping to a protocol method. 
     * For HTTP, these values may be GET, PUT, POST, DELETE, or PATCH. Defaults
     * to GET (Optional).
     * @return never <code>null</code>.
     * @see Method
     */
    public Method getMethod();
    
    /**
     * The URI of the action. (Required).
     * @return never <code>null</code>.
     */
    public String getHref();
    
    /**
     * Sets the value of the href.
     * @param href cannot be <code>null</code> or empty.
     */
    public void setHref(String href);
    
    /**
     * Descriptive text about the action. (Optional).
     * @return may be <code>null</code> or empty.
     */
    public String getTitle();
    
    /**
     * The encoding type for the request. When omitted and the fields attribute exists,
     * the default value is <code>application/x-www-form-urlencoded</code>. (Optional).
     * @return never <code>null</code> or empty.
     */
    public String getType();

    /**
     * A collection of fields, expressed as an array of objects in JSON Siren such
     * as { "fields" : [{ ... }] }. See Fields. (Optional).
     * @return
     */
    public List<Field> getFields();

    /**
     * A collection of fields representing url parameters, expressed as an array of objects in JSON Siren such
     * as { "urlParams" : [{ ... }] }.
     * @return
     */
    public List<Field> getUrlParams();

    /**
     * A collection of fields representing headers, expressed as an array of objects in JSON Siren such
     * as { "headers" : [{ ... }] }.
     * @return
     */
    public List<Field> getHeaders();

    /**
     * Extra meta data for the action. Helps with possible customizations.
     * @return
     */
    public Map<String, String> getMetaData();

}