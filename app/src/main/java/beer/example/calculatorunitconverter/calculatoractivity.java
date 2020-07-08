package beer.example.calculatorunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class calculatoractivity extends AppCompatActivity {

    private TextView text1;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatoractivity);
        extras=getIntent().getExtras();
        if(extras!=null)
        {
            String message2=extras.getString("Message1");
            text1.setText(message2);

        }
    }
}
