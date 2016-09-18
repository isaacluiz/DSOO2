package main;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import modelos.Modelos;
import modelos.Pilha;
import modelos.Ponto;
import poo.edgraf.reprodutor.Quadro;
import reprodutor.CirculoFig;

public class MainWindow {

	private JFrame frame;

	private Pilha pilha;

	private Ponto ponto1, ponto2;

	private Modelos modelo;

	public MainWindow() {
		this.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		this.frame = new JFrame();
		this.frame.setVisible(true);
		this.frame.setBounds(100, 100, 450, 300);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.getContentPane().setLayout(null);

		Quadro panel = new Quadro();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainWindow.this.ponto1 = (MainWindow.this.ponto1 == null) ? new Ponto(e.getX(), e.getY()) : null;
				MainWindow.this.ponto2 = (MainWindow.this.ponto2 == null) ? new Ponto(e.getX(), e.getY()) : null;
				switch (MainWindow.this.modelo) {
				case CIRCULO:
					CirculoFig fig = new CirculoFig(MainWindow.this.ponto1, 10, panel, Color.BLACK);
					// fig.reproduzir(new Graphics);
					break;
				case OVAL:
					break;
				case RETA:
					break;
				case RETANGULO:
					break;
				case TEXTO:
					break;
				default:
					break;

				}
			}

		});

		panel.setBounds(0, 0, 434, 240);
		this.frame.getContentPane().add(panel);

		JMenuBar menuBar = new JMenuBar();
		this.frame.setJMenuBar(menuBar);

		JMenu mnModelos = new JMenu("Modelos");
		menuBar.add(mnModelos);

		JMenuItem mntmCirculo = new JMenuItem("Circulo");
		mntmCirculo.addActionListener(l -> this.modelo = Modelos.CIRCULO);
		mnModelos.add(mntmCirculo);

		JMenuItem mntmOval = new JMenuItem("Oval");
		mnModelos.add(mntmOval);

		JMenuItem mntmReta = new JMenuItem("Reta");
		mnModelos.add(mntmReta);

		JMenuItem mntmRetangulo = new JMenuItem("Retangulo");
		mnModelos.add(mntmRetangulo);

		JMenuItem mntmTexto = new JMenuItem("Texto");
		mnModelos.add(mntmTexto);
	}
}
