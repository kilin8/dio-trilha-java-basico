import java.util.ArrayList;
import java.util.List;

public interface AparelhoTelefonico {
    List<Contato> contatos = new ArrayList<>();

    boolean redeDisponivel();
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}