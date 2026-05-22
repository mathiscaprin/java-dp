package fr.sdv.composite;

public class Service implements IElement {
    
    public String nom;
    public IElement[] elements;

    @Override
    public double calculerSalaire() {
        double total = 0;
        for (IElement element : elements) {
            total += element.calculerSalaire();
        }
        return total;
    }

}
