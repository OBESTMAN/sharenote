package com.android.sharenote.sharenote;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
    Button login;
    TextView forgotPassword;
    TextView newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        //=================================================================================
        //                              Setting views
        //=================================================================================
        login = (Button)findViewById(R.id.loginbutton);
        forgotPassword = (TextView)findViewById(R.id.forgot_password);
        newUser =(TextView)findViewById(R.id.new_user);

        //=================================================================================
        //                      Login clickListener
        //=================================================================================
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Login",Toast.LENGTH_LONG).show();
            }
        });

        //=================================================================================
        //                        forgotPassword clickListener
        //=================================================================================
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"forgot password",Toast.LENGTH_LONG).show();
            }
        });

        //=================================================================================
        //                         newUser ClickListener
        //=================================================================================
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.NewUserActivity");
                startActivity(i);
            }
        });
    }
}
