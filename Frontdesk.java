/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Frontdesk
 */

public class Frontdesk {
    
private int income;


//Metodos
public int getIncome() {
    return income;
}

public void setIncome(int income) {
    this.income = income;
}

//metodo no previsto
public void incometostring(){
    System.out.println("EL total vendido es de Q." + this.income);
}

//el metodo asignar paso a ser un ciclo en el Driver

public void showReservs(Room cuarto){
    System.out.println("Cuarto de tipo " + cuarto.getTipo() + " fue reservado por " + cuarto.getGuest()); 
}

}
