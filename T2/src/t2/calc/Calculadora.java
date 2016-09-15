package t2.calc;

import java.beans.Customizer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora extends JPanel implements Customizer {

	private static final long serialVersionUID = 1L;

	private Object bean;

	private JTextField textField;

	private double value;

	private boolean calcPanelVisible;

	public Calculadora() {
		this.render();
	}

	private void render() {
		this.setLayout(null);
		this.textField = new JTextField();
		this.textField.setHorizontalAlignment(SwingConstants.RIGHT);
		this.textField.setBounds(0, 3, 294, 49);
		this.add(this.textField);
		this.textField.setColumns(10);

		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(l -> this.textField.setText(btn_7.getText()));
		btn_7.setBounds(2, 55, 71, 36);
		this.add(btn_7);

		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(l -> this.textField.setText(btn_8.getText()));
		btn_8.setBounds(75, 55, 71, 36);
		this.add(btn_8);

		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(l -> this.textField.setText(btn_9.getText()));
		btn_9.setBounds(148, 55, 71, 36);
		this.add(btn_9);

		JButton btn_dividir = new JButton("/");
		btn_dividir.setBounds(221, 55, 71, 36);
		this.add(btn_dividir);

		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(l -> this.textField.setText(btn_4.getText()));
		btn_4.setBounds(2, 94, 71, 36);
		this.add(btn_4);

		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(l -> this.textField.setText(btn_5.getText()));
		btn_5.setBounds(75, 94, 71, 36);
		this.add(btn_5);

		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(l -> this.textField.setText(btn_6.getText()));
		btn_6.setBounds(148, 94, 71, 36);
		this.add(btn_6);

		JButton btn_multiplicar = new JButton("*");
		btn_multiplicar.setBounds(221, 94, 71, 36);
		this.add(btn_multiplicar);

		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(l -> this.textField.setText(btn_1.getText()));
		btn_1.setBounds(2, 133, 71, 36);
		this.add(btn_1);

		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(l -> this.textField.setText(btn_2.getText()));
		btn_2.setBounds(75, 133, 71, 36);
		this.add(btn_2);

		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(l -> this.textField.setText(btn_3.getText()));
		btn_3.setBounds(148, 133, 71, 36);
		this.add(btn_3);

		JButton btn_subtrair = new JButton("-");
		btn_subtrair.setBounds(221, 133, 71, 36);
		this.add(btn_subtrair);

		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(l -> this.textField.setText(btn_0.getText()));
		btn_0.setBounds(2, 172, 71, 36);
		this.add(btn_0);

		JButton btn_decimal = new JButton(",");
		btn_decimal.setBounds(75, 172, 71, 36);
		this.add(btn_decimal);

		JButton btn_igual = new JButton("=");
		btn_igual.setBounds(148, 172, 71, 36);
		this.add(btn_igual);

		JButton btn_somar = new JButton("+");
		btn_somar.setBounds(221, 172, 71, 36);
		this.add(btn_somar);
	}

	@Override
	public void setObject(Object bean) {
		this.bean = bean;
	}

	public double getValue() {
		return this.value;
	}

	public boolean isCalcPanelVisible() {
		return this.calcPanelVisible;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setCalcPanelVisible(boolean calcPanelVisible) {
		this.calcPanelVisible = calcPanelVisible;
	}
}
