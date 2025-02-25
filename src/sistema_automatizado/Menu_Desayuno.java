/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */

package sistema_automatizado;

import javax.swing.JOptionPane;

public class Menu_Desayuno {

    double SaldoCompras =0;
    double MontoTotal=0;
    double Impuestos=0;
    
    public void mDesayuno()
    {
         boolean continuar = true;
       
        
        while(continuar)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"<HTML><h1>•••••••••••••••••••••••••• Desayunos ••••••••••••••••••••••••••</h1></HTML>\n"+
						"<HTML><h1>Opcion del dia - Opcion #1</h1></HTML>\n"+
                                                "<HTML><h3>Desayuno Continental</h3></HTML>\n"+
                                                "-Cafe\n-Pan tostado con acompañamiento de mermelada y mantequilla\n-Jugo de Naranja\n-Fruta\n-Huevos con tocino.\n" +
                                                "<HTML><h3>Precio: ₡2500</h3></HTML>\n" +

						"<HTML><h1>Desayuno Fit - Opcion #2</h1></HTML>\n"+
                                                "<HTML><h3>Desayuno Saludable</h3></HTML>\n"+
                                                "-Sándwich de pan integral con queso de untar, salmón ahumado, espinacas y olivas.\n-Jugo de frutas naturales\n-Snack de frutos secos\n" +
                                                "<HTML><h3>Precio: ₡2800</h3></HTML>\n" +

						"<HTML><h1>Desayuno Espacial - Opcion #3</h1></HTML>\n"+
                                                "<HTML><h3>Desayuno Tico</h3></HTML>\n"+
                                                "-Gallo Pinto\n-Huevo Picado\n-Natilla\n-Tortilla Casera\n-Platano Maduro\n-Cafe\n" +
                                                "<HTML><h3>Precio: ₡3500</h3></HTML>\n" +
                    
						"<HTML><h1>Desayuno Elaborado - Opcion #4</h1></HTML>\n"+
                                                "<HTML><h3>Elaborar su propio desayuno</h3></HTML>\n"+
                                                "-En esta opcion usted puede pedir diferentes ingredientes para su desayuno y asi poder eleborar una opcion mas a su gusto\n" +
                                                "<HTML><h3>Precio: Sujeto a los productos elegidos</h3></HTML>\n" +
                                                "<HTML><h1>•••••••••••••••••••••••• Elije la Opcion ••••••••••••••••••••••••</h1></HTML>","Menu",1));
           
            
            
            switch (opcion)
            {
                
                case 1:
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu",JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(2500*cantidad);
                break;
                
                case 2:
                    int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(2800*cantidad2);
                break;
                 
                case 3:
                    int cantidad3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(3500*cantidad3);
                break;
                
                case 4:
                    {MD_Personalizado menuP1 = new MD_Personalizado();
                    MD_Personalizado.menuP1();}
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida", "Menu", JOptionPane.ERROR_MESSAGE);
                     break;
            }
            
             int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra compra", "Menu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
             if (input == 1)
           {
               Impuestos = SaldoCompras*0.13;
               MontoTotal = SaldoCompras + Impuestos;
               JOptionPane.showMessageDialog(null, "Su factura  de combos es: " +MontoTotal,  "Factura", JOptionPane.INFORMATION_MESSAGE);
               {ComentariosUsuarios coments = new ComentariosUsuarios();
                ComentariosUsuarios.main();}
               
               continuar = false;
           }
        
        }
    }
    
}


    

   
