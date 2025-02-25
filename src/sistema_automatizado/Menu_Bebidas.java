/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Menu_Bebidas {
    public static void mBedias() {

        int op1=0;
        int op2=0;
        double precio=0;

        do {


            op1= Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Lista de bebidas ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>1- Batidos</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "<HTML><h3>2- Jugos Naturales</h3></HTML>\n"+
                                            "Las mejores frutas en forma de jugos\n" +
                                            "<HTML><h3>3- Cervezas</h3></HTML>\n"+
                                            "Las mejores cervezas\n" +      
                                            "<HTML><h3>4- Vinos</h3></HTML>\n"+
                                            "Vinos de alta categoria\n" +
                                            "<HTML><h3>5- Tragos</h3></HTML>\n"+
                                            "Opciones para compartir con amigos y amigas\n" +
                                            "<HTML><h3>6- Cocteles</h3></HTML>\n"+
                                            "Grandes combianciones para compartir\n" +
                                            "\n"+
                                            "<HTML><h3>7- Finalizar de compra</h3></HTML>\n"+
                                            "<HTML><h1>•••••••••••• Elije la Categoria ••••••••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
            op2 = 0;

            switch (op1){
                case 1:

                    while (op2<=5) {

                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Batidos ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Batido #1 - ₡1500</h3></HTML>\n"+
                                            "Batido de fresas en leche con topin de chocolate y granola.\n" +
                                            "<HTML><h3>Batido #2 - ₡1200</h3></HTML>\n"+
                                            "Batido de frutas mixtas en agua.\n" +
                                            "<HTML><h3>Batido #3 - ₡1200</h3></HTML>\n"+
                                            "Batido de Naranja y hierba buena en agua.\n" +
                                            "<HTML><h3>Batido #4 - ₡1800</h3></HTML>\n"+
                                            "Batido de moras en leche\ncon topin de crema pastelera y trozos de chocolate\n" +
                                            "<HTML><h3>Batido #5 - ₡1100</h3></HTML>\n"+
                                            "Batido de Naranja/banano y proteina\n" +
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••• Elije la Categoria •••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+1500;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+1200;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+1200;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+1800;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+1100;
                        } 
                    }
                    break;

                case 2:

                    while (op2<=5) {

                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>••••••••• Jugos Naturales •••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Jugo Natural #1 - ₡1500</h3></HTML>\n"+
                                            "Jugo de Cas\n" +
                                            "<HTML><h3>Jugo Natural #2 - ₡1200</h3></HTML>\n"+
                                            "Jugo de Mora\n" +
                                            "<HTML><h3>Jugo Natural #3 - ₡1200</h3></HTML>\n"+
                                            "Jugo de Guanabana\n" +
                                            "<HTML><h3>Jugo Natural #4 - ₡1800</h3></HTML>\n"+
                                            "Jugo de Naranja \n" +
                                            "<HTML><h3>Jugo Natural #5 - ₡1100</h3></HTML>\n"+
                                            "Jugo de Piña\n" +
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>•••••••••••• Elije # de Categoria ••••••••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+1500;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+1200;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+1200;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+1800;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+1100;
                        }

                    }
                    break;

                case 3:

                    while (op2<=5) {
                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Cervezas ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Cerveza Imperial #1 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Cerveza Pilsen #2 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Cerveza Heineken #3 - ₡1300</h3></HTML>\n"+
                                            "<HTML><h3>Cerveza Stella #4 - ₡1500</h3></HTML>\n"+
                                            "<HTML><h3>Cerveza Estrella de Galicia #5 - ₡1500</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••• Elije # de opcion •••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+1200;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+1200;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+1300;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+1500;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+1500;
                        }

                    }
                    break;


                case 4:

                    while (op2<=5) {
                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>••••••••••••• Vinos •••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Botella vino tinto #1 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Botella vino blanco #2 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Botella de vino Merlot #3 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Botella de vino Grenache #4 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Botella Malbec #5 - ₡4500</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>6- Volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••• Elije # de opcion •••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+4500;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+4500;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+4500;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+4500;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+4500;
                        }

                    }
                    break;


                 case 5:

                    while (op2<=5) {
                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Tragos ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Botella de Jack Daniel's #1 - ₡12000</h3></HTML>\n"+
                                            "<HTML><h3>Botella de Buchanan's #2 - ₡12000</h3></HTML>\n"+
                                            "<HTML><h3>Botella de Flor de Caña #3 - ₡12000</h3></HTML>\n"+
                                            "<HTML><h3>Botella de Johnnie Walker #4 - ₡12000</h3></HTML>\n"+
                                            "<HTML><h3>Botella de Don Julio #5 - ₡12000</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>6- Volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••• Elije # de opcion •••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+12000;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+12000;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+12000;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+12000;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+12000;
                        }

                    }
                    break;

                case 6:

                    while (op2<=5) {
                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Cocteles ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Margarita (para 5 personas) #1 - ₡2500</h3></HTML>\n"+
                                            "<HTML><h3>Mojito (para 5 personas) #2 - ₡2500</h3></HTML>\n"+
                                            "<HTML><h3>Gintonic (para 5 personas) #3 - ₡2500</h3></HTML>\n"+
                                            "<HTML><h3>Caipirinha (para 5 personas) #4 - ₡2500</h3></HTML>\n"+
                                            "<HTML><h3>Manhattan (para 5 personas) #5 - ₡2500</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>6- Volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••••• Elije # de opcion •••••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+2500;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+2500;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+2500;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+2500;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+2500;
                        }

                    }
                    break;       

                default:
                     String Cad="";
                     boolean Disponibles = false;{
                     Cad+= "\n- Precio:   ₡"+precio;
                     Disponibles = false;}
                     JOptionPane.showMessageDialog(null, "Su factura total es:\n" +Cad, "Factura", JOptionPane.INFORMATION_MESSAGE); 
                     {La_Carta cartaMenu = new La_Carta();
                      La_Carta.Menu_Opciones();}
            }

        } while (op1!=7);               
    }
}
