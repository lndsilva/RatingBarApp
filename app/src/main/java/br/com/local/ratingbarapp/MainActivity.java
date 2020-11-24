package br.com.local.ratingbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarar as variáveis globais para o xml
    RatingBar ratingBar;
    TextView txtResultado;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chamando os métodos para executar

        addListenerOnRatingBar();
        addListenerOnButton();


    }

    private void addListenerOnButton() {
        ratingBar = findViewById(R.id.id_ratingBar);
        txtResultado = findViewById(R.id.txtResultado);


        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                txtResultado.setText(" "+String.valueOf(rating));
            }
        });
    }

    private void addListenerOnRatingBar() {
        ratingBar = findViewById(R.id.id_ratingBar);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        String.valueOf(ratingBar.getRating()),
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}