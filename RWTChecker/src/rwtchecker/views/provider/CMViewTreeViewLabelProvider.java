package rwtchecker.views.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;


public class CMViewTreeViewLabelProvider extends LabelProvider {
	public String getText(Object obj) {
		return obj.toString();
	}
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (((TreeObject)obj).hasChildren()){
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		}
		if(((TreeObject)obj).isPrimaryType()){
			 imageKey = ISharedImages.IMG_OBJ_ADD;
		}
		return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
	}
}