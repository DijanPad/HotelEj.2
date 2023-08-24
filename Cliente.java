/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Ejercicio 1, Overloading
 * 13-08-2023
 * @return Cliente
 */

public class Cliente {
    

private int frequency;

private int espacios; 

private boolean hasRoom;

private String name;

private String clientType;

public int getFrequency() {
    return frequency;
}

public void setFrequency(int frequency) {
    this.frequency = frequency;
    if(frequency < 5){
        this.clientType = "Regular";
    }else if(frequency >= 5){
        this.clientType = "Frecuente";
    }else if(frequency >= 10){
        this.clientType = "VIP";
    }

}

public int getEspacios() {
    return espacios;
}

public void setEspacios(int espacios) {
    this.espacios = espacios;
}

public boolean getHasRoom() {
    return hasRoom;
}

public void setHasRoom(boolean hasRoom) {
    this.hasRoom = hasRoom;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getClientType() {
    return clientType;
}

public void setClientType(String clientType) {
    this.clientType = clientType;
}

//metodos



}
