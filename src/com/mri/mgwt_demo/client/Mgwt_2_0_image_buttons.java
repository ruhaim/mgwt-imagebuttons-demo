package com.mri.mgwt_demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.MGWTSettings.ViewPort;
import com.googlecode.mgwt.ui.client.widget.animation.AnimationWidget;
import com.googlecode.mgwt.ui.client.widget.animation.bundle.PopAnimation;
import com.googlecode.mgwt.ui.client.widget.button.ImageButton;
import com.googlecode.mgwt.ui.client.widget.button.ImageButtonAbstractAppearance;
import com.googlecode.mgwt.ui.client.widget.button.image.AboutImageButton;
import com.googlecode.mgwt.ui.client.widget.header.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.header.HeaderTitle;
import com.googlecode.mgwt.ui.client.widget.image.ImageHolder;
import com.googlecode.mgwt.ui.client.widget.list.celllist.BasicCell;
import com.googlecode.mgwt.ui.client.widget.list.celllist.CellList;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FixedSpacer;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexSpacer;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;
import com.mri.mgwt_demo.client.view.ButtonsPanel;
import com.mri.mgwt_demo.client.view.ButtonsPanelUIBinder;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Mgwt_2_0_image_buttons implements EntryPoint {

	private AnimationWidget animationWidget;

	public void onModuleLoad() {
		ViewPort viewPort = new MGWTSettings.ViewPort();
	    viewPort.setUserScaleAble(false).setMinimumScale(1.0).setMinimumScale(1.0).setMaximumScale(1.0);

	    MGWTSettings settings = new MGWTSettings();
	    settings.setViewPort(viewPort);
	    settings.setIconUrl("logo.png");
	    settings.setFullscreen(true);
	    settings.setFixIOS71BodyBug(true);
	    settings.setPreventScrolling(true);

	    MGWT.applySettings(settings);

	    
	    animationWidget = new AnimationWidget();
	    RootPanel.get().add(animationWidget);
	    
	    createButtons();
	}

	private void createButtons() {
		RootFlexPanel main = new RootFlexPanel();

		HeaderPanel headerPanel = new HeaderPanel();

		headerPanel.add(new FixedSpacer());
		headerPanel.add(new FlexSpacer());
		headerPanel.add(new HeaderTitle("ImageButtons"));
		
		headerPanel.add(new FlexSpacer());

		main.add(headerPanel);

		FlexPanel fp = new FlexPanel();

		ButtonsPanel buttonsPanel = new ButtonsPanel();
		ButtonsPanelUIBinder buttonsPanelUIBinder = new ButtonsPanelUIBinder();
    
		fp.add(buttonsPanel);
		fp.add(buttonsPanelUIBinder);


		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setWidget(fp);
		scrollPanel.setScrollingEnabledX(false);
		main.add(scrollPanel);
//		animationWidget.setFirstWidget();
		animationWidget.setSecondWidget(main);
		animationWidget.animate(new PopAnimation(false), false, null);
	}
	
	
}
