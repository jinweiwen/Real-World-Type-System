package rwtchecker.views.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import rwtchecker.concept.ConceptAttribute;


public class ConceptDetailLabelProvider extends LabelProvider implements ITableLabelProvider {
	
	public String getColumnText(Object obj, int index) {
		ConceptAttribute conceptAttribute = (ConceptAttribute) obj;
		switch (index) {
		case 0:
			return conceptAttribute.getAttributeName();
		case 1:
			return conceptAttribute.getAttributeExplanation();
		default:
			throw new RuntimeException("Should not happen");
		}
	}
	
	public Image getColumnImage(Object obj, int index) {
		return getImage(obj);
	}
	public Image getImage(Object obj) {
		//return PlatformUI.getWorkbench().				getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		return null;
	}
}