package fr.sdv.composite;

public class Employe implements IElement {
    
    public String nom;
    public String prenom;
    public double salaire;

    @Override
    public double calculerSalaire() {
        return this.salaire;
    }

}
