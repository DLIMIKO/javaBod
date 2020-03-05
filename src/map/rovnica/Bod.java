package map.rovnica;

public interface Bod

{
    float getX();
    float getY();
    float[] getXY();

    void setX(float X);
    void setY(float Y);
    void setXY(float ...suradnice);
    float getDistance(Bod other);
    Bod Plus(Bod other);
    Bod Minus(Bod other);
    boolean equals(Bod other);
    String toString();
}
