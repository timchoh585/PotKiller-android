package hackillinois.potkiller;

/**
 * Created by tim on 2/20/16.
 */
public class Pothole
{
    private String streetCorner;    //String for street corner

    public Pothole(String _streetCorner)
    {
        streetCorner = _streetCorner;
    }

    //Returns the street corner
    public String getStreetCorner()
    {
        return streetCorner;
    }
}