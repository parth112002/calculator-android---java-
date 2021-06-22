package parth.first.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etfirst, etsecond;
    TextView ans;
    Button plus,min,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = findViewById(R.id.editTextNumber);
        etsecond = findViewById(R.id.editTextNumber2);
        ans = findViewById(R.id.textView5);
        plus = findViewById(R.id.button);
        min = findViewById(R.id.button2);
        div = findViewById(R.id.button4);
        mul = findViewById(R.id.button3);


        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstval, secondval, answer;
                firstval= Integer.parseInt(etfirst.getText().toString());
                secondval=Integer.parseInt(etsecond.getText().toString());

                answer = firstval+secondval;
                ans.setText("your answer is : "+answer);
            }
        });

        min.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstval, secondval, answer;
                firstval= Integer.parseInt(etfirst.getText().toString());
                secondval=Integer.parseInt(etsecond.getText().toString());

                answer = firstval-secondval;
                ans.setText("your answer is : "+answer);
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstval, secondval, answer;
                firstval= Integer.parseInt(etfirst.getText().toString());
                secondval=Integer.parseInt(etsecond.getText().toString());

                answer = firstval*secondval;
                ans.setText("your answer is : "+answer);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstval, secondval, answer;
                firstval= Integer.parseInt(etfirst.getText().toString());
                secondval=Integer.parseInt(etsecond.getText().toString());

                answer = firstval/secondval;
                ans.setText("your answer is : "+answer);
            }
        });
    }
}