package map.rovnica;

public class Bod3D implements Bod3
{
    private float x;
    private float y;
    private float z;


  public Bod3D(float X, float Y, float Z) {x=X;y=Y;z=Z;}




    @Override
    public void setZ(float Z)
    {
     z=Z;
    }

    @Override
    public float getZ()
    {
        return z;
    }

    @Override
    public void setXYZ(float X, float Y, float Z)
    {x=X;y=Y;z=Z;}

    @Override
    public float[] getXYZ()
    {
        return new float[]{x,y,z};
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
        x=X;
    }

    @Override
    public void setY(float Y)
    {
        y=Y;
    }

    @Override
    public void setXY(float... suradnice)
    {
        x=suradnice[0];
        y=suradnice[1];
        z=suradnice[2];
    }

    @Override
    public float getDistance(Bod other)
    {
        return (float)Math.sqrt(Math.pow(other.getX()-x,2)+Math.pow(other.getY()-y,2)+Math.pow(((Bod3D)other).getZ()-z,2));
    }

    @Override
    public Bod Plus(Bod other)
    {
        return new Bod3D(x+other.getX(), y+other.getY(), z+((Bod3D)other).getZ());
    }

    @Override
    public Bod Minus(Bod other)
    {
        return new Bod3D(x-other.getX(), y-other.getY(), z-((Bod3D)other).getZ());
    }

    @Override
    public boolean equals(Bod other)
    {
        return (x==other.getX() && y==other.getY() && z==((Bod3D)other).getZ());
    }
}
