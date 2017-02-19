package com.frimapp.smartmath;

import android.app.Service;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Fachri on 1/26/2017.
 */
public class InternetCheck {
    Context context;
    public InternetCheck(Context context) {
        this.context = context;
    }
    public boolean IsConnected() {
        ConnectivityManager connectivity = (ConnectivityManager)
                context.getSystemService(Service.CONNECTIVITY_SERVICE);
        if (connectivity !=null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if(info!=null){
                if (info.getState() == NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }
}
