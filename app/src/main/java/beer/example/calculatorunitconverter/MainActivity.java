package beer.example.calculatorunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView calculator;
    private ImageView unitconvertor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = (ImageView) findViewById(R.id.calcultorID);
        unitconvertor = (ImageView) findViewById(R.id.convertorID);
        calculator.setOnClickListener(this);
        unitconvertor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.calcultorID:
                Toast.makeText(this, "Calculator", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(this,calculator.class);
                startActivity(intent);

                break;
            case R.id.convertorID:
                Toast.makeText(this, "Unit Convertor", Toast.LENGTH_LONG).show();
                Intent intent1=new Intent(this,convertor.class);
                startActivity(intent1);
                break;
            default:
               // Toast.makeText(this, "Nothing is shown", Toast.LENGTH_LONG).show();
                break;
        }

        }
    }
