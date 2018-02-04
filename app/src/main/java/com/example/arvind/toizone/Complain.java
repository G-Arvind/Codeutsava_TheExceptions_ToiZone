package com.example.arvind.toizone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Complain extends AppCompatActivity  {

    private EditText TextSubject;
    private EditText TextMessage;
    private EditText username;
    private EditText mailaccount;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);



        TextSubject = (EditText) findViewById(R.id.editTextSubject);
        TextMessage = (EditText) findViewById(R.id.editTextMessage);
        username=(EditText)findViewById(R.id.Name);
        mailaccount=(EditText)findViewById(R.id.mail);
        buttonSend=(Button)findViewById(R.id.buttonSend);


        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextSubject.getText().toString().length()==0) {
                    TextSubject.setError("subject is required");
                }

                else if(TextMessage.getText().toString().length()==0) {
                    TextMessage.setError("please give feedback");


                }
                else if(username.getText().toString().length()==0) {
                    username.setError("please enter your name");
                }

                else if(mailaccount.getText().toString().length()==0) {
                    mailaccount.setError("please enter your mail");
                }
                else
                {
                    sendEmail();
                }

            }
        });
    }
    private void sendEmail() {


        String email="bheem.karthik007@gmail.com";
        String subject = TextSubject.getText().toString().trim();
        String message = TextMessage.getText().toString().trim();
        String Name= username.getText().toString().trim();;
        String sender= mailaccount.getText().toString().trim();



        SendMail sm = new SendMail(this, email, subject, message,Name,sender);


        sm.execute();
    }

}
