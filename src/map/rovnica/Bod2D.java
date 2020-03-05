package map.rovnica;

public class Bod2D implements Bod
{
    float x;
    float y;




    @Override
    public float getX() {
        return 0;
    }

    @Override
    public float getY() {
        return 0;
    }

    @Override
    public float[] getXY() {
        return new float[0];
    }

    @Override
    public void setX(float X) {

    }

    @Override
    public void setY(float Y) {

    }

    @Override
    public void setXY(float... suradnice) {

    }

    @Override
    public float getDistance(Bod other) {
        return 0;
    }

    @Override
    public Bod Plus(Bod other) {
        return null;
    }

    @Override
    public Bod Minus(Bod other) {
        return null;
    }

    @Override
    public boolean equals(Bod other) {
        return false;
    }
}
