/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Menu_Reposteria {
    public static void mReposteria() {

        int op1=0;
        int op2=0;
        double precio=0;

        do {


            op1= Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Lista de Reposteria ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>1- Reposteria Dulce</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "<HTML><h3>2- Reposteria Salada</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "<HTML><h3>3- Queques</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +      
                                            "<HTML><h3>4- Dulces</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "<HTML><h3>5- Snacks dulces</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "<HTML><h3>6- CupCakes</h3></HTML>\n"+
                                            "Refrescantes opciones podras encontrar en esta categoria\n" +
                                            "\n"+
                                            "<HTML><h3>7- Finalizar de compra</h3></HTML>\n"+
                                            "<HTML><h1>•••••••••••• Elije # de Categoria ••••••••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
            op2 = 0;

            switch (op1){
                case 1:

                    while (op2<=5) {

                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• Reposteria Dulce ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Pay de fresa #1 - ₡1500</h3></HTML>\n"+
                                            "<HTML><h3>Flan Napolitano #2 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>ChocoFlan #3 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Cralota #4 - ₡1800</h3></HTML>\n"+
                                            "<HTML><h3>Tres Leches #5 - ₡1100</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>•••••••••••• Elije # de opcion ••••••••••••</h1></HTML>"
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
                            precio=precio+1200;
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
                                            "<HTML><h1>••••••••• Reposteria Salada •••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Croissant #1 - ₡1500</h3></HTML>\n"+
                                            "<HTML><h3>Brioche #2 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Empanada de pollo #3 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Empanada Chilena #4 - ₡1300</h3></HTML>\n"+
                                            "<HTML><h3>Palitos de queso #5 - ₡1100</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••••• Elije # de opcion •••••••••</h1></HTML>"
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
                            precio=precio+1300;
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
                                            "<HTML><h1>•••••••••••• Queques ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Queque de Zanahoria #1 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Queque de chocolate #2 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Queque Humedo #3 - ₡1300</h3></HTML>\n"+
                                            "<HTML><h3>Torta fria #4 - ₡1500</h3></HTML>\n"+
                                            "<HTML><h3>Queque seco #5 - ₡1500</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>Ingrese el #6 para volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>•••••••• Elije # de opcion ••••••••</h1></HTML>"
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
                                            "<HTML><h1>••••••••••••• Dulces •••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Gomitas #1 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Bombones #2 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Palomitas de caramelo #3 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Brochetas dulces #4 - ₡4500</h3></HTML>\n"+
                                            "<HTML><h3>Bastones de caramelo #5 - ₡4500</h3></HTML>\n"+
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
                                            "<HTML><h1>•••••••••••• Snacks ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>Jelly Beans #1 - ₡1000</h3></HTML>\n"+
                                            "<HTML><h3>Lunetas de chocolate #2 - ₡1200</h3></HTML>\n"+
                                            "<HTML><h3>Gomitas #3 - ₡900</h3></HTML>\n"+
                                            "<HTML><h3>Mani mixto #4 - ₡1000</h3></HTML>\n"+
                                            "<HTML><h3>Galletas de avena #5 - ₡1200</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>6- Volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••• Elije # de opcion •••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+1000;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+1200;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+900;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+1000;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+1200;
                        }

                    }
                    break;

                case 6:

                    while (op2<=5) {
                        op2=Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "<HTML><h1>•••••••••••• CupCakes ••••••••••••</h1></HTML>\n"+
                                            "<HTML><h3>CupCakes de zanahoria (para 5 personas) #1 - ₡5500</h3></HTML>\n"+
                                            "<HTML><h3>CupCakes Frambuesa y limón (para 5 personas) #2 - ₡5500</h3></HTML>\n"+
                                            "<HTML><h3>CupCakes Oreo Cookies (para 5 personas) #3 - ₡5500</h3></HTML>\n"+
                                            "<HTML><h3>CupCakes Red Velvet (para 5 personas) #4 - ₡5500</h3></HTML>\n"+
                                            "<HTML><h3CupCakes Minimasmelos (para 5 personas) #5 - ₡5500</h3></HTML>\n"+
                                            "\n"+
                                            "<HTML><h3>6- Volver al menu de categorias</h3></HTML>\n"+
                                            "<HTML><h1>••••••••• Elije # de opcion •••••••••</h1></HTML>"
                                            , "Menu de bebidas", JOptionPane.INFORMATION_MESSAGE));
                        if (op2==1) {
                            precio=precio+5500;
                        }
                        else 
                            if (op2==2) {
                            precio=precio+5500;
                        }
                            else 
                                if (op2==3) {
                            precio=precio+5500;
                        }
                                else 
                                    if (op2==4) {
                            precio=precio+5500;
                        }
                                    else 
                                        if (op2==5) {
                            precio=precio+5500;
                        }

                    }
                    break;       

                default:
                     String Cad="";
                     boolean Disponibles = false;{
                     Cad+= "\n- Precio: ₡"+precio;
                     Disponibles = false;}
                     JOptionPane.showMessageDialog(null, "Su factura total es:\n"+Cad, "Factura", JOptionPane.INFORMATION_MESSAGE); 
                     {La_Carta cartaMenu = new La_Carta();
                      La_Carta.Menu_Opciones();}
            }

        } while (op1!=7);               
    }
}   

