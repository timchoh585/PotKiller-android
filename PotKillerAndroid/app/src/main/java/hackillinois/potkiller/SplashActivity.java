package hackillinois.potkiller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tim on 2/20/16.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Need to make the splash screen longer

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}