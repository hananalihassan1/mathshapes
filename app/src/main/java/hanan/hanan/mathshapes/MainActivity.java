package hanan.hanan.mathshapes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout square_btn;
    LinearLayout circle_btn;
    LinearLayout rectangle_btn;
    LinearLayout triangle_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        square_btn=(LinearLayout) findViewById(R.id.square_btn);
        square_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,squareActivity.class);
                startActivity(n);
            }
        });
        circle_btn=(LinearLayout) findViewById(R.id.circle_btn);
        circle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,CircleActivity.class);
                startActivity(n);


            }
        });
        rectangle_btn=(LinearLayout) findViewById(R.id.rectangle_btn);
        rectangle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,RectangleActivity.class);
                startActivity(n);


            }
        });
        triangle_btn=(LinearLayout) findViewById(R.id.triangle_btn);
        triangle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,TriangleActivity.class);
                startActivity(n);


            }
        });
    }

}
