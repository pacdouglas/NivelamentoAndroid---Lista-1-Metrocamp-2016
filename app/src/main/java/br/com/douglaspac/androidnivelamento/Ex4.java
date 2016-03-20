package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex4 extends AppCompatActivity {
    Button calcMedia;
    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota4;
    EditText nomeAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);

        calcMedia = (Button)findViewById(R.id.calcMedia);
        nota1 = (EditText)findViewById(R.id.notaBim1);
        nota2 = (EditText)findViewById(R.id.notaBim2);
        nota3 = (EditText)findViewById(R.id.notaBim3);
        nota4 = (EditText)findViewById(R.id.notaBim4);
        nomeAluno = (EditText)findViewById(R.id.nomeAluno);

        calcMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double media = (Double.parseDouble(nota1.getText().toString())+
                        Double.parseDouble(nota2.getText().toString())+
                        Double.parseDouble(nota3.getText().toString())+
                        Double.parseDouble(nota4.getText().toString()))/4;
                String msg;
                if(media>=5){
                    msg = new String("Aluno "+nomeAluno.getText().toString()+" Aprovado. Média: "+media);
                }else{
                    msg = new String("Aluno "+nomeAluno.getText().toString()+" Reprovado. Média: "+media);
                }

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                Toast.makeText(Ex4.this, msg, Toast.LENGTH_LONG).show();

                nomeAluno.setText("");
                nota1.setText("");
                nota2.setText("");
                nota3.setText("");
                nota4.setText("");

                nomeAluno.setFocusableInTouchMode(true);
                nomeAluno.requestFocus();

            }
        });

    }
}
