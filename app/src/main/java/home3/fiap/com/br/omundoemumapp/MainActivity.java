package home3.fiap.com.br.omundoemumapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void entrar(View v){
        Intent it = new Intent(this, Main2Activity.class);

        startActivity(it);

    }
}
