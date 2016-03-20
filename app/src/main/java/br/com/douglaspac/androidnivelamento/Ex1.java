package br.com.douglaspac.androidnivelamento;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex1 extends AppCompatActivity {
    EditText n1;
    EditText n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        Button exibirMaior = (Button) findViewById(R.id.exibirMaiorNumero);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);

        exibirMaior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(n1.getText().toString());
                int num2 = Integer.parseInt(n2.getText().toString());
                String msg;
                if(num1>num2)
                    msg= new String("O maior número é "+num1);
                else
                    msg= new String("O maior número é "+num2);
                if(num1==num2)
                    msg= new String("Os números são iguais");

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                Toast toast = Toast.makeText(Ex1.this,msg,Toast.LENGTH_LONG);
                toast.show();

                n2.setText("");
                n1.setText("");
                n1.setFocusableInTouchMode(true);
                n1.requestFocus();
            }
        });

    }
}
