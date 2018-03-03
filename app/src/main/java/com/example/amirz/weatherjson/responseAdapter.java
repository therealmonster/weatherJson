package com.example.amirz.weatherjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by amirz on 3/3/2018.
 */

public class responseAdapter extends ArrayAdapter<String > {
        private Context context;


    public responseAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
