package br.com.douglaspac.androidnivelamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ex7 extends AppCompatActivity {
    Button volume;
    EditText raio;
    EditText altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex7);

        volume = (Button) findViewById(R.id.calcVolumeLata);
        raio = (EditText) findViewById(R.id.raioLata);
        altura = (EditText) findViewById(R.id.alturaLata);

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(raio.getText().toString());
                double a = Double.parseDouble(altura.getText().toString());
                double vol = Math.PI*r*r*a;

                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

                raio.setText("");
                altura.setText("");
                Toast.makeText(Ex7.this, "Volume da lata: "+vol, Toast.LENGTH_LONG).show();
            }
        });
    }
}
