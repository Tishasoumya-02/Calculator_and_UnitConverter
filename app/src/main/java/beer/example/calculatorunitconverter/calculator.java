package beer.example.calculatorunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private Button equal;
    private final char ADDITION='+';
    private final char SUBTRATION='-';
    private final char MULTIPLICATION='*';
    private final char DIVISION='/';
    private double val1=Double.NaN;
    private double val2;

    private char ACTION;
    private final char EQN='0';
   ;



    private TextView enter;
    private TextView result;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setupUIViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "1");
            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "2");
            }


        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "3");
            }


        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "4");
            }


        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "5");
            }


        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "6");
            }


        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "7");
            }


        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "8");
            }


        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enter.setText(enter.getText().toString() + "9");
            }


        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                enter.setText(null);
            }


        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = SUBTRATION;
                result.setText(String.valueOf(val1) + "-");
                enter.setText(null);
            }


        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                enter.setText(null);
            }


        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                enter.setText(null);
            }


        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION = EQN;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                enter.setText(null);
            }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enter.getText().length() > 0) {
                    CharSequence name = enter.getText().toString();
                    enter.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                    enter.setText(null);
                    result.setText(null);
                }
            }

        });

    }
    private void setupUIViews()
    {
        btn0=(Button)findViewById(R.id.bt0);
        btn1=(Button)findViewById(R.id.bt1);
        btn2=(Button)findViewById(R.id.bt2);
        btn3=(Button)findViewById(R.id.bt3);
        btn4=(Button)findViewById(R.id.bt4);
        btn5=(Button)findViewById(R.id.bt5);
        btn6=(Button)findViewById(R.id.bt6);
        btn7=(Button)findViewById(R.id.bt7);
        btn8=(Button)findViewById(R.id.bt8);
        btn9=(Button)findViewById(R.id.bt9);
        add=(Button)findViewById(R.id.btadd);
        sub=(Button)findViewById(R.id.btsub);
        mul=(Button)findViewById(R.id.btmul);
        div=(Button)findViewById(R.id.btdiv);
        clear=(Button)findViewById(R.id.btc);
        equal=(Button)findViewById(R.id.bteq);
        enter=(TextView)findViewById(R.id.enterid);
        result=(TextView)findViewById(R.id.resultid);



    }
    private void compute() {

        if(!Double.isNaN(val1)) {
            val2 = (Double.parseDouble(enter.getText().toString()));
            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;

                case SUBTRATION:
                    val1 = val1 - val2;
                    break;


                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;

                case DIVISION:
                    val1 = val1 / val2;
                    break;

                case EQN:
                    break;


            }
        }
        else
        {
            val1=(Double.parseDouble(enter.getText().toString()));

        }
    }

}





