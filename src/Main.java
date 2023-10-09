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

        Voiture voitureDeSemaine=new Voiture();
        boolean egauxOuNon= voitureDuWeekEnd.equals(voitureDeSemaine);
        System.out.println("égale ? "+egauxOuNon);

        //if(voitureDeSemaine.couleur==null){
          //  System.out.println("Couleur de la voiture null");
        //}
    }
}