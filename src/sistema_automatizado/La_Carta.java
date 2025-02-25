/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;
import javax.swing.JOptionPane;

public class La_Carta {

    public static void Menu_Opciones(){      
		String[] botones = {"Desayunos", "Almuerzos", "Cenas", "Postres", "Bebidas", "SALIR"};
		int ventana = JOptionPane.showOptionDialog(null,
                                                "<HTML><h1>•••••••••••••••••••••• La Carta ••••••••••••••••••••••</h1></HTML>\n"+
						"<HTML><h1>Menu Desayuno</h1></HTML>\n"+
                                                "Contamos con gran varidad de desayunos para su disfrute, grandes convinaciones\n de gran sabor y con la opcion de poder crear su desayuno a su manera, pruebalo te encnatara.\n" +
                                                "\n" +
                                                "<HTML><h1>Menu Almuerzo</h1></HTML>\n" +
                                                "Para las opciones de Almuerzos contamos con amplia carta de deliciosas combinaciones\n para que puedas deleitarte, aca tambien contamos con un menu para que puedas crear tu propio almuerzo.\n" +
                                                "\n" +
                                                "<HTML><h1>Menu Cena</h1></HTML>\n" +
                                                "Para la ultima comida del dia contamos con opciones deliciosas, de igual forma estara el menu perzonalizado\n para que puedes utlizar para crear una cena a tu gusto.\n" +
                                                "\n" +
                                                "<HTML><h1>Menu Postres</h1></HTML>\n" +
                                                "Por si quieres acompañar tus comidas o simplemente quitarte el antojo,\n aca podras encontrar una gran variedad de postres deliciosos.\n" +
                                                "\n" +
                                                "<HTML><h1>Bebidas</h1></HTML>\n" +
                                                "Si solamente necesitas bebidas aca tambien las puedes encontrar, contamos con una amplia lista.\n\n"+
                                                "<HTML><h1>••••••••••••••••••• Elije el menu •••••••••••••••••••</h1></HTML>", 
						"Menu", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, 
						botones, botones[0]);
		if(ventana == 0) {Menu_Desayuno OpcionesMenu_1 = new Menu_Desayuno();
                                  OpcionesMenu_1.mDesayuno();} 
		else if(ventana == 1) {Menu_Almuerzo OpcionMenu_2 = new Menu_Almuerzo();
                                       OpcionMenu_2.mAlmuerzo();}
		else if(ventana == 2) {Menu_Cena OpcionMenu_3 = new Menu_Cena();
                                       OpcionMenu_3.mCena();}
		else if(ventana == 3) {Menu_Reposteria OpcionMenu_4 = new Menu_Reposteria();
                                       Menu_Reposteria.mReposteria();}
                else if(ventana == 4) {Menu_Bebidas OpcionMenu_5 = new Menu_Bebidas();
                                       Menu_Bebidas.mBedias();}
                else if(ventana == 5) {ComentariosUsuarios coments = new ComentariosUsuarios();
                                       ComentariosUsuarios.main();}
                
    
	}
}




