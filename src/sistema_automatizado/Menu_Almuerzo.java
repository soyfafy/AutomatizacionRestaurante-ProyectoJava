/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class Menu_Almuerzo {

    double SaldoCompras =0;
    double MontoTotal=0;
    double Impuestos=0;
    
    public void mAlmuerzo()
    {
         boolean continuar = true;
       
        
        while(continuar)
        {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"<HTML><h1>•••••••••••••••••••••••••• Almuerzos ••••••••••••••••••••••••••</h1></HTML>\n"+
						"<HTML><h2>Casado - Opcion #1</h1></HTML>\n"+
                                                "-Arroz\nFrijoles\n-yuca\n-Platano\n-Mixto de carne y pollo\n-Ensalada\n-Bebida Natural\n" +
                                                "<HTML><h2>Precio: ₡2500</h3></HTML>\n" +

						"<HTML><h2>Chifijo - Opcion #2</h1></HTML>\n"+
                                                "-Arroz\n-Frijoles\n-Pico de gallo\n-chicharron\n-Aguacate\n-Tortilla tostada\n-Bebida natural\n" +
                                                "<HTML><h2>Precio: ₡2800</h3></HTML>\n" +
                    
						"<HTML><h2>Espagueti a la boloñesa con Camarones - Opcion #3</h2></HTML>\n"+
                                                "-Pasta al tiempo\n-Camarones\n-Salsa de vino blanco\n-Pan tostado con mantequilla de ajo\n-Bebida natural\n" +
                                                "<HTML><h2>Precio: ₡3500</h3></HTML>\n" +
                    
						"<HTML><h2>Elaborar su propio almuerzo - Opcion #4</h2></HTML>\n"+
                                                "-En esta opcion usted puede pedir diferentes ingredientes para su Almuerzo y asi poder eleborar una opcion mas a su gusto\n" +
                                                "<HTML><h2>Precio: Sujeto a los productos elegidos</h3></HTML>\n" +
                                                "<HTML><h1>•••••••••••••••••••••••• Elije la Opcion ••••••••••••••••••••••••</h1></HTML>", "Menu", 1));
           
            
            
            switch (opcion)
            {
                
                case 1:
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?","Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(2500*cantidad);
                break;
                
                case 2:
                    int cantidad2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(2800*cantidad2);
                break;
                 
                case 3:
                    int cantidad3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos desayunos de esta opcion desea llevar?", "Menu", JOptionPane.QUESTION_MESSAGE));
                    SaldoCompras+=(3500*cantidad3);
                break;
                
                case 4:
                    {MA_Personalizado menuP2 = new MA_Personalizado();
                    MA_Personalizado.menuP2();}
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


 
