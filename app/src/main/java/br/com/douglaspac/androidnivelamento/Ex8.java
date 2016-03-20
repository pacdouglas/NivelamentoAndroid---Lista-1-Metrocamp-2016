package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex8 extends AppCompatActivity {
    Button convert;
    EditText temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex8);

        convert = (Button) findViewById(R.id.exibirGraus);
        temp = (EditText) findViewById(R.id.graus);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fah = Double.parseDouble(temp.getText().toString());
                double cel = (fah-32)*5/9;

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                temp.setText("");

                Toast.makeText(Ex8.this, "Temperatura em Celcius: "+cel, Toast.LENGTH_LONG).show();

            }
        });

    }
}
