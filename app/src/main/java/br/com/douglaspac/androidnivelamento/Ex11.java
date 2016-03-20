package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Ex11 extends AppCompatActivity {
    RadioButton p1;
    RadioButton p2;
    EditText nomeP1;
    EditText alturaP1;
    EditText pesoP1;
    EditText nomeP2;
    EditText alturaP2;
    EditText pesoP2;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex11);
        nomeP1 = (EditText) findViewById(R.id.nomePessoa1);
        alturaP1 = (EditText) findViewById(R.id.alturaPessoa1);
        pesoP1 = (EditText) findViewById(R.id.pesoPessoa1);
        nomeP2 = (EditText) findViewById(R.id.nomePessoa2);
        alturaP2 = (EditText) findViewById(R.id.alturaPessoa2);
        pesoP2 = (EditText) findViewById(R.id.pesoPessoa2);

        p1 = (RadioButton) findViewById(R.id.radioButtonP1);
        p2 = (RadioButton) findViewById(R.id.radioButtonP2);

        calcular = (Button) findViewById(R.id.calcPessoas);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeP2.setVisibility(View.INVISIBLE);
                alturaP2.setVisibility(View.INVISIBLE);
                pesoP2.setVisibility(View.INVISIBLE);

                nomeP1.setVisibility(View.VISIBLE);
                alturaP1.setVisibility(View.VISIBLE);
                pesoP1.setVisibility(View.VISIBLE);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeP1.setVisibility(View.INVISIBLE);
                alturaP1.setVisibility(View.INVISIBLE);
                pesoP1.setVisibility(View.INVISIBLE);

                nomeP2.setVisibility(View.VISIBLE);
                alturaP2.setVisibility(View.VISIBLE);
                pesoP2.setVisibility(View.VISIBLE);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pessoa p1 = new Pessoa(nomeP1.getText().toString(),
                                        Double.parseDouble(alturaP1.getText().toString()),
                                        Double.parseDouble(pesoP1.getText().toString()));
                Pessoa p2 = new Pessoa(nomeP2.getText().toString(),
                        Double.parseDouble(alturaP2.getText().toString()),
                        Double.parseDouble(pesoP2.getText().toString()));

                String msg = new String("Pessoa mais alta: "+Pessoa.maisAlta(p1,p2).getNome()+"\n"+
                "Pessoa mais pesada: "+Pessoa.maisPesada(p1,p2).getNome());

                Toast.makeText(Ex11.this, msg, Toast.LENGTH_LONG).show();
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        });


    }
}
