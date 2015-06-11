package dekoratory;

import interfejs.Okno;
import main.OknoDecorator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

public class DecoratorButton extends OknoDecorator {

	public DecoratorButton(Okno okno) {
		super(okno);
	}

	public void addElement(Shell shell) {
		Button btnNowyPrzycisk = new Button(shell, SWT.NONE);
		btnNowyPrzycisk.setBounds(138, 32, 119, 25);
		btnNowyPrzycisk.setText("DecoratorButton");
	}

}
