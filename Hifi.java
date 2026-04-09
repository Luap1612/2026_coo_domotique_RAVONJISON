import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes = new ArrayList<>();

    public void ajouterLampe(Lampe l) {
        this.lampes.add(l);
    }
    
    public void allumerLampe(int indice) {
        this.lampes.get(indice).allumer();
    }
    
    private List<Hifi> hifis = new ArrayList<>();

    public void ajouterHifi(Hifi h) {
        this.hifis.add(h);
    }

    public void allumerHifi(int indice) {
        if (indice >= 0 && indice < hifis.size()) {
            this.hifis.get(indice).allumer();
        }
    }

    public void eteindreHifi(int indice) {
        if (indice >= 0 && indice < hifis.size()) {
            this.hifis.get(indice).eteindre();
        }
    }
}