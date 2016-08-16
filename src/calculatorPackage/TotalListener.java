package calculatorPackage;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class TotalListener implements DocumentListener {
	
	public static void total(DocumentEvent event, WRTcalculator calc) {
		try {
			double labor = Double.parseDouble(calc.getTxtLabor());
			double equip = Double.parseDouble(calc.getTxtEquip());
			double monitor = Double.parseDouble(calc.getTxtMonitor());
			double total = labor + equip + monitor;
			
			calc.setTxtTotal(String.valueOf(total));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
