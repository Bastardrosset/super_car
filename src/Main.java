public class Main {
    public static void main(String[] args) {

        Voiture voitureDuWeekEnd=new Voiture();
        voitureDuWeekEnd.nbPortes=3;
        voitureDuWeekEnd.automatique=true;
        voitureDuWeekEnd.couleur="bleu";

        System.out.println("La voiture est de couleur "+voitureDuWeekEnd.couleur);

        voitureDuWeekEnd.klaxonner();
        //System.out.println(voitureDuWeekEnd.accelerer());
        //System.out.println("La nouvelle vitesse de la voiture est "+voitureDuWeekEnd.accelerer()+" km/h");

        int nouveauRapport=voitureDuWeekEnd.passerRapport(true);
        System.out.println("Le nouveau rapport est "+nouveauRapport);

        voitureDuWeekEnd.tourner(false, 90);

        //int nouvelleVitesse=voitureDuWeekEnd.accelerer(50);
        //System.out.println("La nouvelle vitesse avec accéléré surchargé est de : "+nouvelleVitesse);

        Voiture voitureDeSemaine=new Voiture("Jaune", 5);
        boolean egauxOuNon= voitureDuWeekEnd.equals(voitureDeSemaine);
        System.out.println("égale ? "+egauxOuNon);
        Moteur moteur=new Moteur();
        moteur.carburation="Essence";
        moteur.nbCylindres=6;
        //voitureDeSemaine.moteur=moteur;
        //System.out.println("La voiture pour rouler en semaine à un moteur de "+voitureDeSemaine.moteur.nbCylindres+" cylindres et de couleur "+voitureDeSemaine.couleur);
        System.out.println("Le nombre de roue de la voiture est "+Voiture.nbRoues);

        Passager passager=new Passager();
        passager.nom="Durant";
        passager.prenom="Jean";

        Ville lyon=new Ville();
        lyon.nom="Lyon";

        //Ville destination=voitureDeSemaine.transport(passager, lyon);
        //System.out.println(passager.prenom+" est arrivé dans la ville de "+destination.nom);

        Voiture newVoiture=new Voiture("Verte",5);

        // Transtypage
        Voiture newVoitureSousFormeDeVoiture=(Voiture)voitureDeSemaine;
        newVoitureSousFormeDeVoiture.automatique=true;
        // ou
        ((Voiture)voitureDeSemaine).automatique=true;

        // Vehicule à moteur
        UsineDAssemblageVoiture ua=new UsineDAssemblageVoiture();
        //Voiture v=ua.assemble();

        Voiture peugeot208=new Voiture();
        //VehiculeAMoteur peugeot207=new Voiture();
        Vidangeable peugeot205=new Voiture();

        Voiture peugeot206=new Voiture();
        peugeot206.typeBoite=TypeBoiteVitesse.SEMI_AUTOMATIQUE;
        peugeot206.couleur="rouge";

        System.out.println("Le type de la boite a vitesse de la peugeot 206 est "+peugeot206.typeBoite.nomTypeBoite);
        System.out.println(peugeot206.typeBoite.ordinal());// Ordinal() permet de retourner la valeur numérique de l'énumerateur

        //switch (peugeot206.typeBoite){
            //case ROBOT:
                //System.out.println("La boite est robotisé");
                //break;
            //case SEMI_AUTOMATIQUE:
                //System.out.println("La boite est semi automatique");
                //break;
            //case MANUELLE:
                //System.out.println("La boite est manuelle");
                //break;
        //}

        Velo superBike=new Velo();
        superBike.Klaxonner();

        Voiture[] tableauVoiture=new Voiture[10];
        tableauVoiture[0]=peugeot206;
        System.out.println("La 206 est "+tableauVoiture[0].couleur);

        Passager passager2=new Passager();
        passager2.nom="Dupond";
        passager2.prenom="Michel";
        Ville depart=new Ville();
        depart.nom="Paris";

        Ville etape1= new Ville();
        etape1.nom="Reims";

        Ville etape2= new Ville();
        etape2.nom="Strasbourg";

        Ville etape3= new Ville();
        etape3.nom="Grenoble";

        Ville etape4= new Ville();
        etape4.nom="Privas";

        Ville[] villeEtapes=new Ville[4];
        villeEtapes[0]=etape1;
        villeEtapes[1]=etape2;
        villeEtapes[2]=etape3;
        villeEtapes[3]=etape4;

        peugeot206.transport(passager, depart, villeEtapes);
    }
}