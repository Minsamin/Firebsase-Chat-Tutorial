package com.androidea.firebasechattutorial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Administrator on 22-03-2017.
 */

public class ExampleActivity extends Activity {

    public void Example()
    {
        Resources resources = this.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int height = displayMetrics.heightPixels;


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle(R.string.app_name).setMessage(R.string.app_name).setPositiveButton(R.string.app_name, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).setNegativeButton(R.string.app_name, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();


        String a1;
        String a2;
        String a3;
        String a4;
        String a5;

        String ANDROID_STUDIO;


    }
}
