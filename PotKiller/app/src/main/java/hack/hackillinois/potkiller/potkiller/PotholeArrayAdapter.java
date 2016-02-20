package hack.hackillinois.potkiller.potkiller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by timothyjosefik on 2/20/16.
 */
public class PotholeArrayAdapter extends ArrayAdapter<Pothole>
{
    public PotholeArrayAdapter(Context context, Pothole[] songs)
    {
        super(context, R.layout.pothole_info_row, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Try to reuse the views
        View potholeRow = convertView;

        //If it didn't work then create the row
        if(potholeRow == null)
        {
            LayoutInflater songInflater = LayoutInflater.from(getContext());
            potholeRow = songInflater.inflate(R.layout.pothole_info_row, parent, false);
            potholeRow.setBackgroundColor(0xFF006699);
        }

        //Grab the pothole object at that location
        Pothole pothole = getItem(position);
        TextView street =  (TextView)potholeRow.findViewById(R.id.streetCornerTextLabel);

        street.setText("Tester");


        return potholeRow;
    }
}
