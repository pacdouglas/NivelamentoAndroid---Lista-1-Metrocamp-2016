package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex9 extends AppCompatActivity {
    Button troca;
    EditText num1;
    EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex9);

        troca = (Button)findViewById(R.id.trocaVariaveis);
        num1 = (EditText)findViewById(R.id.numero1);
        num2 = (EditText)findViewById(R.id.numero2);

        troca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int aux = n2;
                n2 = n1;
                n1 = aux;

                String msg = new String("Troca efetuada.\n"+"V1: "+n1+"\nV2: "+n2);

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                Toast.makeText(Ex9.this, msg, Toast.LENGTH_LONG).show();

                num1.setText("");
                num2.setText("");

                num1.setFocusableInTouchMode(true);
                num1.requestFocus();

            }
        });
    }
}
