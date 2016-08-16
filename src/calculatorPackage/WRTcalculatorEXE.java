package calculatorPackage;

import javax.swing.JFrame;

public class WRTcalculatorEXE {

	public static void main(String[] args) {
		WRTcalculator calc = new WRTcalculator();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(500,500);
		calc.setVisible(true);
	}
}
