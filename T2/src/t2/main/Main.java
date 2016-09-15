package t2.main;

import t2.calc.Calculadora;

public class Main {

	public static void main(String[] args) {
		javax.swing.JFrame frame = new javax.swing.JFrame(); // Cria frame
		Calculadora bean = new Calculadora(); // Instancia o bean
		frame.setSize(500, 600);
		// Alterar as propriedades que julgar necess�rias aqui!
		frame.add(bean); // Adiciona bean ao frame
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Exibe o frame
	}

}