package hackillinois.potkiller;

/**
 * Created by tim on 2/20/16.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user logs in
    public void loginHit(View view)
    {
        //Create an intent
        Intent intent = new Intent(this, PotholeListView.class);
        startActivity(intent);

    }
}