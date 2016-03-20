package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex3 extends AppCompatActivity {
    EditText n1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
        Button converter = (Button)findViewById(R.id.converterEmDolar);
        n1 = (EditText)findViewById(R.id.valorEmReal);

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorEmDolar = Double.parseDouble(n1.getText().toString())*4;
                String msg = new String("Em dolar: $"+valorEmDolar);

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                Toast toast = Toast.makeText(Ex3.this,msg,Toast.LENGTH_LONG);
                toast.show();
                n1.setText("");

            }
        });
    }
}
