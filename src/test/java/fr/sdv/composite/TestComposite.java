package fr.sdv.composite;

import junit.framework.TestCase;

public class TestComposite extends TestCase {

    public void testComposite() {
        Employe CRapsey = new Employe();
        CRapsey.nom = "Raspey";
        CRapsey.prenom = "Cécile";
        CRapsey.salaire = 100000;

        Employe BBecgkar = new Employe();
        BBecgkar.nom = "Bechkar";
        BBecgkar.prenom = "Bilel";
        BBecgkar.salaire = 8000;

        Service Service_DSIN = new Service();
        Service_DSIN.nom = "DSIN";
        Service_DSIN.elements = new IElement[] {CRapsey, BBecgkar};

        Employe JRanmey = new Employe();
        JRanmey.nom = "Ranmey";
        JRanmey.prenom = "JB";
        JRanmey.salaire = 7500;

        Employe JDoe = new Employe();
        JDoe.nom = "Doe";
        JDoe.prenom = "Jane";
        JDoe.salaire = 3500;

        Service Service_BData = new Service();
        Service_BData.nom = "Big Data";
        Service_BData.elements = new IElement[] {JRanmey, JDoe};

        Employe KGuineau = new Employe();
        KGuineau.nom = "Guineau";
        KGuineau.prenom = "Kevin";
        KGuineau.salaire = 7500;

        Employe PMartin = new Employe();
        PMartin.nom = "Martin";
        PMartin.prenom = "Paul";
        PMartin.salaire = 3500;

        Service Service_JDev = new Service();
        Service_JDev.nom = "Java Dev";
        Service_JDev.elements = new IElement[] {KGuineau, PMartin};
        
        assertEquals(108000, Service_DSIN.calculerSalaire(), 0.0001);
        assertEquals(11000, Service_BData.calculerSalaire(), 0.0001);
        assertEquals(11000, Service_JDev.calculerSalaire(), 0.0001);   

    }
    
    
}
