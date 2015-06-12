package main;

import interfejs.Okno;
import dekoratory.DecoratorButton;
import dekoratory.DecoratorLabel;
import dekoratory.DecoratorSlider;

public class DecoratorTest {

	public static void main(String[] args) {
		Okno c = new ZwykleOkno();
		c.open();
		
		c = new DecoratorButton(new ZwykleOkno());
		c.open();
		
		c = new DecoratorSlider(new DecoratorButton(new ZwykleOkno()));
		c.open();
		
		c = new DecoratorLabel(new DecoratorSlider(new DecoratorButton(new ZwykleOkno())));
		c.open();
		
		c = new DecoratorButton(new DecoratorSlider(new DecoratorLabel(new ZwykleOkno())));
		c.open();
	}

}
