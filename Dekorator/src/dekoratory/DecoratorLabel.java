package dekoratory;

import interfejs.Okno;
import main.OknoDecorator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class DecoratorLabel extends OknoDecorator {

	public DecoratorLabel(Okno okno) {
		super(okno);
	}

	public void addElement(Shell shell) {
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(135, 108, 157, 50);
		lblNewLabel.setText("DecoratorLabel");
	}
}
