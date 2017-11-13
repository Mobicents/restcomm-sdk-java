/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.restcomm.connect.java.sdk.rcml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Kleber Damasco kleber.damasco@hashtech.com.br
 * @author Ricardo Limonta limonta@hashtech.com.br
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Redirect implements GenericBuilder<Redirect> {

    @XmlAttribute
    protected String method;

    @XmlValue
    protected String address;

    public Redirect() {
    }

    public String getAddress() {
        return address;
    }

    public String getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Redirect [method=" + method + "]";
    }

    public Redirect address(String address) {
        this.address = address;
        return this;
    }

    public Redirect method(MethodType method) {
        this.method = method.name();
        return this;
    }

    public Redirect build() {
        return this;
    }
}
