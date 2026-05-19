
@Entity
public class Allergene {

    @Id
    private String Nom;
    private double QteMilligramme;

    public Allergene() {

    }

    public Allergene(String nomAllergene, double qteMilligramme) {
        super();
        this.Nom = nomAllergene;
        this.QteMilligramme = qteMilligramme;
    }

}