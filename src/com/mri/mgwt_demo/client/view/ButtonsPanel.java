package com.mri.mgwt_demo.client.view;

import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.button.Button;
import com.googlecode.mgwt.ui.client.widget.button.ImageButton;
import com.googlecode.mgwt.ui.client.widget.button.image.*;
import com.googlecode.mgwt.ui.client.widget.buttonbar.ButtonBar;
import com.googlecode.mgwt.ui.client.widget.image.ImageHolder;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPropertyHelper;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPropertyHelper.Alignment;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPropertyHelper.Justification;
import com.googlecode.mgwt.ui.client.widget.panel.flex.FlexPropertyHelper.Orientation;


public class ButtonsPanel extends FlexPanel {
	ImageButton ibtn;
	public ButtonsPanel(){
		ImageButtonData[] buttonDataArr = {
				//--A
				new ImageButtonData(ImageHolder.get().about(), new AboutImageButton(), "AboutImageButton"),
				new ImageButtonData(ImageHolder.get().accept(), new AcceptImageButton(), "AcceptImageButton"),
				new ImageButtonData(ImageHolder.get().accounts(), new AccountsImageButton(), "AccountsImageButton"),
				new ImageButtonData(ImageHolder.get().addAlarm(), new AddalarmImageButton(), "AddalarmImageButton"),
				new ImageButtonData(ImageHolder.get().addGroup(), new AddgroupImageButton(), "AddgroupImageButton"),
				new ImageButtonData(ImageHolder.get().addPerson(), new AddpersonImageButton(), "AddpersonImageButton"),
				new ImageButtonData(ImageHolder.get().addToQueue(), new AddtoqueueImageButton(), "AddtoqueueImageButton"),
				new ImageButtonData(ImageHolder.get().airplaneModeOff(), new AirplanemodeoffImageButton(), "AirplanemodeoffImageButton"),
				new ImageButtonData(ImageHolder.get().airplaneModeOn(), new AirplanemodeonImageButton(), "AirplanemodeonImageButton"),
				new ImageButtonData(ImageHolder.get().alarms(), new AlarmsImageButton(), "AlarmsImageButton"),
				new ImageButtonData(ImageHolder.get().attachment(), new AttachmentImageButton(), "AttachmentImageButton"),
				//--B
				new ImageButtonData(ImageHolder.get().back(), new BackImageButton(), "BackImageButton"),
				new ImageButtonData(ImageHolder.get().backspace(), new BackspaceImageButton(), "BackspaceImageButton"),
				new ImageButtonData(ImageHolder.get().bad(), new BadImageButton(), "BadImageButton"),
				new ImageButtonData(ImageHolder.get().battery(), new BatteryImageButton(), "BatteryImageButton"),
				new ImageButtonData(ImageHolder.get().bightnessLow(), new BightnesslowImageButton(), "BightnesslowImageButton"),
				new ImageButtonData(ImageHolder.get().bluetooth(), new BluetoothImageButton(), "BluetoothImageButton"),

				new ImageButtonData(ImageHolder.get().bluetoothConnected(), new BluetoothconnectedImageButton(), "BluetoothconnectedImageButton"),
				new ImageButtonData(ImageHolder.get().bluetoothSearching(), new BluetoothsearchingImageButton(), "BluetoothsearchingImageButton"),
				new ImageButtonData(ImageHolder.get().brightnessAuto(), new BrightnessautoImageButton(), "BrightnessautoImageButton"),
				new ImageButtonData(ImageHolder.get().brightnessHigh(), new BrightnesshighImageButton(), "BluetoothImageButton"),
				new ImageButtonData(ImageHolder.get().brightnessMedium(), new BrightnessmediumImageButton(), "BluetoothImageButton"),
				//--C
				new ImageButtonData(ImageHolder.get().call(), new CallImageButton(), "CallImageButton"),
				new ImageButtonData(ImageHolder.get().camera(), new CameraImageButton(), "CameraImageButton"),
				new ImageButtonData(ImageHolder.get().cancel(), new CancelImageButton(), "CancelImageButton"),
				new ImageButtonData(ImageHolder.get().cast(), new CastImageButton(), "CastImageButton"),
				new ImageButtonData(ImageHolder.get().ccBcc(), new CcbccImageButton(), "CcbccImageButton"),
				new ImageButtonData(ImageHolder.get().chat(), new ChatImageButton(), "ChatImageButton"),
				new ImageButtonData(ImageHolder.get().cloud(), new CloudImageButton(), "CloudImageButton"),
				new ImageButtonData(ImageHolder.get().collapse(), new CollapseImageButton(), "CollapseImageButton"),
				new ImageButtonData(ImageHolder.get().collection(), new CollectionImageButton(), "CollectionImageButton"),
				new ImageButtonData(ImageHolder.get().computer(), new ComputerImageButton(), "ComputerImageButton"),
				new ImageButtonData(ImageHolder.get().copy(), new CopyImageButton(), "CopyImageButton"),
				new ImageButtonData(ImageHolder.get().crop(), new CropImageButton(), "CropImageButton"),
				new ImageButtonData(ImageHolder.get().cut(), new CutImageButton(), "CutImageButton"),
				//--D
				new ImageButtonData(ImageHolder.get().dataUsage(), new DatausageImageButton(), "DatausageImageButton"),
				new ImageButtonData(ImageHolder.get().dialPad(), new DialpadImageButton(), "DialpadImageButton"),
				new ImageButtonData(ImageHolder.get().directions(), new DirectionsImageButton(), "DirectionsImageButton"),
				new ImageButtonData(ImageHolder.get().discard(), new DiscardImageButton(), "DiscardImageButton"),
				new ImageButtonData(ImageHolder.get().dock(), new DockImageButton(), "DockImageButton"),
				new ImageButtonData(ImageHolder.get().download(), new DownloadImageButton(), "DownloadImageButton"),
				//--E
				new ImageButtonData(ImageHolder.get().edit(), new EditImageButton(), "EditImageButton"),
				new ImageButtonData(ImageHolder.get().email(), new EmailImageButton(), "EmailImageButton"),
				new ImageButtonData(ImageHolder.get().endCall(), new EndcallImageButton(), "EndcallImageButton"),
				new ImageButtonData(ImageHolder.get().error(), new ErrorImageButton(), "ErrorImageButton"),
				new ImageButtonData(ImageHolder.get().event(), new EventImageButton(), "EventImageButton"),
				new ImageButtonData(ImageHolder.get().expand(), new ExpandImageButton(), "ExpandImageButton"),
				//--F
				new ImageButtonData(ImageHolder.get().fastForward(), new FastforwardImageButton(), "FastforwardImageButton"),
				new ImageButtonData(ImageHolder.get().favorite(), new FavoriteImageButton(), "FavoriteImageButton"),
				new ImageButtonData(ImageHolder.get().flashAutomatic(), new FlashautomaticImageButton(), "FlashautomaticImageButton"),
				new ImageButtonData(ImageHolder.get().flashOff(), new FlashoffImageButton(), "FlashoffImageButton"),
				new ImageButtonData(ImageHolder.get().flashOn(), new FlashonImageButton(), "FlashonImageButton"),
				new ImageButtonData(ImageHolder.get().forward(), new ForwardImageButton(), "ForwardImageButton"),
				new ImageButtonData(ImageHolder.get().fullScreen(), new FullscreenImageButton(), "FullscreenImageButton"),
				//--G
				new ImageButtonData(ImageHolder.get().gamepad(), new GamepadImageButton(), "GamepadImageButton"),
				new ImageButtonData(ImageHolder.get().good(), new GoodImageButton(), "GoodImageButton"),
				new ImageButtonData(ImageHolder.get().goToToday(), new GototodayImageButton(), "GototodayImageButton"),
				new ImageButtonData(ImageHolder.get().group(), new GroupImageButton(), "GroupImageButton"),
				//--H
				new ImageButtonData(ImageHolder.get().halfImportant(), new HalfimportantImageButton(), "HalfimportantImageButton"),
				new ImageButtonData(ImageHolder.get().headphones(), new HeadphonesImageButton(), "HeadphonesImageButton"),
				new ImageButtonData(ImageHolder.get().headset(), new HeadsetImageButton(), "HeadsetImageButton"),
				new ImageButtonData(ImageHolder.get().help(), new HelpImageButton(), "HelpImageButton"),
				//--I				
				new ImageButtonData(ImageHolder.get().important(), new ImportantImageButton(), "ImportantImageButton"),
				new ImageButtonData(ImageHolder.get().importExport(), new ImportexportImageButton(), "ImportexportImageButton"),
				//--J				
				//--K				
				new ImageButtonData(ImageHolder.get().keyboard(), new KeyboardImageButton(), "KeyboardImageButton"),
				//--L				
				new ImageButtonData(ImageHolder.get().labels(), new LabelsImageButton(), "LabelsImageButton"),
				new ImageButtonData(ImageHolder.get().locationFound(), new LocationfoundImageButton(), "LocationfoundImageButton"),
				new ImageButtonData(ImageHolder.get().locationOff(), new LocationoffImageButton(), "LocationoffImageButton"),
				new ImageButtonData(ImageHolder.get().locationSearching(), new LocationsearchingImageButton(), "LocationsearchingImageButton"),
				//--M				
				new ImageButtonData(ImageHolder.get().makeAvailableOffline(), new MakeavailableofflineImageButton(), "MakeavailableofflineImageButton"),
				new ImageButtonData(ImageHolder.get().map(), new MapImageButton(), "MapImageButton"),
				new ImageButtonData(ImageHolder.get().merge(), new MergeImageButton(), "MergeImageButton"),
				new ImageButtonData(ImageHolder.get().mic(), new MicImageButton(), "MicImageButton"),
				new ImageButtonData(ImageHolder.get().micMuted(), new MicmutedImageButton(), "MicmutedImageButton"),
				new ImageButtonData(ImageHolder.get().mouse(), new MouseImageButton(), "MouseImageButton"),
				//--N				
				new ImageButtonData(ImageHolder.get().networkCell(), new NetworkcellImageButton(), "NetworkcellImageButton"),
				new ImageButtonData(ImageHolder.get().networkWifi(), new NetworkwifiImageButton(), "NetworkwifiImageButton"),
				new ImageButtonData(ImageHolder.get().newAccount(), new NewaccountImageButton(), "NewaccountImageButton"),
				new ImageButtonData(ImageHolder.get().newAttachment(), new NewattachmentImageButton(), "NewattachmentImageButton"),
				new ImageButtonData(ImageHolder.get().newEmail(), new NewemailImageButton(), "NewemailImageButton"),
				new ImageButtonData(ImageHolder.get().newEvent(), new NeweventImageButton(), "NeweventImageButton"),
				new ImageButtonData(ImageHolder.get().newItem(), new NewImageButton(), "NewImageButton"),
				new ImageButtonData(ImageHolder.get().newLabel(), new NewlabelImageButton(), "NewlabelImageButton"),
				new ImageButtonData(ImageHolder.get().newPicture(), new NewpictureImageButton(), "NewpictureImageButton"),
				new ImageButtonData(ImageHolder.get().next(), new NextImageButton(), "NextImageButton"),
				new ImageButtonData(ImageHolder.get().nextItem(), new NextitemImageButton(), "NextitemImageButton"),
				new ImageButtonData(ImageHolder.get().notImportant(), new NotimportantImageButton(), "NotimportantImageButton"),
				new ImageButtonData(ImageHolder.get().notSecure(), new NotsecureImageButton(), "NotsecureImageButton"),
				//--O				
				new ImageButtonData(ImageHolder.get().overflow(), new OverflowImageButton(), "OverflowImageButton"),
				//--P				
				new ImageButtonData(ImageHolder.get().paste(), new PasteImageButton(), "PasteImageButton"),
				new ImageButtonData(ImageHolder.get().pause(), new PauseImageButton(), "PauseImageButton"),
				new ImageButtonData(ImageHolder.get().pauseOverVideo(), new PauseovervideoImageButton(), "PauseovervideoImageButton"),
				new ImageButtonData(ImageHolder.get().person(), new PersonImageButton(), "PersonImageButton"),
				new ImageButtonData(ImageHolder.get().phone(), new PhoneImageButton(), "PhoneImageButton"),
				new ImageButtonData(ImageHolder.get().picture(), new PictureImageButton(), "PictureImageButton"),
				new ImageButtonData(ImageHolder.get().place(), new PlaceImageButton(), "PlaceImageButton"),
				new ImageButtonData(ImageHolder.get().play(), new PlayImageButton(), "PlayImageButton"),
				new ImageButtonData(ImageHolder.get().playOverVideo(), new PlayovervideoImageButton(), "PlayovervideoImageButton"),
				new ImageButtonData(ImageHolder.get().previous(), new PreviousImageButton(), "PreviousImageButton"),
				new ImageButtonData(ImageHolder.get().previousItem(), new PreviousitemImageButton(), "PreviousitemImageButtons"),
				//--Q				
				//--R				
				new ImageButtonData(ImageHolder.get().read(), new ReadImageButton(), "ReadImageButton"),
				new ImageButtonData(ImageHolder.get().refresh(), new RefreshImageButton(), "RefreshImageButton"),
				new ImageButtonData(ImageHolder.get().remove(), new RemoveImageButton(), "RemoveImageButton"),
				new ImageButtonData(ImageHolder.get().repeat(), new RepeatImageButton(), "RepeatImageButton"),
				new ImageButtonData(ImageHolder.get().replay(), new ReplayImageButton(), "ReplayImageButton"),
				new ImageButtonData(ImageHolder.get().reply(), new ReplyImageButton(), "ReplyImageButton"),
				new ImageButtonData(ImageHolder.get().replyAll(), new ReplyallImageButton(), "ReplyallImageButton"),
				new ImageButtonData(ImageHolder.get().returnFromFullScreen(), new ReturnfromfullscreenImageButton(), "ReturnfromfullscreenImageButton"),
				new ImageButtonData(ImageHolder.get().rewind(), new RewindImageButton(), "RewindImageButton"),
				new ImageButtonData(ImageHolder.get().ringVolume(), new RingvolumeImageButton(), "RingvolumeImageButton"),
				new ImageButtonData(ImageHolder.get().rotateLeft(), new RotateleftImageButton(), "RotateleftImageButton"),
				new ImageButtonData(ImageHolder.get().rotateRight(), new RotaterightImageButton(), "RotaterightImageButton"),
				//--S				
				new ImageButtonData(ImageHolder.get().save(), new SaveImageButton(), "SaveImageButton"),
				new ImageButtonData(ImageHolder.get().screenLockedToLandscape(), new ScreenlockedtolandscapeImageButton(), "ScreenlockedtolandscapeImageButton"),
				new ImageButtonData(ImageHolder.get().screenLockedToPortrait(), new ScreenlockedtoportraitImageButton(), "ScreenlockedtoportraitImageButton"),
				new ImageButtonData(ImageHolder.get().screenRotation(), new ScreenrotationImageButton(), "ScreenrotationImageButton"),
				new ImageButtonData(ImageHolder.get().sdStorage(), new SdstorageImageButton(), "SdstorageImageButton"),
				new ImageButtonData(ImageHolder.get().search(), new SearchImageButton(), "SearchImageButton"),
				new ImageButtonData(ImageHolder.get().secure(), new SecureImageButton(), "SecureImageButton"),
				new ImageButtonData(ImageHolder.get().selectAll(), new SelectallImageButton(), "SelectallImageButton"),
				new ImageButtonData(ImageHolder.get().sendNow(), new SendnowImageButton(), "SendnowImageButton"),
				new ImageButtonData(ImageHolder.get().settings(), new SettingsImageButton(), "SettingsImageButton"),
				new ImageButtonData(ImageHolder.get().share(), new ShareImageButton(), "ShareImageButton"),
				new ImageButtonData(ImageHolder.get().shuffle(), new ShuffleImageButton(), "ShuffleImageButton"),
				new ImageButtonData(ImageHolder.get().slideshow(), new SlideshowImageButton(), "SlideshowImageButton"),
				new ImageButtonData(ImageHolder.get().sortBySize(), new SortbysizeImageButton(), "SortbysizeImageButton"),
				new ImageButtonData(ImageHolder.get().split(), new SplitImageButton(), "SplitImageButton"),
				new ImageButtonData(ImageHolder.get().stop(), new StopImageButton(), "StopImageButton"),
				new ImageButtonData(ImageHolder.get().storage(), new StorageImageButton(), "StorageImageButton"),
				new ImageButtonData(ImageHolder.get().switchCamera(), new SwitchcameraImageButton(), "SwitchcameraImageButton"),
				new ImageButtonData(ImageHolder.get().switchVideo(), new SwitchvideoImageButton(), "SwitchvideoImageButton"),
				//--T				
				new ImageButtonData(ImageHolder.get().time(), new TimeImageButton(), "TimeImageButton"),
				//--U				
				new ImageButtonData(ImageHolder.get().undo(), new UndoImageButton(), "UndoImageButton"),
				new ImageButtonData(ImageHolder.get().unread(), new UnreadImageButton(), "UnreadImageButton"),
				new ImageButtonData(ImageHolder.get().upload(), new UploadImageButton(), "UploadImageButton"),
				new ImageButtonData(ImageHolder.get().usb(), new UsbImageButton(), "UsbImageButton"),
				//--V
				new ImageButtonData(ImageHolder.get().video(), new VideoImageButton(), "VideoImageButton"),
				new ImageButtonData(ImageHolder.get().viewAsGrid(), new ViewasgridImageButton(), "ViewasgridImageButton"),
				new ImageButtonData(ImageHolder.get().viewAsList(), new ViewaslistImageButton(), "ViewaslistImageButton"),
				new ImageButtonData(ImageHolder.get().volumeMuted(), new VolumemutedImageButton(), "VolumemutedImageButton"),
				new ImageButtonData(ImageHolder.get().volumeOn(), new VolumeonImageButton(), "VolumeonImageButton"),
				//--W
				new ImageButtonData(ImageHolder.get().warning(), new WarningImageButton(), "WarningImageButton"),
				new ImageButtonData(ImageHolder.get().webSite(), new WebsiteImageButton(), "WebsiteImageButton"),
				//--X
				//--Y
				//--Z
				
		};
		
		BtnResources.INSTANCE.css().ensureInjected();
		this.addStyleName(BtnResources.INSTANCE.css().flex_flow_wrap());
		this.setJustification(Justification.START);
		this.setOrientation(Orientation.HORIZONTAL);
		FlexPropertyHelper.setFlex(el, flex);
		if(MGWT.getFormFactor().isPhone()) {
			this.setOrientation(Orientation.VERTICAL);
			this.setJustification(Justification.CENTER);
		}
		
		for (ImageButtonData imageButtonData : buttonDataArr) {
			FlexPanel fp = new FlexPanel();
			fp.setWidth("300px");
			fp.setOrientation(Orientation.HORIZONTAL);
			fp.setAlignment(Alignment.CENTER);
			fp.setJustification(Justification.START);
			fp.addStyleName(BtnResources.INSTANCE.css().bgBlue());

			Image img = new Image(imageButtonData.imgres);
			img.getElement().setAttribute("width", "75");
			img.getElement().setAttribute("height", "75");
			fp.add(img);

			FlexPanel fp2 = new FlexPanel();
			fp2.setAlignment(Alignment.START);
			fp2.setJustification(Justification.START);
			
			imageButtonData.imgbtn.setText(imageButtonData.imgres.getName());
			imageButtonData.imgbtn.addStyleName(BtnResources.INSTANCE.css().btn());
			
			
			fp2.add(new HTML("<b>"+imageButtonData.imgres.getName()+"</b>"));
			fp2.add(imageButtonData.imgbtn);
			fp2.add(new HTML("new "+ imageButtonData.label +"()"));
			fp.add(fp2);
			add(fp);
		};
		
	}
	
	public class ImageButtonData{
		public ImageResource imgres;
		public ImageButton imgbtn;
		public String label;
		
		public ImageButtonData(ImageResource imgres,ImageButton imgbtn,String label ){
			this.imgres = imgres;
			this.imgbtn = imgbtn;
			this.label = label;
			
		}
		
	}
}
