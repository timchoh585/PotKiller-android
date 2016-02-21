package hackillinois.potkiller;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by tim on 2/20/16.
 */
public class PotholeListView extends AppCompatActivity
{
    private Pothole[] potholes;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pothole_list_view);

        //Initialize the potholes
        potholes = new Pothole[1];

        potholes[0] = new Pothole("Halsted and Taylor");



        PotholeArrayAdapter adapter= new PotholeArrayAdapter(this, potholes);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


        //Set up short click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //When clicked we want to take the user to the video site
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pothole pothole = (Pothole) parent.getItemAtPosition(position);
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988");
                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");

                // Attempt to start an activity that can handle the Intent
                startActivity(mapIntent);
            }
        });
    }
}
