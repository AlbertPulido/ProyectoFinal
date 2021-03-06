package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Datos m?nimos del primer colch?n
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tama?o0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";
	
	// Datos m?nimos del segundo colch?n
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia = 10;
	public static String tama?o1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algod?n Org?nico";
	
	// Datos m?nimos del tercer colch?n
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tama?o2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";
	
	// Datos m?nimos del cuarto colch?n
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tama?o3 = "Queen";
	public static String material3 = "Jacquard";
	
	// Datos m?nimos del quinto colch?n
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tama?o4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Cantidad ?ptima de colchones vendidos
	public static int cantidadOptima = 10;
	
	// Cantidad m?nima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;
		
	// Obsequio por cantidad m?nima de colchones adquiridos
	public static String obsequio = "USB";
	
	// N?mero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarLavadora;
	private JMenuItem mntmModificarLavadora;
	private JMenuItem mntmListarLavadoras;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarCantidad;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenu mnConfiguracion;
	private JMenuItem mntmConfigurarCuota;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarLavadora = new JMenuItem("Consultar lavadora");
		mnMantenimiento.add(mntmConsultarLavadora);
		
		mntmModificarLavadora = new JMenuItem("Modificar lavadora");
		mnMantenimiento.add(mntmModificarLavadora);
		
		mntmListarLavadoras = new JMenuItem("Listar lavadoras");
		mnMantenimiento.add(mntmListarLavadoras);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfiguracion);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mnConfiguracion.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar obsequios");
		mnConfiguracion.add(mntmConfigurarObsequios);
		
		mntmConfigurarCantidad = new JMenuItem("Configurar cantidad \u00F3ptima");
		mnConfiguracion.add(mntmConfigurarCantidad);
		
		mntmConfigurarCuota = new JMenuItem("Configurar cuota diaria");
		mnConfiguracion.add(mntmConfigurarCuota);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaTienda = new JMenuItem("Acerca de Tienda");
		mnAyuda.add(mntmAcercaTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
