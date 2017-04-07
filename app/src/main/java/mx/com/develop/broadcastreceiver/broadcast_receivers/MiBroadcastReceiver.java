package mx.com.develop.broadcastreceiver.broadcast_receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MiBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Se ha habilitado el modo avion", Toast.LENGTH_SHORT).show();

    }
}
