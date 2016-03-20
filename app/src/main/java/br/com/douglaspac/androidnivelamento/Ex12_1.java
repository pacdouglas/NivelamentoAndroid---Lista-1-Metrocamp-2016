package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ex12_1 extends AppCompatActivity {
    TextView nome;
    TextView mediaSt;
    TextView situacao;
    String nAluno;
    double b1,b2,b3,b4;
    int faltas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex12_1);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            nAluno = extras.getString("nAluno");
            b1 = extras.getDouble("b1");
            b2 = extras.getDouble("b2");
            b3 = extras.getDouble("b3");
            b4 = extras.getDouble("b4");
            faltas = extras.getInt("f");
        }

        nome = (TextView) findViewById(R.id.finalNome);
        mediaSt = (TextView) findViewById(R.id.finalMedia);
        situacao = (TextView)findViewById(R.id.finalSit);
        double media = (b1+b2+b3+b4)/4.0;
        String sit;
        if(media>=5 && faltas<10){
            sit = new String("Aprovado!");
        }else if(media<5 && faltas<10){
            sit = new String("Reprovado por nota! :(");
        }else if(media>=5 && faltas>10){
            sit = new String("Reprovado por falta! :(");
        }else{
            sit = new String("Reprovado por nota e por falta! :(");
        }

        String n = new String("Nome do aluno: "+nAluno);
        String m = new String("Média: "+media);
        String s = new String("Situação: "+sit);

        nome.setText(n);
        mediaSt.setText(m);
        situacao.setText(s);
    }
}
