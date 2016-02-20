package hack.hackillinois.potkiller.potkiller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by timothyjosefik on 2/19/16.
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
