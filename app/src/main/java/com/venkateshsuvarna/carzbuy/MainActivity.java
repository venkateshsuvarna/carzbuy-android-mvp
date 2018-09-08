package com.venkateshsuvarna.carzbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.venkateshsuvarna.carzbuy.presenter.IUserLoginPresenter;
import com.venkateshsuvarna.carzbuy.presenter.UserLoginPresenter;
import com.venkateshsuvarna.carzbuy.view.IUserLoginView;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity implements IUserLoginView{

    IUserLoginPresenter userLoginPresenter;
    Button btnLogin;
    EditText etUsername;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this,"segoeuil.ttf",true);

        userLoginPresenter = new UserLoginPresenter(this);

        btnLogin = findViewById(R.id.btn_login);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userLoginPresenter.onLogin(etUsername.getText().toString(),etPassword.getText().toString());
            }
        });

    }

    @Override
    public void showResult(boolean result) {
        if(result == true){
            //Open another activity
            Intent intent = new Intent(MainActivity.this,CarListActivity.class);
            startActivity(intent);
        }
        else{
            //Login Failed
            Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_SHORT).show();
        }
    }
}
