```mermaid
classDiagram
    class Lampe {
        -nom : String
        -allumee : boolean
        +Lampe(nom: String)
        +allumer()
        +eteindre()
        +isAllumee() : boolean
        +toString() : String
        +getNom() : String
    }
    class Hifi {
        -son : int
        +Hifi()
        +allumer()
        +eteindre()
        +toString() : String
        +getSon() : int
    }
    class Telecommande {
        -lampes : List<Lampe>
        -hifis : List<Hifi>
        +Telecommande()
        +ajouterLampe(lampe: Lampe)
        +activerLampe(indice: int)
        +desactiverLampe(indice: int)
        +ajouterHifi(hifi: Hifi)
        +activerHifi(indice: int)
        +desactiverHifi(indice: int)
        +activerTout()
        +toString() : String
        +getLampes() : List<Lampe>
        +getHifis() : List<Hifi>
    }
    Telecommande <-- "0..*" Lampe : contrôle
    Telecommande <-- "0..*" Hifi : contrôle