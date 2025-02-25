/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Mesa {

	private Reserva[] reservas; 

	public Mesa() {
		reservas = new Reserva[3];
	}

	private int getPosArray(String hora) {
		if (hora.equals("9:00"))
			return 0;
		else if (hora.equals("10:00"))
			return 1;
		else
			return 2; //11.00
	}
 
	public void hacerReserva(Reserva reserva) {
               
		int pos = getPosArray(reserva.getHora());
		if (reservas[pos] != null)
			JOptionPane.showMessageDialog(null,"Esta hora ya está reservada", "Reserva", JOptionPane.INFORMATION_MESSAGE);
		else {
			reservas[pos] = reserva;
                        JOptionPane.showMessageDialog(null,"----- Reserva efectuada -----", "Reserva", JOptionPane.INFORMATION_MESSAGE);
                       {
                }
            } 
        }
	public void anularReserva(String nombre, String hora) {
		int pos = getPosArray(hora);
		if (reservas[pos] != null) {
			if (reservas[pos].getNombre().equals(nombre)) {
				reservas[pos] = null;
				JOptionPane.showMessageDialog(null,"Reserva Cancelada", "Reserva", JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null,"El nombre no se corresponde con la persona que hizo la reserva, intente de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null,"No hay ninguna reseva para la hora indicada", "Reserva", JOptionPane.INFORMATION_MESSAGE);
	}

	public boolean estaDisponible(String hora) {
		return reservas[getPosArray(hora)] == null;
	}
 
}    

