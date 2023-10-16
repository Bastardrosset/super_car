public class Voiture extends Vehicule implements Vidangeable{
    static int nbRoues=4;
    int nbPortes=5;
    boolean automatique;
    TypeBoiteVitesse typeBoite;
    String couleur;
    char permiereLettrePlaque;
    int rapportCourant;

    Voiture(){
        super();
        System.out.println("Une voiture est construite sans paramètres");
    }
    Voiture(String couleur, int nbPortes){// Instancier plusieurs constructeurs à une même classe n'est possible qu'en utilisant qu'une seule nature de paramètre
        this.couleur=couleur;
        this.nbPortes=nbPortes;
        System.out.println("Une nouvelle voiture est en cours de construction avec des parmètres, elle possède "+nbPortes+ " portes et est de couleur "+couleur);
    }
    //Voiture(int nbPortes){
        //this.nbPortes=nbPortes;
        //System.out.println("Une voiture possède "+nbPortes+" portes");
    //}
    //Voiture(Moteur moteur){
        //this.moteur=moteur;
        //System.out.println("Une nouvelle voiture est construite avec un moteur");
    //}
    //Voiture(String carburation, int nbCylindres){
        //Moteur moteur=new Moteur();
        //moteur.carburation=carburation;
        //moteur.nbCylindres=nbCylindres;
        //this.moteur=moteur;
        //System.out.println("Une nouvelle voiture est construite avec des paramètres moteur");
    //}
    //static void klaxonner(){
        //System.out.println("tututee");
    //}
    static void tourner(boolean droite, int angle){
        String  droiteOuGauche=null;
        if(droite){
            droiteOuGauche="droite";
        }else{
            droiteOuGauche="gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
    }
    int passerRapport(boolean augmenter){
        if(augmenter){
            rapportCourant++;
        }else{
            rapportCourant--;
        }
        return rapportCourant;
    }

    @Override
    public void vidanger() {
        System.out.println("Dévisser le bouchon sous la culasse pour que ça coule");
    }


    public void klaxonner() {
        System.out.println("Tute tutee !");
    }
}
