package app.athi.com.calc;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    /*
     * here is a simple code for login activty with sign up button
     * in this you can add another activity for sign up also by method called startActivity()
     * keep supporting for further developments tq :)
     */


    private EditText email,pass;  // for email and password
    private Button loginbtn;   // for login button
    private TextView signup; //for signup button
    public String passstr,emailstr;  // storing informail of email and password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //assigning ids

        email = (EditText) findViewById(R.id.emailedt);
        pass=(EditText) findViewById(R.id.passwordedt);
        loginbtn=(Button)findViewById(R.id.btn1);
        signup =(TextView)findViewById(R.id.signupbtn);


        //login button action listener

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 emailstr = email.getText().toString().trim();
                 passstr = pass.getText().toString().trim();
                 /* here you can direct him to new activity
                    using startActivity method or can simply display a snackbar message
                    I'll go with snackbar
                  */
                 if (TextUtils.isEmpty(emailstr)||TextUtils.isEmpty(passstr))
                     Toast.makeText(MainActivity.this, "try again", Toast.LENGTH_SHORT).show();
                 else
               Toast.makeText(MainActivity.this,"login sucess user id:"+emailstr+" password:"+pass,Toast.LENGTH_SHORT).show();
            }
        });

        //signup button
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Moves to next activity",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
