package calculatorPackage;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class WRTcalculator extends JFrame {

	private JPanel pnlJobInformation;
	private JPanel pnlTechInformation;
	private JPanel pnlMultipliers;
	private JPanel pnlCommission;
	private JPanel pnlMain;
	private JPanel pnlBody;
	
	//button for main panel
	private JButton btnClearForm;
	
	//components for pnlJobInformation
	
	private JLabel lblLaborTitle;
	private JLabel lblEquipTitle;
	private JLabel lblMonitorTitle;
	private JLabel lblTotalTitle;
	
	private JTextField txtLabor;
	private JTextField txtEquip;
	private JTextField txtMonitor;
	private JTextField txtTotal;
	
	//components for pnlTechInformation
	
	private JLabel lblComm;
	private JLabel lblAfterHours;
	private JLabel lblHours;
	private JLabel lblWageRate;
	
	private JTextField txtComm;
	private JTextField txtAfterHours;
	private JTextField txtHours;
	private JTextField txtWageRate;
	
	//components for pnlMultipliers
	private JLabel lblLaborPer;
	private JLabel lblEquipPer;
	private JLabel lblMonitorPer;
	
	private JTextField txtLaborPer;
	private JTextField txtEquipPer;
	private JTextField txtMonitorPer;
	
	//components for pnlCommInformation
	private JLabel lblWrtComm;
	private JLabel lblCommAfterHours;
	private JLabel lblGrossComm;
	private JLabel lblHourlyWage;
	private JLabel lblNetComm;
	
	private JTextField txtWrtComm;
	private JTextField txtCommAfterHours;
	private JTextField txtGrossComm;
	private JTextField txtHourlyWage;
	private JTextField txtNetComm;
	
	//layouts for panels
	private GridLayout gridLayoutMain;
	private GridLayout gridLayout;
	
	
	//create the GUI for WRT CALCULATOR
	public WRTcalculator() {
		super("QDRIVE - WRT Commission Calculator");
		
		//set up grid layouts
		gridLayoutMain = new GridLayout(0,1);
		gridLayout = new GridLayout(0,2);
		
		//set up main panel
		pnlMain = new JPanel();
		pnlMain.setLayout(gridLayoutMain);
		
		//set up body panel
		pnlBody = new JPanel();
		pnlBody.setLayout(gridLayout);
		
		//set up first panel for job information
		pnlJobInformation = new JPanel();
		pnlJobInformation.setLayout(gridLayout);
		pnlJobInformation.setBorder(BorderFactory.createTitledBorder("Job Information"));
		
		//labor 
		lblLaborTitle = new JLabel("Labor:");
		txtLabor = new JTextField(7);
		txtLabor.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void removeUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void insertUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
		});
		pnlJobInformation.add(lblLaborTitle);
		pnlJobInformation.add(txtLabor);
		
		//equip 
		lblEquipTitle = new JLabel("Equipment:");
		txtEquip = new JTextField(7);
		txtEquip.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void removeUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void insertUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
		});
		pnlJobInformation.add(lblEquipTitle);
		pnlJobInformation.add(txtEquip);
		
		//monitoring
		lblMonitorTitle = new JLabel("Monitoring:");
		txtMonitor = new JTextField(7);
		txtMonitor.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void removeUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
			@Override
			public void insertUpdate(DocumentEvent event) {
				TotalListener.total(event, WRTcalculator.this);
			}
		});
		pnlJobInformation.add(lblMonitorTitle, BorderLayout.EAST);
		pnlJobInformation.add(txtMonitor);
		
		//total
		lblTotalTitle = new JLabel("Total:");
		txtTotal = new JTextField(7);
		//txtTotal.setEditable(false);
		pnlJobInformation.add(lblTotalTitle);
		pnlJobInformation.add(txtTotal);
		
		//set up Technician Information panel
		pnlTechInformation = new JPanel();
		pnlTechInformation.setLayout(gridLayout);
		pnlTechInformation.setBorder(BorderFactory.createTitledBorder("Technician Information"));
		
		//tech panel commission
		lblComm = new JLabel("Commission %:");
		txtComm = new JTextField(7);
		pnlTechInformation.add(lblComm);
		pnlTechInformation.add(txtComm);
		
		//tech panel after hours
		lblAfterHours = new JLabel("After Hours:");
		txtAfterHours = new JTextField(7);
		pnlTechInformation.add(lblAfterHours);
		pnlTechInformation.add(txtAfterHours);
		
		//tech panel hours
		lblHours = new JLabel("Hours:");
		txtHours = new JTextField(7);
		pnlTechInformation.add(lblHours);
		pnlTechInformation.add(txtHours);
		
		//tech pane wage rate
		lblWageRate = new JLabel("Wage Rate:");
		txtWageRate = new JTextField(7);
		pnlTechInformation.add(lblWageRate);
		pnlTechInformation.add(txtWageRate);
		
		//set up multiplers panel
		pnlMultipliers = new JPanel();
		pnlMultipliers.setLayout(gridLayout);
		pnlMultipliers.setBorder(BorderFactory.createTitledBorder("Multipliers"));
		
		//set up mulitpliers labor
		lblLaborPer = new JLabel("Labor(%):");
		txtLaborPer = new JTextField(7);
		pnlMultipliers.add(lblLaborPer);
		pnlMultipliers.add(txtLaborPer);
		
		//set up mulitpliers equip
		lblEquipPer = new JLabel("Equipment(%):");
		txtEquipPer = new JTextField(7);
		pnlMultipliers.add(lblEquipPer);
		pnlMultipliers.add(txtEquipPer);
		
		//set up mulitpliers monitoring
		lblMonitorPer = new JLabel("Monitoring(%):");
		txtMonitorPer = new JTextField(7);
		pnlMultipliers.add(lblMonitorPer);
		pnlMultipliers.add(txtMonitorPer);
		
		//set up commInformation panel
		pnlCommission = new JPanel();
		pnlCommission.setLayout(gridLayout);
		pnlCommission.setBorder(BorderFactory.createTitledBorder("Commission Information"));
		
		//set up commission wrtcomm
		lblWrtComm = new JLabel("WRT Comm:");
		txtWrtComm = new JTextField(7);
		txtWrtComm.setEditable(false);
		pnlCommission.add(lblWrtComm);
		pnlCommission.add(txtWrtComm);
		
		//set up commission after hours
		lblCommAfterHours = new JLabel("+ After Hours:");
		txtCommAfterHours = new JTextField(7);
		txtCommAfterHours.setEditable(false);
		pnlCommission.add(lblCommAfterHours);
		pnlCommission.add(txtCommAfterHours);
		
		//set up commission gross comm
		lblGrossComm = new JLabel("= Gross Comm:");
		txtGrossComm = new JTextField(7);
		txtGrossComm.setEditable(false);
		pnlCommission.add(lblGrossComm);
		pnlCommission.add(txtGrossComm);
		
		//set up commission hourly wage
		lblHourlyWage = new JLabel("- Hourly Wage:");
		txtHourlyWage = new JTextField(7);
		txtHourlyWage.setEditable(false);
		pnlCommission.add(lblHourlyWage);
		pnlCommission.add(txtHourlyWage);
		
		//set up commission net comm
		lblNetComm = new JLabel("= Net Comm:");
		txtNetComm = new JTextField(7);
		txtNetComm.setEditable(false);
		pnlCommission.add(lblNetComm);
		pnlCommission.add(txtNetComm);	
		
		//add panels to body panel
		pnlBody.add(pnlJobInformation);
		pnlBody.add(pnlTechInformation);
		pnlBody.add(pnlMultipliers);
		pnlBody.add(pnlCommission);
		
		//create button
		btnClearForm = new JButton("Clear Form");
		
		//add body panel and button to main panel
		pnlMain.add(pnlBody);
		pnlMain.add(btnClearForm, BorderLayout.SOUTH);
		
		add(pnlMain);
	}
	
	public String getTxtLabor() {
		return txtLabor.getText();
	}
	
	public String getTxtEquip() {
		return txtEquip.getText();
	}
	
	public String getTxtMonitor() {
		return txtMonitor.getText();
	}
	
	public void setTxtTotal(String total) {
		txtTotal.setText(total);
	}
}
