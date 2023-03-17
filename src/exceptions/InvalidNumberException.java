package exceptions;

public class InvalidNumberException  extends RuntimeException{

    public InvalidNumberException(){
        System.out.println("El numero que desea agregar no es valido");
    }

}
