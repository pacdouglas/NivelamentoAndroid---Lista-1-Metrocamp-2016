package br.com.douglaspac.androidnivelamento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bEx1 = (Button) findViewById(R.id.button);
        Button bEx2 = (Button) findViewById(R.id.button2);
        Button bEx3 = (Button) findViewById(R.id.button3);
        Button bEx4 = (Button) findViewById(R.id.button4);
        Button bEx5 = (Button) findViewById(R.id.button5);
        Button bEx6 = (Button) findViewById(R.id.button6);
        Button bEx7 = (Button) findViewById(R.id.button7);
        Button bEx8 = (Button) findViewById(R.id.button8);
        Button bEx9 = (Button) findViewById(R.id.button9);
        Button bEx10 = (Button) findViewById(R.id.button10);
        Button bEx11 = (Button) findViewById(R.id.button11);
        Button bEx12 = (Button) findViewById(R.id.button12);

        bEx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex1.class);
                startActivity(it);
            }
        });

        bEx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex2.class);
                startActivity(it);
            }
        });

        bEx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex3.class);
                startActivity(it);
            }
        });

        bEx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex4.class);
                startActivity(it);
            }
        });

        bEx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex5.class);
                startActivity(it);
            }
        });

        bEx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex6.class);
                startActivity(it);
            }
        });

        bEx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex7.class);
                startActivity(it);
            }
        });

        bEx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex8.class);
                startActivity(it);
            }
        });

        bEx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex9.class);
                startActivity(it);
            }
        });

        bEx10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex10.class);
                startActivity(it);
            }
        });

        bEx11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex11.class);
                startActivity(it);
            }
        });

        bEx12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Ex12.class);
                startActivity(it);
            }
        });
    }

}
