/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Room
 */

public class Room {
    
private String tipo;

private boolean disponibilidad;

private int espacio;

private int precio;

private int rqeuisito;

// atributo no previsto
private String guest;


public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public boolean getDisponibilidad() {
    return disponibilidad;
}

public void setDisponibilidad(boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
}

public int getEspacio() {
    return espacio;
}

public void setEspacio(int espacio) {
    this.espacio = espacio;
}

public int getPrecio() {
    return precio;
}

public void setPrecio(int precio) {
    this.precio = precio;
}

public int getRqeuisito() {
    return rqeuisito;
}

public void setRqeuisito(int rqeuisito) {
    this.rqeuisito = rqeuisito;
}

public String getGuest() {
    return guest;
}

public void setGuest(String guest) {
    this.guest = guest;
}





}
