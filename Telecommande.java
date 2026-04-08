import java.util.ArrayList;
import java.util.List;

public class Telecommande {

    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        throw new Error("code non ecrit");
    }

    public void activerLampe(int indiceLampe) {
        throw new Error("code non ecrit");
    }

    public void desactiverLampe(int indiceLampe) {
        throw new Error("code non ecrit");
    }

    public void activerTout() {
        throw new Error("code non ecrit");
    }

    @Override
    public String toString() {
        throw new Error("code non ecrit");
    }
}