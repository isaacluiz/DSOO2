package main;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				MainWindow window = new MainWindow();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
