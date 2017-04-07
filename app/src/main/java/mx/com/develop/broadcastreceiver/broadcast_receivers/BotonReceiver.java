package mx.com.develop.broadcastreceiver.broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BotonReceiver extends BroadcastReceiver {

    //<editor-fold desc="MÉTODO onReceive()">
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Se ha pulsado el boton", Toast.LENGTH_SHORT).show();
    }
    //</editor-fold>
}
