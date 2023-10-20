public class VehiculeAMoteur {
    Moteur moteur;
    int vitesse;

    VehiculeAMoteur(){
        System.out.println("Un vehicule à moteur est construit");
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
}
