package com.example.lenovo.pertemuankeenam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUsernam, edtPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsernam = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSubmit = findViewById(R.id.btnSubmit);

        edtUsernam.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //hanya klik
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //perubahan saat mengetik

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //mengetik lalu diam sesaat

            }
        });

    }

    public void simpanData(View view) {
        Log.d("Username", edtUsernam.getText().toString());
        Log.d("Password", edtPassword.getText().toString());
    }
}
