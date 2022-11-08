package fr.octo.abbo.MarsRover;

    public enum Direction {
        Nord("Est", "Ouest"), Sud("Ouest", "Est"),
        Est("Sud", "Nord"), Ouest("Nord","Sud" );

        private String gauche;
        private String droite;

        Direction(String droite, String gauche) {
            this.droite = droite;
            this.gauche = gauche;
            }

        public Direction RegarderADroite() {
            return Direction.valueOf(droite);
            }

        public Direction RegarderAGauche() {
            return Direction.valueOf(gauche);
            }
    }