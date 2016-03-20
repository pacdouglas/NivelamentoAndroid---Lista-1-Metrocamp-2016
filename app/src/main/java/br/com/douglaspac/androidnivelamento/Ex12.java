package br.com.douglaspac.androidnivelamento;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex12 extends AppCompatActivity {
    Button sitAluno;
    EditText nomeAluno;
    EditText bim1;
    EditText bim2;
    EditText bim3;
    EditText bim4;
    EditText faltas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex12);

        sitAluno = (Button) findViewById(R.id.buttonSitAluno);
        nomeAluno = (EditText)findViewById(R.id.nomeAluno12);
        bim1 = (EditText)findViewById(R.id.notaBim1);
        bim2 = (EditText)findViewById(R.id.notaBim2);
        bim3 = (EditText)findViewById(R.id.notaBim3);
        bim4 = (EditText)findViewById(R.id.notaBim4);
        faltas = (EditText)findViewById(R.id.faltasAluno);

        sitAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nomeAluno.getText().toString().equals("") ||
                        bim1.getText().toString().equals("") ||
                        bim2.getText().toString().equals("") ||
                        bim3.getText().toString().equals("") ||
                        bim4.getText().toString().equals("") ||
                        faltas.getText().toString().equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Ex12.this);
                    builder.setMessage("Preencha todos os Campos")
                            .setTitle("Erro")
                            .setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else {
                    String nAluno = nomeAluno.getText().toString();
                    double b1 = Double.parseDouble(bim1.getText().toString());
                    double b2 = Double.parseDouble(bim2.getText().toString());
                    double b3 = Double.parseDouble(bim3.getText().toString());
                    double b4 = Double.parseDouble(bim4.getText().toString());
                    int f = Integer.parseInt(faltas.getText().toString());

                    Intent it = new Intent(Ex12.this, Ex12_1.class);
                    it.putExtra("nAluno", nAluno);
                    it.putExtra("b1", b1);
                    it.putExtra("b2", b2);
                    it.putExtra("b3", b3);
                    it.putExtra("b4", b4);
                    it.putExtra("f", f);
                    startActivity(it);
                }

            }
        });
    }


}
