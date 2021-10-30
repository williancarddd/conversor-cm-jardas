package com.example.conversorjardas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText valor_jardas;
    Button converter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        valor_jardas = findViewById(R.id.valor_jardas);
        converter = findViewById(R.id.converter);

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valorJ = Double.parseDouble(valor_jardas.getText().toString());
                Double valorC = valorJ * 91.44;
                result.setText("resultado:" + valorC);
            }
        });
    }
}