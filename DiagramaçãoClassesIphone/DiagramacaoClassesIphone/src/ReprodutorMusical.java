import java.util.ArrayList;
import java.util.List;

public interface ReprodutorMusical {
    List<Musica> musicas = new ArrayList<>();

    void tocar();
    void pausar();
    void selecionarMusica();
}