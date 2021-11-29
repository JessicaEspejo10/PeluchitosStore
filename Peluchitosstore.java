/*
 * Crear una aplicacion para la tienda peluchitos.com en el que se pueda hacer un CRUD 
(Create, Read, Update, Delete) y se almacene las propiedades: Nombre, Cantidad, Precio, Tmaaño y Referencia.
Se debe visualizar un menu en el que el ususario digite la opcion deseada
1
 */
package peluchitosstore;

import java.util.Scanner;
import java.util.ArrayList;

public class Peluchitosstore {

   static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<String> nombreList = new ArrayList<String>();
        ArrayList<String> tamanoList = new ArrayList<String>();
        ArrayList<String> referenciaList = new ArrayList<String>();
        ArrayList<Integer> cantidadList = new ArrayList<Integer>();
        ArrayList<Double> precioList = new ArrayList<Double>();
        String nombre, tamano, referencia;
        int cantidad, opcion;
        double precio;
                
    do{
        opcion = mostrarMenu();
        switch(opcion){
            case 1 : 
                System.out.println("Digite la referencia del peluche");
                referencia = lector.next();
                referenciaList.add(referencia);
                
                System.out.println("Digite el nombre del peluche");
                nombre = lector.next();
                nombreList.add(nombre);
                
                System.out.println("Digite la cantidad de peluches");
                cantidad = lector.nextInt();
                cantidadList.add(cantidad);
                
                System.out.println("Digite el precio del peluche");
                precio = lector.nextDouble();
                precioList.add(precio);
                
                System.out.println("Digite el tamaño: Grande, Mediano, Pequeño");
                tamano = lector.next();
                tamanoList.add(tamano);
                
                break;
            case 2:
                System.out.println("Digite el nombre del peluche a buscar");
                nombre = lector.next();
                boolean existeElPeluche=false;
                for (int i=0;i<nombreList.size();i++){
                    if(nombre.equals(nombreList.get(i))){
                        System.out.println("\nPELUCHE ENCONTRADO\nNombre: "+nombre+"\nReferencia: "+referenciaList.get(i)
                                +"\nCantidad: "+cantidadList.get(i)+"\nPrecio: "+precioList.get(i)+"\nTamano: "+tamanoList.get(i));
                        existeElPeluche=true;
                    }
                    
                }
                if(!existeElPeluche){
                    System.out.println("PELUCHE NO ENCONTRADO");
                }
                break;
            case 4:
                System.out.println("Digite el nombre del peluche a eliminar");
                nombre = lector.next();
                existeElPeluche=false;
                for (int i=0;i<nombreList.size();i++){
                    if(nombre.equals(nombreList.get(i))){
                        nombreList.remove(i);
                        referenciaList.remove(i);
                        cantidadList.remove(i);
                        precioList.remove(i);
                        tamanoList.remove(i);
                        existeElPeluche=true;                       
                    }
                }
                if(!existeElPeluche){
                    System.out.println("PELUCHE NO ENCONTRADO");
                }
            case 5:
                /*int i=0;
                while(i<referenciaList.size()){
                    System.out.println("Referencia: "+referenciaList.get(i));
                    i++;
                }*/
                for(int i=0;i<nombreList.size();i++){
                    System.out.println("\nPeluche No. "+i+1);      
                    System.out.println("\nReferencia: "+referenciaList.get(i));
                    System.out.println("\nNombre: "+nombreList.get(i));
                    System.out.println("\nCantidad: "+cantidadList.get(i));
                    System.out.println("\nPrecio: "+precioList.get(i));
                    System.out.println("\nTamano: "+tamanoList.get(i));
                    
                }
                break;
            case 6:
            
                System.out.println("Gracias, chao chao");
                break;
        }
    }while(opcion!=6);
}
    
    private static int mostrarMenu(){
        int opcion;
        System.out.println("Peluchitos Store\n1. Agregar\n2. Buscar\n3. Modificar"
                + "\n4. Borrar\n5. Ver inventario\n6. Salir\nDigite la opción deseada");
        opcion = lector.nextInt();
        return opcion;
    }
}
