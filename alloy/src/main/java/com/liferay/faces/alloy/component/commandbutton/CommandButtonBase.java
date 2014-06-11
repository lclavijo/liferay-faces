/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.commandbutton;
//J-

import javax.annotation.Generated;
import javax.faces.component.html.HtmlCommandButton;

import com.liferay.faces.util.component.Styleable;

/**
 * @author  Bruno Basto
 * @author  Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class CommandButtonBase extends HtmlCommandButton implements Styleable {

	// Public Constants
	public static final String AUTOFOCUS = "autofocus";
	public static final String DISABLED = "disabled";
	public static final String STYLE = "style";
	public static final String STYLE_CLASS = "styleClass";
	public static final String TYPE = "type";

	public Boolean isAutofocus() {
		return (Boolean) getStateHelper().eval(AUTOFOCUS, null);
	}

	public void setAutofocus(Boolean autofocus) {
		getStateHelper().put(AUTOFOCUS, autofocus);
	}

	public boolean isDisabled() {
		return (Boolean) getStateHelper().eval(DISABLED, false);
	}

	public void setDisabled(boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	@Override
	public String getStyle() {
		return (String) getStateHelper().eval(STYLE, null);
	}

	@Override
	public void setStyle(String style) {
		getStateHelper().put(STYLE, style);
	}

	@Override
	public String getStyleClass() {
		return (String) getStateHelper().eval(STYLE_CLASS, null);
	}

	@Override
	public void setStyleClass(String styleClass) {
		getStateHelper().put(STYLE_CLASS, styleClass);
	}

	public String getType() {
		return (String) getStateHelper().eval(TYPE, null);
	}

	public void setType(String type) {
		getStateHelper().put(TYPE, type);
	}
}
//J+
