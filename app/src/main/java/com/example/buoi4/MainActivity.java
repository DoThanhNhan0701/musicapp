package com.example.buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewDH;
    EditText editTextTitle;
    EditText editTextColor;
    EditText editTextsize;
    Button buttonchange;
    Button buttonexit;
    ImageView imageViewDH;
    Button buttonlogo1;
    Button buttonlogo2;
    Button buttonfitxy, buttoncenterCrop, buttonfincenter;
    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();

        buttonfitxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewDH.setScaleType(ImageView.ScaleType.FIT_XY);
            }
        });
        buttoncenterCrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewDH.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        });
        buttonfincenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewDH.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        });

        imageViewDH.setImageResource(R.drawable.img_2);
        constraintLayout.setBackgroundResource(R.drawable.img_3);

        buttonlogo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewDH.setImageResource(R.drawable.img);
            }
        });
        buttonlogo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewDH.setImageResource(R.drawable.img_1);
            }
        });

        buttonexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        buttonchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editTextTitle.getText().toString();
                int color = Integer.parseInt(editTextColor.getText().toString());
                int size = Integer.parseInt(editTextsize.getText().toString());


                textViewDH.setText(text);
                textViewDH.setTextSize(size);

                switch (color){
                    case 1:
                        textViewDH.setTextColor(Color.rgb(255,0, 0));

                        break;
                    case 2:
                        textViewDH.setTextColor(Color.rgb(0,255, 0));
                        break;
                    case 3:
                        textViewDH.setTextColor(Color.rgb(0,0, 255));
                        break;
                    default:
                        textViewDH.setTextColor(Color.rgb(216,191, 216));
                        break;

                }
            }
        });
    }




    private void mapping(){
        textViewDH = (TextView) findViewById(R.id.textViewĐH);
        editTextTitle = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextColor = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextsize = (EditText) findViewById(R.id.editTextTextPersonName3);
        buttonchange = (Button) findViewById(R.id.buttonchange);
        buttonexit = (Button) findViewById(R.id.buttonexit);
        buttonlogo1 = (Button) findViewById(R.id.logo1);
        buttonlogo2 = (Button) findViewById(R.id.logo2);
        imageViewDH = (ImageView) findViewById(R.id.imageView3);
        buttonfitxy = (Button) findViewById(R.id.fitXY);
        buttoncenterCrop = (Button) findViewById(R.id.centerCrop);
        buttonfincenter = (Button) findViewById(R.id.fitCenter);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraint);

    }
}