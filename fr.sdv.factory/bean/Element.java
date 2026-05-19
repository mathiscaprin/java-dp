import javax.persistence.Entity;
import javax.persistence.Id;
import fr.sdv.factory.bean.Unite;

@Entity
public class Element {

    @Id
    private String Nom;
    private double Qte;
    private Unite Unite;
    


    public Element() {

    }
    
    public Element(String nomElement, double qte, Unite unite) {
        super();
        this.Nom = nomElement;
        this.Qte = qte;
        this.Unite = unite;
    }

}