package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView HelloWorldTv;
    private Button PressMeButton;
    private CheckBox checkbox_1;
    private CheckBox checkbox_2;
    private EditText operand_1;
    private EditText operand_2;
    private Button SumButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWorldTv=findViewById(R.id.hello_world_text);
        checkbox_1=findViewById(R.id.check_Me);
        checkbox_2=findViewById(R.id.check_Me_To);

        operand_1=findViewById(R.id.operand_1);
        operand_2=findViewById(R.id.operand_2);
        SumButton=findViewById(R.id.button_sum);

        PressMeButton=findViewById(R.id.press_me_button);

       // PressMeButton.setOnClickListener(view -> HelloWorldTv.setText("My name is Ilya!"));
        PressMeButton.setOnClickListener(this);
        checkbox_1.setOnClickListener(this);
        checkbox_2.setOnClickListener(this);
        SumButton.setOnClickListener(view -> sum(
          Integer.parseInt(operand_1.getText().toString()),
         Integer.parseInt(operand_2.getText().toString())
        ));


    }

    private void sum(int op1, int op2) {
        Toast.makeText(this,"Sum is: " + (op1+op2), Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.check_Me:
                Toast.makeText(this,"CheckBox Pressed!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.press_me_button:
                HelloWorldTv.setText("My name is Ilya!");
                break;
            case R.id.check_Me_To:
                Toast.makeText(this,"CheckBox Pressed!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}