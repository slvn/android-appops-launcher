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
            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.Settings");
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            intent.putExtra(":android:show_fragment", "com.android.settings.applications.AppOpsSummary");

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
