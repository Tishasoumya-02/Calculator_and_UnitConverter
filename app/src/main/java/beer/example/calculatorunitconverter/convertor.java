package beer.example.calculatorunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class convertor extends AppCompatActivity {

    private Spinner from;
    private Spinner to;
    private TextView Fromheader;
    private TextView Toheader;
    private EditText enter;
    private TextView output;
    private String[] names={"Kilometre(km)","Metre(m)","Centimetre(cm)","Millimetre(mm)","Foot(ft)","Inch(in)","Miles"};
    private int n=0,n1=0,i,j;
    private Button go;
    private double value=0.0;
    private double result;
    private Button clearbutton;
    private String valueentered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);

        from=(Spinner)findViewById(R.id.fromspinner);
        to=(Spinner)findViewById(R.id.tospinner);
        Fromheader=(TextView)findViewById(R.id.fromtextID);
        Toheader=(TextView)findViewById(R.id.toID);
        enter=(EditText) findViewById(R.id.enterID);
        output=(TextView)findViewById(R.id.outputID);
        go=(Button)findViewById(R.id.goID);
        clearbutton=(Button)findViewById(R.id.clearID);
        go.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }
       private void convert()
        {
             valueentered=enter.getText().toString();
            for(i=0;i<7;i++) {
                n=0;
                if (String.valueOf(from.getSelectedItem()).equals(names[i]))
                {
                    n = i;
                    break;

                }

            }
            for(j=0;j<7;j++)
            {
                n1=0;
                if(String.valueOf(to.getSelectedItem()).equals(names[j]))
                {
                    n1=j;
                    break;

                }


            }
            value=Double.parseDouble(valueentered);

            String s1=String.valueOf(n);
            String s2=String.valueOf(n1);
            String s=s1.concat(s2);
            String action=s;
            switch(action)
            {
                case "01":

                    result=value*1000.0;
                    output.setText(" "+result+ " m");


                    break;
                case "02":

                    result=value*100000.0;
                    output.setText(" "+result+" cm");

                    break;
                case "03":

                    result=value*1000000.0;
                    output.setText(" "+result+" mm");

                    break;
                case "04":

                    result=value*3280.84;
                    output.setText(" "+result+" ft");

                    break;
                case "05":

                    result=value*39370.8;
                    output.setText(" "+result+" in");

                    break;
                case "06":

                    result=value*0.621371;
                    output.setText(" "+result+" miles");

                    break;
                case "10":

                    result=value*0.001;
                    output.setText(" "+result+ " km");

                    break;
                case "12":

                    result=value*100.0;
                    output.setText(" "+result+" cm");

                    break;
                case "13":

                    result=value*1000;
                    output.setText(" "+result+" mm");

                    break;
                case "14":

                    result=value*3.28084;
                    output.setText(" "+result+" ft");

                    break;
                case "15":

                    result=value*39.37008;
                    output.setText(" "+result+" in");

                    break;
                case "16":

                    result=value*0.000621;
                    output.setText(" "+result+" miles");

                    break;
                case "20":

                    result=value*0.00001;
                    output.setText(" "+result+" km");

                    break;
                case "21":

                    result=value*0.01;
                    output.setText(" "+result+" m");

                    break;
                case "23":

                    result=value*10;
                    output.setText(" "+result+ " mm");

                    break;
                case "24":

                    result=value*0.032808;
                    output.setText(" "+result+ " ft");

                    break;
                case "25":

                    result=value*0.393701;
                    output.setText(" "+result+ " in");

                    break;
                case "26":

                    result=value*0.000006;
                    output.setText(" "+result+ " miles");
                    break;
                case "30":

                    result=value*0.000001;
                    output.setText(" "+result+ " km");

                    break;
                case "31":

                    result=value*0.001;
                    output.setText(" "+result+" m");

                    break;
                case "32":

                    result=value*0.1;
                    output.setText(" "+result+" cm");

                    break;
                case "34":

                    result=value*0.003281;
                    output.setText(" "+result+" ft");

                    break;
                case "35":

                    result=value*0.03937;
                    output.setText(" "+result+ " in");

                    break;
                case "36":

                    result=value*0.000000621;
                    output.setText(" "+result+" miles");
                    break;
                case "40":

                    result=value*0.000305;
                    output.setText(" "+result+" km");

                    break;
                case "41":

                    result=value*0.3048;
                    output.setText(" "+result+" m");

                    break;
                case "42":

                    result=value*30.48;
                    output.setText(" "+result+" cm");

                    break;
                case "43":

                    result=value*304.8;
                    output.setText(" "+result+" mm");

                    break;
                case "45":

                    result=value*12;
                    output.setText(" "+result+ " in");

                    break;
                case "46":

                    result=value*0.000189;
                    output.setText(" "+result+" miles");

                    break;
                case "50":

                    result=value*0.000025;
                    output.setText(" "+result+" km");

                    break;
                case "51":

                    result=value*0.0254;
                    output.setText(" "+result+" m");
                    break;
                case "52":

                    result=value*2.54;
                    output.setText(" "+result+ " cm");

                    break;
                case "53":

                    result=value*25.4;
                    output.setText(" "+result+" mm");

                    break;
                case "54":

                    result=value*0.083333;
                    output.setText(" "+result+ " ft");

                    break;
                case "56":

                    result=value*0.000016;
                    output.setText(" "+result+" miles");

                    break;
                case "60":

                    result=value*1.690344;
                    output.setText(" "+result+" km");

                    break;
                case "61":

                    result=value*1609.344;
                    output.setText(" "+result+" m");

                    break;
                case "62":

                    result=value*160934.4;
                    output.setText(" "+result+ " cm");

                    break;
                case "63":

                    result=value*1609344.0;
                    output.setText(" "+result+" mm");

                    break;
                case "64":

                    result=value*5280.0;
                    output.setText(" "+result+ " ft");

                    break;
                case "65":

                    result=value*63360;
                    output.setText(" "+result+" in");

                    break;
                default:
                    result=value*1.0;
                    output.setText(" "+result+" ");











            }





    }

    private  void clear()
    {
      enter.setText(null);
      output.setText(null);
      result=0.0;
    }
}
