package main;

import interfejs.Okno;
import dekoratory.DecoratorButton;
import dekoratory.DecoratorLabel;
import dekoratory.DecoratorSlider;

public class DecoratorTest {

	public static void main(String[] args) {
		Okno c = new ZwykleOkno();
		c.open();
		
		Okno v = new DecoratorButton(new ZwykleOkno());
		v.open();
		
		Okno b = new DecoratorSlider(new DecoratorButton(new ZwykleOkno()));
		b.open();
		
		Okno m = new DecoratorLabel(new DecoratorSlider(new DecoratorButton(new ZwykleOkno())));
		m.open();
		
		Okno n = new DecoratorButton(new DecoratorSlider(new DecoratorLabel(new ZwykleOkno())));
		n.open();
	}

}
