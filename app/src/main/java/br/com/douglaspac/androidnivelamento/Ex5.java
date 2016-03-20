package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex5 extends AppCompatActivity {
    EditText n1;
    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5);

        Button exibirPerimetro = (Button) findViewById(R.id.exibirMPerimetro);
        n1 = (EditText) findViewById(R.id.raioLata);
        n2 = (EditText) findViewById(R.id.alturaLata);

        exibirPerimetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double comprimento = Double.parseDouble(n1.getText().toString());
                double largura = Double.parseDouble(n2.getText().toString());

                double area = comprimento*largura;
                double perimetro = (2*comprimento)+(2*largura);

                String msg = new String("Área do retangulo: "+area+"\nPerimetro do Retangulo: "+perimetro);

                Toast.makeText(Ex5.this, msg, Toast.LENGTH_LONG).show();
                n1.setText("");
                n2.setText("");
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        });


    }
}
