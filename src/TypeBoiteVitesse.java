public enum TypeBoiteVitesse {
    ROBOT("Robotisé"),
    SEMI_AUTOMATIQUE("Semi-automatique"),
    MANUELLE("Manuelle");

    String nomTypeBoite;// Permet de valorisé un nom string à chaque enumerateur

    private TypeBoiteVitesse(String nomTypeBoite){ // Constructeur retourne les valeurs
        this.nomTypeBoite=nomTypeBoite;
    }
}