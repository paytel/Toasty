package com.example.libtost;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void tb(Context c,String msg){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }
}
