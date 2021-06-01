package com.example.thesmartcity_vgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class formactivity extends AppCompatActivity {

    EditText name,mobile_no,noofguests,email,guestOf,date;
    public String Name,Mobile,NoofGuests,Email,GuestOf,Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formactivity);

        name=findViewById(R.id.txtName);
        mobile_no=findViewById(R.id.txtMobile);
        noofguests=findViewById(R.id.txtGuests);
        email=findViewById(R.id.txtEmail);
        guestOf=findViewById(R.id.txtGuestOf);
        date=findViewById(R.id.txtDate);
        Button submit=findViewById(R.id.btnSubmit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFilled()){
                    data();
                    Intent intent=new Intent(formactivity.this,cardactivity.class);
                    intent.putExtra("Name",Name);
                    intent.putExtra("Mobile",Mobile);
                    intent.putExtra("Noofguests",NoofGuests);
                    intent.putExtra("Email",Email);
                    intent.putExtra("Guestof",GuestOf);
                    intent.putExtra("Date",Date);
                    startActivity(intent);
                }
            }
        });
    }

    public void data(){
        Name=name.getText().toString();
        Mobile=mobile_no.getText().toString();
        NoofGuests=noofguests.getText().toString();
        Email=email.getText().toString();
        GuestOf=guestOf.getText().toString();
        Date=date.getText().toString();
    }



    private Boolean isFilled(){
        boolean result=false;
        data();
        if(Name.isEmpty()||Mobile.isEmpty()||NoofGuests.isEmpty()||Email.isEmpty()||GuestOf.isEmpty()||Date.isEmpty()){
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        }else{
            result = true;
        }
        return result;
    }
}