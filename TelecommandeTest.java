import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {

    @Test
    /**
     * test ajout d'une lampe à une télécommande vide
     */
    public void testAjouterLampe_vide() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        // methode testee
        t.ajouterLampe(l);

        // verification
        // Pour vérifier l'ajout, on simule son activation à l'indice 0
        t.activerLampe(0);
        assertTrue(l.isAllume(), "La lampe devrait être allumée si elle a bien été ajoutée en position 0");
    }

    @Test
    /**
     * test ajout d'une lampe à une télécommande avec 1 élément
     */
    public void testAjouterLampe_1element() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1); // Télécommande avec déjà 1 élément

        // methode testee
        t.ajouterLampe(l2);

        // verification
        t.activerLampe(1); // La deuxième lampe doit être à l'indice 1
        assertTrue(l2.isAllume(), "La 2ème lampe devrait être allumée si elle a bien été ajoutée en position 1");
    }

    @Test
    /**
     * test activation d'une lampe existante en position 0
     */
    public void testActiverLampe_pos0() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        t.ajouterLampe(l1);

        // methode testee
        t.activerLampe(0);

        // verification
        assertTrue(l1.isAllume(), "La lampe en position 0 devrait être allumée après l'activation");
    }

    @Test
    /**
     * test activation d'une lampe existante en position 1
     */
    public void testActiverLampe_pos1() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);

        // methode testee
        t.activerLampe(1);

        // verification
        assertTrue(l2.isAllume(), "La lampe en position 1 devrait être allumée après l'activation");
        assertFalse(l1.isAllume(), "La lampe en position 0 ne devrait pas avoir été impactée");
    }

    @Test
    /**
     * test activation d'une lampe inexistante
     */
    public void testActiverLampe_inexistante() {
        // preparation des donnees
        Telecommande t = new Telecommande();

        // methode testee & verification
        // L'utilisation d'assertThrows permet de s'assurer que le code plante proprement
        // avec une erreur de dépassement d'index si la liste est vide.
        assertThrows(IndexOutOfBoundsException.class, () -> {
            t.activerLampe(0);
        }, "Activer une lampe à un indice inexistant devrait lever une IndexOutOfBoundsException");
    }
}