
@Entity
public class Marque {

    @Id
    private String Nom;

    public Marque() {

    }
    
    public Marque(String nomMarque) {
        super();
        this.Nom = nomMarque;
    }

}