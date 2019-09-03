package br.com.fatec.aula3_idioma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText info = (EditText) findViewById(R.id.edtInfo); //Instanciar box com cast
        SharedPreferences dados =  getSharedPreferences( "fatec", MODE_PRIVATE);// so digita as aspas o name vem automatico
        info.setText(dados.getString("caixa", ""));

    }

    public void gravar(View v){ //evento clic para view

        EditText info = (EditText) findViewById(R.id.edtInfo); //Instanciar box com cast
        SharedPreferences.Editor dados =  getSharedPreferences( "fatec", MODE_PRIVATE).edit();// so digita as aspas o name vem automatico
        dados.putString("caixa", info.getText().toString());
        dados.apply();

    }

}
