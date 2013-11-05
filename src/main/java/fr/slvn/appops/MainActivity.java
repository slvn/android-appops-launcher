package fr.slvn.appops;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchAppOps();
        finish();
    }

    private void launchAppOps() {
        try {
            Intent intent = new Intent("android.settings.APP_OPS_SETTINGS");
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, R.string.error_msg, Toast.LENGTH_LONG).show();
            uninstallAppOps();
        }
    }

    private void uninstallAppOps() {
        Uri uri = Uri.parse("package:" + getPackageName());
        Intent intent = new Intent(Intent.ACTION_UNINSTALL_PACKAGE, uri);
        startActivity(intent);
    }
}
