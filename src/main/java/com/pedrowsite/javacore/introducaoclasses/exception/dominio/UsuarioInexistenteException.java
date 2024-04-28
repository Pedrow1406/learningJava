package main.java.com.pedrowsite.javacore.introducaoclasses.exception.dominio;

public class UsuarioInexistenteException extends Exception {
    public UsuarioInexistenteException(String message) {
        super(message);
    }
    public UsuarioInexistenteException(){
        super();
    }
}
