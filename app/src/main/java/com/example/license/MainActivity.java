package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText inputname;
    EditText inputaddress;
    EditText inputbday;
    EditText inputsex;
    EditText inputheight;
    EditText inputweight;
    EditText inputnationality;
    EditText inputrestrictions;
    EditText inputcondition;
    EditText inputagy;
    EditText inputexpires;
    EditText inputlnum;
    EditText inputasst;
    EditText inputdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputname=findViewById(R. id. name);
        inputaddress = findViewById(R. id. address);
        inputbday=findViewById(R. id. bday);
        inputsex = findViewById(R. id. sex);
        inputheight=findViewById(R. id. height);
        inputweight = findViewById(R. id. weight);
        inputnationality=findViewById(R. id. nationality);
        inputrestrictions = findViewById(R. id. restrictions);
        inputcondition=findViewById(R. id. condition);
        inputagy = findViewById(R. id. agy);
        inputexpires=findViewById(R. id. expires);
        inputlnum = findViewById(R. id. lnum);
        inputasst=findViewById(R. id. asst);
        inputdate = findViewById(R. id. date);
    }

    public void btngo(View view) {
        String name = inputname.getText().toString();
        String address = inputaddress.getText().toString();
        String bday = inputbday.getText().toString();
        String sex = inputsex.getText().toString();
        String height = inputheight.getText().toString();
        String weight = inputweight.getText().toString();
        String nationality = inputnationality.getText().toString();
        String restrictions = inputrestrictions.getText().toString();
        String condition = inputcondition.getText().toString();
        String agy = inputagy.getText().toString();
        String expires = inputexpires.getText().toString();
        String lnum = inputlnum.getText().toString();
        String asst = inputasst.getText().toString();
        String date = inputdate.getText().toString();


            Intent intent = new Intent(getApplicationContext(), showoutput.class);
            intent.putExtra("keyname" , name);
            intent.putExtra("keyadd", address);
            intent.putExtra("keybday" , bday);
            intent.putExtra("keysex", sex);
            intent.putExtra("keyheight" , height);
            intent.putExtra("keyweight", weight);
            intent.putExtra("keynationality" , nationality);
            intent.putExtra("keyrestrictions", restrictions);
            intent.putExtra("keycondition" , condition);
            intent.putExtra("keyagy", agy);
            intent.putExtra("keyexpires" , expires);
            intent.putExtra("keylnum", lnum);
            intent.putExtra("keyasst" , asst);
            intent.putExtra("keydate", date);
            startActivity(intent);



    }
}
