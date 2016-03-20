package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex2 extends AppCompatActivity {
    EditText s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);

        Button exibirSexo = (Button) findViewById(R.id.exibirSexo);
        s1 = (EditText) findViewById(R.id.sexo);

        exibirSexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                char sexo = s1.getText().charAt(0);
                int qtd = s1.getText().length();
                String msg;

                if(sexo=='m' || sexo=='M')
                    msg = new String("Sexo: Masculino");
                else if(sexo=='f' || sexo=='F')
                    msg = new String("Sexo: Feminino");
                else
                    msg = new String("Sexo Inválido");
                if(qtd!=1)
                    msg = new String("Insira apenas um caractere");

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                s1.setText("");
                Toast toast = Toast.makeText(Ex2.this, msg, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
