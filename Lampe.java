import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une télécommande capable de contrôler plusieurs lampes et chaînes Hifi.
 */
public class Telecommande {

    /**
     * Listes des appareils contrôlés par la télécommande.
     */
    private List<Lampe> lampes;
    private List<Hifi> hifis;

    /**
     * Constructeur vide qui initialise les listes.
     */
    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();
    }

    // ==========================================
    // MÉTHODES POUR LES LAMPES
    // ==========================================

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).allumer();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune lampe à l'indice " + indiceLampe);
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).eteindre();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune lampe à l'indice " + indiceLampe);
        }
    }

    // ==========================================
    // MÉTHODES POUR LES CHAINES HIFI
    // ==========================================

    public void ajouterHifi(Hifi hifi) {
        this.hifis.add(hifi);
    }

    public void activerHifi(int indiceHifi) {
        if (indiceHifi >= 0 && indiceHifi < this.hifis.size()) {
            this.hifis.get(indiceHifi).allumer();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune chaîne Hifi à l'indice " + indiceHifi);
        }
    }

    public void desactiverHifi(int indiceHifi) {
        if (indiceHifi >= 0 && indiceHifi < this.hifis.size()) {
            this.hifis.get(indiceHifi).eteindre();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune chaîne Hifi à l'indice " + indiceHifi);
        }
    }

    // ==========================================
    // COMMANDES GLOBALES ET AFFICHAGE
    // ==========================================

    /**
     * Active toutes les lampes et toutes les chaînes Hifi.
     */
    public void activerTout() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
        }
        for (Hifi hifi : this.hifis) {
            hifi.allumer();
        }
    }

    /**
     * Retourne une description de la télécommande et de tous ses appareils.
     */
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder("Télécommande :\n");

        description.append("  -- Lampes --\n");
        for (int i = 0; i < this.lampes.size(); i++) {
            description.append("  [").append(i).append("] ").append(this.lampes.get(i).toString()).append("\n");
        }

        description.append("  -- Hifi --\n");
        for (int i = 0; i < this.hifis.size(); i++) {
            description.append("  [").append(i).append("] ").append(this.hifis.get(i).toString()).append("\n");
        }

        return description.toString();
    }
}