package com.mri.mgwt_demo.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ButtonsPanelUIBinder extends Composite  {

	private static ButtonsPanelUIBinderUiBinder uiBinder = GWT
			.create(ButtonsPanelUIBinderUiBinder.class);

	interface ButtonsPanelUIBinderUiBinder extends
			UiBinder<Widget, ButtonsPanelUIBinder> {
	}

	public ButtonsPanelUIBinder() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	public ButtonsPanelUIBinder(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}



}
