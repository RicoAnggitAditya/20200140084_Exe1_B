package com.example.exe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class RegisterActivity extends  AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPassword,edtrepass;

    FloatingActionButton fab;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edpass);
        edtrepass = findViewById(R.id.edrepas);

        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty()) {
                    Snackbar.make(view, "Wajib isi seluruh data !!!", Snackbar.LENGTH_SHORT).show();
                } else {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(RegisterActivity.this, "Pendaftaran Behasil..!!", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), com.example.Exe.login.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view,"Password dan Repassword harus sama !!!",Snackbar.LENGTH_SHORT).show();
                    }

                }
            }

        });
    }


}
