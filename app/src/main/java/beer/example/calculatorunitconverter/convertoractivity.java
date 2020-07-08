package beer.example.calculatorunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class convertoractivity extends AppCompatActivity {
    private TextView text2;
    private Bundle extras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertoractivity);
        text2=(TextView)findViewById(R.id.text2);
        extras=getIntent().getExtras();
        if(extras!=null)
        {
            String message=extras.getString("message2");
            text2.setText(message);
        }

    }
}
