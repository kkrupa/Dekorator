package dekoratory;

import interfejs.Okno;
import main.OknoDecorator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;

public class DecoratorSlider extends OknoDecorator {

	public DecoratorSlider(Okno okno) {
		super(okno);
	}
	
	public void addElement(Shell shell) {
		Slider slider = new Slider(shell, SWT.NONE);
		slider.setBounds(138, 235, 170, 17);
	}

}
