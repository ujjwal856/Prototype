package com.example.prototype;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText ed;
    Button btn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.ans);
        ed = findViewById(R.id.input);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            String ans = ed.getText().toString();
            int i = Integer.parseInt(ans);

            t.setVisibility(View.VISIBLE);
                if (i == 4) {
                    t.setText("CORRECT");
                } else {
                    t.setText("INCORRECT");
                }
        });
    }
}
