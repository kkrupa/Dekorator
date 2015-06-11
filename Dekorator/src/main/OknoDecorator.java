package main;

import interfejs.Okno;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class OknoDecorator implements Okno {

	protected Okno okno;
	protected Shell shell;
	protected Display display;
	
	public OknoDecorator(Okno okno) {
		this.shell = okno.getShell();
		this.display = okno.getDisplay();
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
		shell.setText("Test Dekoratorow");
		addElement(getShell());
	}
	
	public void addElement(Shell shell) {}
	
	@Override
	public Shell getShell() {
		return shell;
	}
	
	@Override
	public Display getDisplay() {
		return display;
	}
	
}
