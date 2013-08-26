package fr.slvn.appops;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("android.settings.APP_OPS_SETTINGS");
        startActivity(intent);
        finish();
    }
}
