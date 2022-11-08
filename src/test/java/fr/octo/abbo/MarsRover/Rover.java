package fr.octo.abbo.MarsRover;

import java.util.Objects;

import static fr.octo.abbo.MarsRover.Direction.*;

public class Rover {
    private int PointY;
    private int PointX;
    private Direction direction;

    public Rover(int PointX , int PointY, Direction direction) {
        this.PointX = PointX;
        this.PointY = PointY;
        this.direction = direction;
    }

    public int getPointX() {
        return PointX;
    }

    public int getPointY() {
        return PointY;
    }

    public Direction getDirection() {
        return this.direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return PointX == rover.PointX && PointY == rover.PointY && direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(PointX, PointY, direction);
    }

    public void tournerADroite() {
        this.direction = this.direction.RegarderADroite();
    }

    public void tournerAGauche() {
        this.direction = this.direction.RegarderAGauche();
    }

    public void avancer() {
        DeplacerSurX();
        deplacerSurY();
    }

    private void DeplacerSurX() {
        if (this.direction == Ouest){
            PointX = -1;
        }
        else if (direction == Est) {
            PointX = 1;
        }
    }

    private void deplacerSurY() {
        if (this.direction == Sud){
            PointY = -1;
        }
        else if(direction == Nord) {
            PointY = 1;
        }
    }

    @Override
    public String toString() {
        return "Rover{" +
                " x = " + PointX +
                ", y = " + PointY +
                ", direction = " + direction +
                '}';
    }
}