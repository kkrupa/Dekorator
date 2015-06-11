package main;

import interfejs.Okno;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ZwykleOkno implements Okno {

	protected Shell shell;
	Display display;

	public ZwykleOkno() {
		shell = new Shell();
		display = Display.getDefault();
		createContents();
	}

	@Override
	public void open() {
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	@Override
	public void createContents() {
		shell.setSize(450, 300);
		shell.setText("SWT Application");
	}
	
	public Shell getShell() {
		return shell;
	}

	public Display getDisplay() {
		return display;
	}


}
