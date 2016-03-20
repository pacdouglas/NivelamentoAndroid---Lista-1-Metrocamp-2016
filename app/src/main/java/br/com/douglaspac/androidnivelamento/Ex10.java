package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Ex10 extends AppCompatActivity {
    Button criarVetor;
    EditText v1;
    ArrayList<Integer> vetor;
    int soma=0;
    int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex10);
        v1 = (EditText)findViewById(R.id.vetor1);
        criarVetor = (Button)findViewById(R.id.criarVetor);
        vetor = new ArrayList<>();

        criarVetor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(cont!=10){
                    vetor.add(Integer.parseInt(v1.getText().toString()));
                    soma+=vetor.get(cont);
                    cont++;
                    v1.setText("");
                }else{
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                    Toast.makeText(Ex10.this, "Média: "+soma/10, Toast.LENGTH_LONG).show();
                    v1.setText("");
                }
            }
        });


    }
}
