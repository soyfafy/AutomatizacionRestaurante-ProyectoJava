/* 
Proyecto de Introduccion a la Programacion - Universidad Fidelitas CII 2021
 */
package sistema_automatizado;

import javax.swing.JOptionPane;

public class MA_Personalizado {
    public static void menuP2() {
          int cantProdTotal = 10;
          int codProds[] = new int[]{1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
          String nombres[] = new String[]{"Arroz con pollo", "Hamburguesa", "Papas Fritas", "Ensalada mixta", "Arroz", "Frijoles", "Tortillas", "Chicharron", "Bebida  Natural", "Gaseosa"};
          int precios[] = new int[]{1500, 1500, 800, 400, 500, 500, 1000, 900, 500, 500};
          
          int codProdCarrito[] = new int [10];
          int cantCarrito[] = new int [10];
          int subtCarrito[] = new int [10];
          
          int cantLineas = 0;
          
          int op;
          
          do{
             op = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Perzonalizado de Almuerzos, elije el numero de opcion:\n"+
                                                                           "1. Mostrar lista de productos\n"+
                                                                           "2. Mostrar el menu comprado\n"+
                                                                           "3. Agregar producto\n"+
                                                                           "4. Para salir y obtener su factura total\n", "Menu", JOptionPane.INFORMATION_MESSAGE));
             
             switch (op){
                 case 1: mostrarProductos(codProds, nombres, precios, cantProdTotal);
                     break;
                 case 2: mostrarCarrito(codProds, nombres, precios,  
                         codProdCarrito, cantCarrito, subtCarrito, cantLineas);
                     break;
                 case 3: if (cantLineas < 9){
                     cantLineas = agregarCarrito(codProds, nombres, precios,  
                         codProdCarrito, cantCarrito, subtCarrito, cantLineas);
                 }else{
                    JOptionPane.showMessageDialog(null, "Carrito lleno", "Menu de productos", JOptionPane.INFORMATION_MESSAGE);
                 }
                 break;  
             }
          } while (op !=4);
          int sumaTotal = mostrarCarrito(codProds, nombres, precios,  
                         codProdCarrito, cantCarrito, subtCarrito, cantLineas);
          JOptionPane.showMessageDialog(null, "Total de compra de su menu personalizado: ₡" +sumaTotal, "Menu de productos", JOptionPane.INFORMATION_MESSAGE);
         
    }
    
    public static void mostrarProductos (int[] cp, String[] np, int[] pp, int cant){
        String Cad="";
        int i;
        boolean Disponibles = false;
            for (i=0;i<cant;i++){
            Cad+= "\n- Producto #"+ cp[i] + " || " + np[i] + " || ₡" + pp[i];
            Disponibles = true;
            }
            JOptionPane.showMessageDialog(null, "Productos disponibles:\n" +Cad, "Menu de productos", JOptionPane.INFORMATION_MESSAGE);
    }
        
    public static int mostrarCarrito (int[] cp, String[] np, int[] pp, int[] cp_linea, int[] cantLinea, int[] subt, int cantLineas){
        String Cad="";
        int i, suma = 0;
        
        boolean Disponibles = false;
        for (i=0;i<cantLineas;i++){
         int h = buscarProd(cp_linea[i], cp);
         {
         Cad+= "\n- Producto #"+ cp_linea[i] + " || " + np[h] + " || Costo: ₡" + pp[h] + " || Cantidas Unitario: " + cantLinea[i] + " || Total: ₡" + subt[i];
         Disponibles = false;
         }
         JOptionPane.showMessageDialog(null, "Productos en su lista compra:\n" +Cad, "Menu de productos", JOptionPane.INFORMATION_MESSAGE);
         suma = suma + subt[i];
        } 
         return suma;
        }   
        
    

    
    public static int buscarProd(int codBus, int[] productos){
        int posicion = -1;
        for(int i=0;i<10;i++){
            if(codBus == productos[i]){
                posicion = i;
            }
        }
        return posicion;
    }
    
    public static int agregarCarrito (int[] cp, String[] np, int[] pp, int[] cp_linea, int[] cantLinea, int[] subt, int cantLineas){
        
        int cod = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese codigo", "Menu", JOptionPane.INFORMATION_MESSAGE));
        
        int posi = buscarProd(cod, cp);
        if(posi == -1){
            JOptionPane.showMessageDialog(null, "Ese producto no existe", "Menu", JOptionPane.INFORMATION_MESSAGE);
            return cantLineas;
        }
        
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad", "Menu", JOptionPane.INFORMATION_MESSAGE));
        
        cp_linea[cantLineas] = cod;
        cantLinea[cantLineas] = cant;
        subt[cantLineas] = pp[posi] * cant;
        
        return (cantLineas + 1);
        }
       

}