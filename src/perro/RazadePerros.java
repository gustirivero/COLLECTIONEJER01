
package perro;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
 * El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista 
 * y después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
 * Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class RazadePerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
     ArrayList<String> razasDeperros = new ArrayList();
      String validar;
        
      do {

            System.out.println("Ingrese la raza de perros que desea guardar en la lista: ");
            razasDeperros.add(leer.nextLine());

          

            System.out.println("Desea agregar otra raza? si/no");
            validar = leer.nextLine();

        } while (validar.toLowerCase().equals("si"));

        
         System.out.println("Las razas de la lista son: ");
        for (String lista : razasDeperros) {
           
            System.out.println(lista);
        }

        /*
        Muestra las razas de los perros con el iterator
        
        Iterator it = razasDeperros.iterator();
        System.out.println("Elementos de la lista");
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }*/
    
    }
}
