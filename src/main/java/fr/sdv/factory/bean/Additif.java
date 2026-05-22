package fr.sdv.factory.bean;

public class Additif extends Element {
    
    public Additif() {

    }
    
    public Additif(String nomAdditif, double qteMilligramme) {
        super(nomAdditif, qteMilligramme, Unite.MILLI_GRAMMES);
    }

}
