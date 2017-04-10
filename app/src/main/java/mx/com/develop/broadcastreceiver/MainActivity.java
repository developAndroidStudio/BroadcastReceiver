package mx.com.develop.broadcastreceiver;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btn_init_broadcast;

    //<editor-fold desc="MÉTODO CALLBACK onCreate()">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarcomponentesUI();
        controladorSetOnclickListener();
    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO inicializarcomponentesUI()">
    private void inicializarcomponentesUI() {
        btn_init_broadcast = (Button) findViewById(R.id.btn_init_broadcast);


    }
    //</editor-fold>

    //<editor-fold desc="CONTROLADOR DE EVENTOS setOnclickListener()">
    private void controladorSetOnclickListener() {
        btn_init_broadcast.setOnClickListener(this);
    }
    //</editor-fold>

    //<editor-fold desc="CONTROLADOR DE EVENTOS onClick() ">
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_init_broadcast:

                Intent i = new Intent();
                i.setAction("mx.com.develop.BUTTON_RECEIVER");
                sendBroadcast(i);
                break;
        }

    }
    //</editor-fold>


}
