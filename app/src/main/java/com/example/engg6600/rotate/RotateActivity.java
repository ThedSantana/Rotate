package com.example.engg6600.rotate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RotateActivity extends AppCompatActivity {

    Button rotateButton;
    ImageView imageView;
    int numClicks=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        imageView = (ImageView)findViewById(R.id.imageView);
        rotateButton =(Button)findViewById(R.id.rotateButton);
        rotateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imageView.setPivotX(imageView.getWidth()/2);
                imageView.setPivotY(imageView.getHeight()/2);
                imageView.setRotation(30*numClicks);
                numClicks++;

            }
        });
    }
}
