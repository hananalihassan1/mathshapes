package hanan.hanan.mathshapes;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TriangleActivity extends AppCompatActivity {
    EditText x_fild,h_fild;
    RadioButton area_rb,premiter_rb;
    Button result_btn,newoperation_btn;
    TextView result_txt;
    Double x,result,h;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        x_fild=(EditText) findViewById(R.id.x_fild);
        h_fild=(EditText) findViewById(R.id.h_fild);
        area_rb=(RadioButton) findViewById(R.id.area_rb);
        premiter_rb=(RadioButton) findViewById(R.id.permiter_rb);
        result_btn=(Button) findViewById(R.id.result_btn);
        newoperation_btn=(Button) findViewById(R.id.newoperation_btn);
        result_txt=(TextView) findViewById(R.id.result_txt);
        area_rb.setEnabled(false);
        premiter_rb.setEnabled(false);
        newoperation_btn.setEnabled(false);
        newoperation_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape2));








        result_btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String cureentx = x_fild.getText().toString().trim();
                String  cureenth=h_fild.getText().toString().trim();
                if (cureentx.length()==0&&cureenth.length()==0)
                {
                    Toast.makeText(TriangleActivity.this,"enter the value of x and h value",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result_btn.setEnabled(false);
                    result_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape2));
                    newoperation_btn.setEnabled(true);
                    newoperation_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape));




                    if (area_rb.isChecked())
                    {
                        x=Double.parseDouble(cureentx);
                        h=Double.parseDouble(cureenth);
                        result=0.5*x*h;
                        result_txt.setText(result +"");

                    }
                    else
                    {
                        if (premiter_rb.isChecked())
                        {
                            x=Double.parseDouble(cureentx);
                            h=Double.parseDouble(cureenth);
                            result=3.0*x;
                            result_txt.setText(result+"");
                            result_btn.setEnabled(false);
                            result_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape2));
                            newoperation_btn.setEnabled(true);
                            newoperation_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape));








                        }
                        else
                        {
                            Toast.makeText(TriangleActivity.this,"please choose  between area and premiter",Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }
        });
        newoperation_btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                result=0.0;
                result_txt.setText("");
                x_fild.setText("");
                h_fild.setText("");
                area_rb.setEnabled(false);
                premiter_rb.setEnabled(false);
                newoperation_btn.setEnabled(false);
                newoperation_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape2));
                result_btn.setEnabled(true);
                result_btn.setBackground(getResources().getDrawable(R.drawable.butoon_shape));

            }
        });
        x_fild.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                result_txt.setText(s);

            }

            @Override
            public void afterTextChanged(Editable s) {
                area_rb.setEnabled(true);
                premiter_rb.setEnabled(true);

            }
        });
        h_fild.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                result_txt.setText(s);

            }

            @Override
            public void afterTextChanged(Editable s) {
                area_rb.setEnabled(true);
                premiter_rb.setEnabled(true);

            }
        });









    }
}
