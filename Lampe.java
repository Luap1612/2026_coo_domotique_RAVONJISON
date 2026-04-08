import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une télécommande capable de contrôler plusieurs lampes.
 */
public class Telecommande {

    /**
     * Liste des lampes contrôlées par la télécommande.
     */
    private List<Lampe> lampes;

    /**
     * Constructeur vide qui construit une télécommande ne contrôlant initialement aucune lampe.
     */
    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    /**
     * Ajoute une lampe à la télécommande.
     * @param lampe La lampe à ajouter.
     */
    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    /**
     * Active la lampe située à l'indice donné.
     * @param indiceLampe L'indice de la lampe à activer.
     */
    public void activerLampe(int indiceLampe) {
        // Gestion du cas exceptionnel : on vérifie que l'indice est valide
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).allumer();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune lampe à l'indice " + indiceLampe);
        }
    }

    /**
     * Désactive la lampe située à l'indice donné.
     * @param indiceLampe L'indice de la lampe à désactiver.
     */
    public void desactiverLampe(int indiceLampe) {
        // Gestion du cas exceptionnel : on vérifie que l'indice est valide
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).eteindre();
        } else {
            throw new IndexOutOfBoundsException("Erreur : Aucune lampe à l'indice " + indiceLampe);
        }
    }

    /**
     * Active toutes les lampes contrôlées par la télécommande.
     */
    public void activerTout() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
        }
    }

    /**
     * Retourne une description de la télécommande et de ses lampes.
     */
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder("Télécommande :\n");
        // On parcourt la liste pour afficher l'indice et la description de chaque lampe
        for (int i = 0; i < this.lampes.size(); i++) {
            description.append("  [").append(i).append("] ").append(this.lampes.get(i).toString()).append("\n");
        }
        return description.toString();
    }
}