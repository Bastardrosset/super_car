public class Voiture {
    int nbPortes=5;
    boolean automatique;
    String couleur;
    char permiereLettrePlaque;
    int rapportCourant;
    int vitesse;
    void klaxonner(){
        System.out.println("tutute");
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
    void tourner(boolean droite, int angle){
        String  droiteOuGauche=null;
        if(droite){
            droiteOuGauche="droite";
        }else{
            droiteOuGauche="gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
    }
}
