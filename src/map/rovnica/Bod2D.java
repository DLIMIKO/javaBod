package map.rovnica;

public class Bod2D implements Bod
{
    float x;
    float y;

    public Bod2D(float X, float Y)
    {
        this.x=X;
        this.y=Y;

    }


    @Override
    public float getX()
    {
        return x;
    }

    @Override
    public float getY()
    {
        return y;
    }

    @Override
    public float[] getXY()
    {
        return new float[]{x,y};
    }

    @Override
    public void setX(float X)
    {
        this.x=X;
    }

    @Override
    public void setY(float Y)
    {
        this.y=Y;
    }

    @Override
    public void setXY(float... suradnice)
    {
        this.x=suradnice[0];
        this.y=suradnice[1];
    }

    @Override
    public float getDistance(Bod other)
    {
        return (float )Math.sqrt(Math.pow(this.x-other.getX(),2)+Math.pow(this.y-other.getY(),2));
    }

    @Override
    public Bod Plus(Bod other)
    {

        return new Bod2D(this.x+other.getX(), this.y+other.getY());
    }

    @Override
    public Bod Minus(Bod other)
    {
        return new Bod2D(this.x-other.getX(), this.y-other.getY());
    }

    @Override
    public boolean equals(Bod other)
    {
        return(this.x==other.getX() && this.y==other.getY());
    }
}
