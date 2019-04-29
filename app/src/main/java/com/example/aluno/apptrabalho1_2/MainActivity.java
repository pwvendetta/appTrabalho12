package com.example.aluno.apptrabalho1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView result;
    public EditText num;
    public Button btnSub;
    public Button btnSoma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.txtResult);
        num = (EditText) findViewById(R.id.edtxtNum);
        btnSub = (Button) findViewById(R.id.btnSubt);
        btnSoma = (Button) findViewById(R.id.btnSoma);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Double.parseDouble(result.getText().toString());
                resultado -= Double.parseDouble(num.getText().toString());
                result.setText(""+resultado);
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Double.parseDouble(result.getText().toString());
                resultado += Double.parseDouble(num.getText().toString());
                result.setText(""+resultado);
            }
        });


    }
}
