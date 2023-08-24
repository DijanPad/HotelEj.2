/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Driver
 */

import java.util.Scanner;
public class Hotel_Driver {

public static void main(String[] args){
    
    //instancia de todas las clases

    Scanner scanner = new Scanner(System.in);
    
    Cliente c1 = new Cliente();
    Cliente c2 = new Cliente();
    Cliente c3 = new Cliente();
    Cliente c4 = new Cliente();
    Cliente c5 = new Cliente();
    Cliente c6 = new Cliente();

   

    Room E1 = new Room();
    Room E2 = new Room();

    E1.setTipo("Estandar");
    E1.setDisponibilidad(true);
    E1.setEspacio(4);
    E1.setPrecio(1000);
    E1.setRqeuisito(0);

    E2.setTipo("Estandar");
    E2.setDisponibilidad(true);
    E2.setEspacio(4);
    E2.setPrecio(1000);
    E2.setRqeuisito(0);

    Room D1 = new Room();
    Room D2 = new Room();

    D1.setTipo("Delux");
    D1.setDisponibilidad(true);
    D1.setEspacio(6);
    D1.setPrecio(5000);
    D1.setRqeuisito(5);

    D2.setTipo("Delux");
    D2.setDisponibilidad(true);
    D2.setEspacio(6);
    D2.setPrecio(5000);
    D2.setRqeuisito(5);

    Room S1 = new Room();
    Room S2 = new Room();

    S1.setTipo("Suit");
    S1.setDisponibilidad(true);
    S1.setEspacio(8);
    S1.setPrecio(50000);
    S1.setRqeuisito(10);

    S2.setTipo("Suit");
    S2.setDisponibilidad(true);
    S2.setEspacio(8);
    S2.setPrecio(50000);
    S2.setRqeuisito(10);

    Frontdesk frontdesk = new Frontdesk();

    frontdesk.setIncome(0);

    //arrays y variables absolutas 
    
    Cliente[] clientes = {c1,c2,c3,c4,c5,c6};
    Room[] rooms = {E1,E2,D1,D2,S1,S2};

    boolean program = true;
    int r=0;

    //ciclo del programa
    while (program == true) {
        System.out.println("\n");
        System.out.println("===Tranquility Base Hotel & Casino===");
        System.out.println("Four stars out of Five");
        System.out.println("Escoja una opcion ");
        System.out.println("1. Nuevo cliente");
        System.out.println("2. Ver Lista de espera");
        System.out.println("3. Asignar cuartos");
        System.out.println("4. Ver cuartos asignados");
        System.out.println("5. Ver ganancias totales");
        System.out.println("6. Salir");


        System.out.println("\n Ingrese una opcion:");
        int e = scanner.nextInt();
        if (e == 1){
        String catcher = scanner.nextLine();
        System.out.println(catcher);
        System.out.println("Ingrese su nombre");
        String g = scanner.nextLine();
        clientes[r].setName(g);

        System.out.println("Ingrese su frecuencia en este hotel");
        int freq = scanner.nextInt();
        clientes[r].setFrequency(freq);

        clientes[r].setHasRoom(false);

        System.out.println("Ingrese cuantas personas ");
        int nump = scanner.nextInt();
        clientes[r].setEspacios(nump);
        r++;
        
        } else if (e == 2){
            for (int i = 0; i < clientes.length; i++) {
                    System.out.println(clientes[i].getName() + " que ha visitado el hotel " + clientes[i].getFrequency() + " veces.");
                }


                //esto es lo que iba a ser el metodo asignar que para no complicarme tanto lo saque al main
        } else if (e == 3){
            for (int t = 0; t < clientes.length; t++){
            for (int i = 0; i < rooms.length; i++){
            if (clientes[t].getFrequency() > rooms[i].getRqeuisito() && clientes[t].getEspacios() < rooms[i].getEspacio() && clientes[t].getHasRoom() == false && rooms[i].getDisponibilidad() == true){
                rooms[i].setDisponibilidad(false);
                clientes[t].setHasRoom(true); 
                rooms[i].setGuest(clientes[t].getName());
                frontdesk.setIncome(frontdesk.getIncome() + rooms[i].getPrecio());

            }
            }
            }

        } else if (e == 4){
            for (int i = 0; i < rooms.length; i++) {
                frontdesk.showReservs(rooms[i]);   
                }
        }else if (e == 5){
            frontdesk.incometostring();

        } else if (e == 6){
            program = false;

        } 

}
scanner.close(); 
}
}