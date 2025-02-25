/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Categorias {
        public static void main() {
		String[] botones = {"La Carta", "Reserva de mesas", "Salir"};
		int ventana1 = JOptionPane.showOptionDialog(null,
                                                "<HTML><h1>•••••••••••• Bienvenidos a Nuestras Categorias ••••••••••••</h1></HTML>\n"+
						"<HTML><h3>La Carta</h3></HTML>\n"+
                                                "En esta Categoria Podra encontrar La carta de nuestro restaurante\ndonde estara en listado todos los menus que puede consultar para su disfrute.\n" +
                                                "\n" +
                                                "<HTML><h3>Reservaciones</h3></HTML>\n" +
                                                "En este apartado podre utilizar nuestro servicio de reservas\npara poder visitar nuestro restaurante y asi obtener un lugar en nuestras mesas.\n" +
                                                "<HTML><h1>••••••••••••••••••••• Elije la Categoria •••••••••••••••••••••</h1></HTML>", 
						"Categorias", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null, 
						botones, botones[0]);
		if(ventana1 == 0) {La_Carta CartaMenu = new La_Carta();
                                  CartaMenu.Menu_Opciones();} 
		else if(ventana1 == 1) {GestionMesas rSistema = new GestionMesas();
                                       GestionMesas.mesas();}
                else if(ventana1 == 2) {ComentariosUsuarios coments = new ComentariosUsuarios();
                                       ComentariosUsuarios.main();}

	}
}

