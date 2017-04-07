package mx.com.develop.broadcastreceiver.broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class LlamadaReceiver extends BroadcastReceiver {

    //<editor-fold desc="MÉTODO onReceive()">
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Toast.makeText(context, "Estado" + state, Toast.LENGTH_SHORT).show();
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras
                        .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context, "El número " + phoneNumber + " esta llamando", Toast.LENGTH_SHORT).show();
            }
        }
    }
    //</editor-fold>
}
