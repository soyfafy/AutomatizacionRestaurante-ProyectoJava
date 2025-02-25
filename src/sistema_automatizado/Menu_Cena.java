/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Menu_Cena {

    double SaldoCompras =0;
    double MontoTotal=0;
    double Impuestos=0;
    
    public void mCena()
    {
         boolean continuar = true;
       
        
        while(continuar)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"<HTML><h1>•••••••••••••••••••••••••• Cenas ••••••••••••••••••••••••••</h1></HTML>\n"+
						"<HTML><h2>Corte New York - Opcion #1</h1></HTML>\n"+
                                                "-New York a la parrilla\nChorizo de la casa\n-yuca\n-Papas gajo\n-Chimichurri\n-Elote\n-Bebida\n" +
                                                "<HTML><h2>Precio: ₡7000</h3></HTML>\n" +

						"<HTML><h2>Corte Lomo ancho - Opcion #2</h1></HTML>\n"+
                                                "-Lomo ancho a la parrilla\n-Chorizo de la casa\n-Papas a la francesa\n-chimichurri\n-Ensalada mixta\n-Bebida\n" +
                                                "<HTML><h2>Precio: ₡7000</h3></HTML>\n" +
                    
						"<HTML><h2>Corte TomaHawk- Opcion #3</h2></HTML>\n"+
                                                "-TomaHawk a la parrilla\n-chorizo de la casa\n-Papas gajo\n-Chimichurri\n-Tomates asados\n-Bebida natural\n" +
                                                "<HTML><h2>Precio: ₡8500</h3></HTML>\n" +
                    
						"<HTML><h2>Elaborar su propio almuerzo - Opcion #4</h2></HTML>\n"+
                                                "-En esta opcion usted puede pedir diferentes ingredientes para su Almuerzo y asi poder eleborar una opcion mas a su gusto\n" +
                                                "<HTML><h2>Precio: Sujeto a los productos elegidos</h3></HTML>\n" +
                                                "<HTML><h1>•••••••••••••••••••••••• Elije la Opcion ••••••••••••••••••••••••</h1></HTML>", "Menu", 1));
           
            
            
            switch (opcion)
            {
                
                case 1:
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(7000*cantidad);
                break;
                
                case 2:
                    int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(7000*cantidad2);
                break;
                 
                case 3:
                    int cantidad3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(8500*cantidad3);
                break;
                
                case 4:
                    {MD_Personalizado menuP1 = new MD_Personalizado();
                    MD_Personalizado.menuP1();}
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
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


 
   

