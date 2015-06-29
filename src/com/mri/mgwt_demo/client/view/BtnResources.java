package com.mri.mgwt_demo.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface BtnResources extends ClientBundle {
	public static final BtnResources INSTANCE =  GWT.create(BtnResources.class);

	  @Source("btn.css")
	  public MyResources css();

	  
	interface MyResources extends CssResource {
	  String btn();
	}
}
