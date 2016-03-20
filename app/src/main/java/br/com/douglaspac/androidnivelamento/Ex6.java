package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex6 extends AppCompatActivity {
    Button calcTaxas;
    EditText terrenoTotal;
    EditText construcao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex6);

        calcTaxas = (Button) findViewById(R.id.calcTaxas);
        terrenoTotal = (EditText) findViewById(R.id.terrenoTotal);
        construcao = (EditText) findViewById(R.id.construcao);

        calcTaxas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double terreno = Double.parseDouble(terrenoTotal.getText().toString());
                double construc = Double.parseDouble((construcao.getText().toString()));

                double taxas = (5*construc)+(3.80*(terreno-construc));
                String msg = new String("Total de Taxas: R$"+taxas);
                terrenoTotal.setText("");
                construcao.setText("");

                Toast.makeText(Ex6.this, msg, Toast.LENGTH_LONG).show();

                terrenoTotal.setFocusableInTouchMode(true);
                terrenoTotal.requestFocus();
            }
        });

    }
}
