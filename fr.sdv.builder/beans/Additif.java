
@Entity
public class Additif {

    @Id
    private String Nom;
    private double QteMilligramme;


    public Additif() {

    }
    
    public Additif(String nomAdditif, double qteMilligramme) {
        super();
        this.Nom = nomAdditif;
        this.QteMilligramme = qteMilligramme;
    }

}