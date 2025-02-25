/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class GestionMesas {
	private static Mesa[] mesas;

    public static void mesas() {
                
		mesas = new Mesa[10];
		for (int i = 0; i < mesas.length; i++)
			mesas[i] = new Mesa();
                int opcion = 0;

		do {
                String[] botones = {"Reservar Mesa", "Eliminar Reserva", "Consultar Mesas Diponibles", "Salir"};
		int ventana = JOptionPane.showOptionDialog(null,
                                                "<HTML><h1>•••••••••••• Bienvenidos al Sistema de Reservas ••••••••••••</h1></HTML>\n"+
						"<HTML><h3>Reserva de mesa</h3></HTML>\n"+
                                                "En esta apartado podra realizar una reserva en nuestras 10 Mesas disponibles\nse le solicitara informacion personal y la hora en la que quiere reservar la mesa.\n" +
                                                "<HTML><h3>Nota: Cada mesa tiene 3 horas de reservacion diferente que son; 9:00pm, 10:00pm, 11:00pm.</h3></HTML>\n"+
                                                "<HTML><h3>Eliminar Reserva</h3></HTML>\n" +
                                                "Para poder eleminar una reserva deberar brindar los siguientes datos\nNombre completo y hora de reserva, automaticamente su reserva sera eliminada con estos datos.\n" +
                                                "<HTML><h3>Consultar Mesas Disponibles</h3></HTML>\n" +
                                                "En este apartado podre utilizar nuestro servicio de consulta\npara poder observar las mesas disponible conforme su numero y hora en la que quiera reservar.\n" +
                                                "<HTML><h1>••••••••••••••••••••• Elije la Categoria •••••••••••••••••••••</h1></HTML>", 
						"Reservas", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null,
						botones, botones[0]);
		if(ventana == 0) {GestionMesas reservarMesa = new GestionMesas();
                                  GestionMesas.reservarMesa();} 
		else if(ventana == 1) {GestionMesas EliminarReserva = new GestionMesas();
                                       GestionMesas.liberarMesa();}
                else if(ventana == 2) {GestionMesas MesaLibre = new GestionMesas();
                                       GestionMesas.comprobarMesaLibre();}
                else if(ventana == 3)  {System.exit(0);}
		}while(opcion != 3);  
	}


	private static void reservarMesa(){
		int mesa = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el numero de mesa a reservar:", "Datos para reservar", JOptionPane.QUESTION_MESSAGE));
		String hora = JOptionPane.showInputDialog(null,"Ingrese la hora de reserva\nNota: Cada mesa tiene 3 horas de reservacion diferente que son; 9:00pm, 10:00pm, 11:00pm.", "Datos para reservar", JOptionPane.QUESTION_MESSAGE);
		String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre completo a quien va dirigida la reserva:", "Datos para Reservar", JOptionPane.QUESTION_MESSAGE);
		int comensales = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el numero de comensales que nos visitaran:", "Datos para reservar", JOptionPane.QUESTION_MESSAGE));
		String telefono = JOptionPane.showInputDialog(null,"Ingrese un numero telefonico para mayor contacto:", "Datos para reservar", JOptionPane.QUESTION_MESSAGE);
 
		mesas[mesa].hacerReserva(new Reserva(nombre, hora, comensales, telefono));
	}
 
	private static void liberarMesa() {
		int mesa = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el numero de mesa en la que reservo:", "Datos para elimiar reservar", JOptionPane.QUESTION_MESSAGE));
		String hora = JOptionPane.showInputDialog(null,"Ingrese hora la hora en la que fue reservada la mesa:", "Datos para elimiar reservar", JOptionPane.QUESTION_MESSAGE);
		String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre completo de quien reservo:", "Datos para elimiar reservar", JOptionPane.QUESTION_MESSAGE);
 
		mesas[mesa].anularReserva(nombre, hora);
	}
 
	private static void comprobarMesaLibre() {
                String Cad="";
		String hora = JOptionPane.showInputDialog(null,"Ingrese la hora en la que quiere ver las mesas que esten disponibles:", "Ver mesas diponibles", JOptionPane.QUESTION_MESSAGE);
		boolean Disponibles = false;

		for (int i = 0; i < mesas.length; i++)
			if (mesas[i].estaDisponible(hora)) {
				Cad+= "\n- Mesa #" + i;
				Disponibles = true;
			}
                  JOptionPane.showMessageDialog(null, "Mesas disponibles para esta hora:\n" + Cad, "Disponibles", JOptionPane.INFORMATION_MESSAGE);
 
		if (!Disponibles)
			JOptionPane.showMessageDialog(null,"No hay mesas disponibles para esa hora", "Mesas", JOptionPane.INFORMATION_MESSAGE);
	}
                      
 
}



