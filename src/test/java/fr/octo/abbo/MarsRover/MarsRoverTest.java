package fr.octo.abbo.MarsRover;

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.Test;
    import static fr.octo.abbo.MarsRover.Direction.*;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertTrue;

    public class MarsRoverTest {

        @Test
        public void Doit_garder_sa_position_et_sa_direction_apres_son_initialisation_avec_X0_Y0_direction_nord(){
            //Given
                int PointX = 0;
                int PointY = 0;
                Direction direction = Nord;
            //When
                Rover rover = new Rover(PointX, PointY, direction);
            //Then
                Assertions.assertEquals(0, rover.getPointX());
                Assertions.assertEquals(0, rover.getPointY());
                Assertions.assertEquals(Nord, rover.getDirection());
        }

        @Test
        public void Doit_garder_sa_position_et_sa_direction_apres_son_initialisation_avec_X1_Y1_direction_sud(){
            //Given
                int x = 1;
                int y = 1;
                Direction direction = Sud;
            //When
                Rover rover = new Rover(x, y, direction);
            //Then
                Assertions.assertEquals(1, rover.getPointX());
                Assertions.assertEquals(1, rover.getPointY());
                Assertions.assertEquals(Sud, rover.getDirection());
        }

        @Test
        public void Deux_Rover_ayant_la_meme_position_et_direction_sont_egaux(){
            //Given
                Rover rover1 = new Rover(0, 0, Nord);
                Rover rover2 = new Rover( 0, 0, Nord);
            //When
                boolean egalite = rover1.equals(rover2);
            //Then
                assertTrue(egalite);
        }

        @Test
        public void Quand_le_Rover_est_face_au_nord_si_il_tourne_a_droite_il_sera_face_a_lest_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Nord);
            //When
                rover.tournerADroite();
            //Then
                assertEquals(new Rover(0,0, Est), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_lest_si_il_tourne_a_droite_il_sera_face_au_sud_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Est);
            //When
                rover.tournerADroite();
            //Then
                assertEquals(new Rover(0,0, Sud), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_sud_si_il_tourne_a_droite_il_sera_face_au_Ouest_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Sud);
            //When
                rover.tournerADroite();
            //Then
                assertEquals(new Rover(0,0, Ouest), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_louest_si_il_tourne_a_droite_il_sera_face_au_Nord_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Ouest);
            //When
                rover.tournerADroite();
            //Then
                assertEquals(new Rover(0,0, Nord), rover);
        }
    //....................... Tourner à gauche.........................

        @Test
        public void Quand_le_Rover_est_face_au_nord_si_il_tourne_a_gauche_il_sera_face_a_lOuest_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Nord);
            //When
                rover.tournerAGauche();
            //Then
                assertEquals(new Rover(0,0, Ouest), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_lOuest_si_il_tourne_a_gauche_il_sera_face_au_sud_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Ouest);
            //When
                rover.tournerAGauche();
            //Then
                assertEquals(new Rover(0,0, Sud), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_sud_si_il_tourne_a_Gauche_il_sera_face_a_lEst_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Sud);
            //When
                rover.tournerAGauche();
            //Then
                assertEquals(new Rover(0,0, Est), rover);
        }

        @Test
        public void Quand_le_Rover_est_face_a_Lest_si_il_tourne_a_gauche_il_sera_face_au_nord_sans_changer_de_position(){
            //Given
                Rover rover = new Rover(0, 0, Est);
            //When
                rover.tournerAGauche();
            //Then
                assertEquals(new Rover(0,0, Nord), rover);
        }

        //.............................................Avancer......................................................

        @Test
        public void Quand_le_Rover_recoit_une_commande_il_doit_conserver_sa_direction_et_avancer(){
            //Given
                Rover rover = new Rover(0, 0, Est);
            //When
                rover.avancer();
            //Then
                assertEquals(new Rover(1,0, Est), rover);
        }

        @Test
        public void Quand_le_Rover_recoit_une_commande_Aller_vers_louest_il_doit_conserver_sa_direction_et_avancer(){
            //Given
            Rover rover = new Rover(0, 0, Ouest);
            //When
            rover.avancer();
            //Then
            assertEquals(new Rover(-1,0, Ouest), rover);
        }

        @Test
        public void Quand_le_Rover_recoit_une_commande_il_doit_conserver_sa_direction_et_se_deplacer_lateralement(){
            //Given
                Rover rover = new Rover(0, 0, Nord);
            //When
                rover.avancer();
            //Then
                assertEquals(new Rover(0,1, Nord), rover);
        }

        @Test
        public void Quand_le_Rover_recoit_une_commande_Aller_vers_le_sud_il_doit_conserver_sa_direction_et_avancer(){
            //Given
            Rover rover = new Rover(0, 0, Sud);
            //When
            rover.avancer();
            //Then
            assertEquals(new Rover(0,-1, Sud), rover);
        }

    }
