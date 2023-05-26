package org.example;

public class MarsRover {

    private int X;
    private int Y;
    private String direction;

    public MarsRover(int X, int Y, String direction) {
        this.X = X;
        this.Y = Y;
        this.direction = direction;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public String getDirection() {
        return direction;
    }

    public boolean validatePosition(int X, int Y, String direction) {
        if (X == this.X && Y == this.Y && direction.equals(this.direction)) {
            return true;
        } else return false;
    }

    public void moveForward(String command) {
        if (command.equals("f")) {
            if (this.direction.equals("N")) {
                this.Y += 1;
            } else if (this.direction.equals("S")) {
                this.Y -= 1;
            } else if (this.direction.equals("E")) {
                this.X += 1;
            } else if (this.direction.equals("W")) {
                this.X -= 1;
            }
        }
    }

    public void moveBackward(String command) {
        if (command.equals("b")) {
            if (this.direction.equals("N")) {
                this.Y -= 1;
            } else if (this.direction.equals("S")) {
                this.Y += 1;
            } else if (this.direction.equals("E")) {
                this.X -= 1;
            } else if (this.direction.equals("W")) {
                this.X += 1;
            }
        }
    }

    public void turnLeft(String command) {
        if (command.equals("l")) {
            if (this.direction.equals("N")) {
                this.direction = "W";
            } else if (this.direction.equals("W")) {
                this.direction = "S";
            } else if (this.direction.equals("S")) {
                this.direction = "E";
            } else if (this.direction.equals("E")) {
                this.direction = "N";
            }
        }
    }

    public void turnRight(String command) {
        if (command.equals("r")) {
            if (this.direction.equals("N")) {
                this.direction = "E";
            } else if (this.direction.equals("E")) {
                this.direction = "S";
            } else if (this.direction.equals("S")) {
                this.direction = "W";
            } else if (this.direction.equals("W")) {
                this.direction = "N";
            }

        }
    }
}

