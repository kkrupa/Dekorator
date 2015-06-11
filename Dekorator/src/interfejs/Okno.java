package interfejs;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public interface Okno {
	public void open();
	public void createContents();
	Shell getShell();
	Display getDisplay();
}
