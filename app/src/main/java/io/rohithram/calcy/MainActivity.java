package io.rohithram.calcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView output;
    Button add,sub,multi,div,clear,expt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        input1 =  (EditText) findViewById(R.id.et_input1);
        input2 =  (EditText) findViewById(R.id.et_input2);
        output = (TextView)findViewById(R.id.result);
        add= (Button)findViewById(R.id.add);
        sub= (Button)findViewById(R.id.subtract);
        multi= (Button)findViewById(R.id.multiply);
        div= (Button)findViewById(R.id.divide);
        clear= (Button)findViewById(R.id.clear);
        expt = (Button) findViewById(R.id.exponent);
        final double[] i1 = new double[1];
        final double[] i2 = new double[1];
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                i1[0] = Double.parseDouble(input1.getText().toString());
                i2[0] = Double.parseDouble(String.valueOf(input2.getText().toString()));
                double sum = i1[0] + i2[0];
                output.setText(String.valueOf(sum));
            }
            catch (Exception e){
                if(TextUtils.isEmpty(input1.getText().toString()))
                    input1.setError("you can't leave this empty");
                if(TextUtils.isEmpty(input2.getText().toString()))
                    input2.setError("you can't leave this empty");

            }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    i1[0] = Double.parseDouble(input1.getText().toString());
                    i2[0] = Double.parseDouble(String.valueOf(input2.getText().toString()));
                    double diff = i1[0] - i2[0];
                    output.setText(String.valueOf(diff));
                } catch (Exception e) {
                    if (TextUtils.isEmpty(input1.getText().toString()))
                        input1.setError("you can't leave this empty");
                    if (TextUtils.isEmpty(input2.getText().toString()))
                        input2.setError("you can't leave this empty");

                }
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    i1[0] = Double.parseDouble(input1.getText().toString());
                    i2[0] = Double.parseDouble(String.valueOf(input2.getText().toString()));
                    double multi1 = i1[0] * i2[0];
                    output.setText(String.valueOf(multi1));
                } catch (Exception e) {
                    if (TextUtils.isEmpty(input1.getText().toString()))
                        input1.setError("you can't leave this empty");
                    if (TextUtils.isEmpty(input2.getText().toString()))
                        input2.setError("you can't leave this empty");

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    i1[0] = Double.parseDouble(input1.getText().toString());
                    i2[0] = Double.parseDouble(String.valueOf(input2.getText().toString()));
                    double div1 = i1[0] / i2[0];
                    output.setText(String.valueOf(div1));
                } catch (Exception e) {
                    if (TextUtils.isEmpty(input1.getText().toString()))
                        input1.setError("you can't leave this empty");
                    if (TextUtils.isEmpty(input2.getText().toString()))
                        input2.setError("you can't leave this empty");


                }
            }
        });
        expt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    i1[0] = Double.parseDouble(input1.getText().toString());
                    i2[0] = Double.parseDouble(String.valueOf(input2.getText().toString()));
                    double expt= java.lang.Math.pow(i1[0],i2[0]);
                    output.setText(String.valueOf(expt));
                } catch (Exception e) {
                    if (TextUtils.isEmpty(input1.getText().toString()))
                        input1.setError("you can't leave this empty");
                    if (TextUtils.isEmpty(input2.getText().toString()))
                        input2.setError("you can't leave this empty");


                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input1.setText("");
                    input2.setText("");
                    output.setText("Result");

                } catch (Exception e) {


                }
            }
        });
    }
}