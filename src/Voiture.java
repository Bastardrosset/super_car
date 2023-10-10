public class Voiture {
    static int nbRoues=4;
    int nbPortes=5;
    boolean automatique;
    String couleur;
    char permiereLettrePlaque;
    int rapportCourant;
    int vitesse;

    Moteur moteur;

    Voiture(){
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
    Voiture(Moteur moteur){
        this.moteur=moteur;
        System.out.println("Une nouvelle voiture est construite avec un moteur");
    }
    //Voiture(String carburation, int nbCylindres){
        //Moteur moteur=new Moteur();
        //moteur.carburation=carburation;
        //moteur.nbCylindres=nbCylindres;
        //this.moteur=moteur;
        //System.out.println("Une nouvelle voiture est construite avec des paramètres moteur");
    //}
    static void klaxonner(){
        System.out.println("tututee");
    }
    static void tourner(boolean droite, int angle){
        String  droiteOuGauche=null;
        if(droite){
            droiteOuGauche="droite";
        }else{
            droiteOuGauche="gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
    }
    int accelerer(){
        System.out.println("J'accelère à ");
        return 100;
    }
    int accelerer(int vitesse){
        System.out.println("J'accelère à ");
        this.vitesse=this.vitesse+vitesse;// ajoute la valeur initial + valeur ajouter en parametre sans this qui permet de differencié la propriété initial et le parametre
        return vitesse;
    }
    int passerRapport(boolean augmenter){
        if(augmenter){
            rapportCourant++;
        }else{
            rapportCourant--;
        }
        return rapportCourant;
    }
    Ville transport(Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager qui s'appel "+passager.prenom+" "+passager.nom);
        System.out.println(passager.prenom+" est parti de la ville de "+villeDeDepart.nom);

        Ville villeDeDestination=new Ville();
        villeDeDestination.nom="Marseille";

        return villeDeDestination;
    }
}
