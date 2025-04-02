package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue ,etSecondValue;
    TextView tvans;
    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etFirstValue= (EditText) findViewById(R.id.etFirstNumber);
        etSecondValue= (EditText) findViewById(R.id.etSecondNumber);
        tvans= (TextView) findViewById(R.id.tvAns);
        add= (Button) findViewById(R.id.btnAdd);
        subtract= (Button) findViewById(R.id.btnSubtract);
        multiply= (Button) findViewById(R.id.btnMultiply);
        divide= (Button) findViewById(R.id.btnDivision);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue + secondvalue;
                tvans.setText("Ans is= "+ ans);

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue - secondvalue;
                tvans.setText("Ans is= "+ ans);

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue * secondvalue;
                tvans.setText("Ans is= "+ ans);

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;

                firstvalue=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue / secondvalue;
                tvans.setText("Ans is= "+ ans);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}