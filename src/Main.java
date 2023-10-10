public class Main {
    public static void main(String[] args) {

        Voiture voitureDuWeekEnd=new Voiture();
        voitureDuWeekEnd.nbPortes=3;
        voitureDuWeekEnd.automatique=true;
        voitureDuWeekEnd.couleur="bleu";

        System.out.println("La voiture est de couleur "+voitureDuWeekEnd.couleur);

        voitureDuWeekEnd.klaxonner();
        //System.out.println(voitureDuWeekEnd.accelerer());
        System.out.println("La nouvelle vitesse de la voiture est "+voitureDuWeekEnd.accelerer()+" km/h");

        int nouveauRapport=voitureDuWeekEnd.passerRapport(true);
        System.out.println("Le nouveau rapport est "+nouveauRapport);

        voitureDuWeekEnd.tourner(false, 90);

        int nouvelleVitesse=voitureDuWeekEnd.accelerer(50);
        System.out.println("La nouvelle vitesse avec accéléré surchargé est de : "+nouvelleVitesse);

        Voiture voitureDeSemaine=new Voiture("Jaune", 5);
        boolean egauxOuNon= voitureDuWeekEnd.equals(voitureDeSemaine);
        System.out.println("égale ? "+egauxOuNon);
        Moteur moteur=new Moteur();
        moteur.carburation="Essence";
        moteur.nbCylindres=6;
        voitureDeSemaine.moteur=moteur;
        System.out.println("La voiture pour rouler en semaine à un moteur de "+voitureDeSemaine.moteur.nbCylindres+" cylindres et de couleur "+voitureDeSemaine.couleur);
        System.out.println("Le nombre de roue de la voiture est "+Voiture.nbRoues);

        Passager passager=new Passager();
        passager.nom="Durant";
        passager.prenom="Jean";

        Ville lyon=new Ville();
        lyon.nom="Lyon";

        Ville destination=voitureDeSemaine.transport(passager, lyon);
        System.out.println(passager.prenom+" est arrivé dans la ville de "+destination.nom);

        Voiture newVoiture=new Voiture("Verte",5);

        // Transtypage
        Voiture newVoitureSousFormeDeVoiture=(Voiture)voitureDeSemaine;
        newVoitureSousFormeDeVoiture.automatique=true;
        // ou
        ((Voiture)voitureDeSemaine).automatique=true;

        // Vehicule à moteur
        UsineDAssemblageVoiture ua=new UsineDAssemblageVoiture();
        Voiture v=ua.assemble();
    }
}