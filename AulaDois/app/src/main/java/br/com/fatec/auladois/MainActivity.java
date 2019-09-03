package br.com.fatec.auladois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override //reescrevendo método
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super - para ser o que "manda"
        setContentView(R.layout.activity_main); // setContentView vai trazer o xml para a tela. O xml está na pasta res > layout
    }
    //criar metodo para botão
    public void mensagem(View v) // com o onClick do botão para esse método
    {
        TextView titulo = (TextView) findViewById(R.id.txtTitulo); //instanciar com cast
        titulo.setText("Boa tarde");
        Toast.makeText(this, "Olá", Toast.LENGTH_SHORT).show();
    }

}

