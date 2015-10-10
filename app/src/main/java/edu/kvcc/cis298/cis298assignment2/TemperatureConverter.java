package edu.kvcc.cis298.cis298assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TemperatureConverter extends AppCompatActivity {


    private RadioGroup mFromRadioGroup;
    private RadioGroup mToRadioGroup;
    private RadioButton mType1;
    private RadioButton mType2;
    private RadioButton mType3;
    private RadioButton mType4;
    private RadioButton mType5;
    private RadioButton mType6;
    private RadioButton mType7;
    private RadioButton mType8;

    private Button mCovertButton;

    private TextView mResultTextView;
    private TextView mFormulaTextView;

    private EditText userInputText;


    private RadioButton fromRadioButton;


/*    public void onRadioButtonClicked(View view){

        boolean checked = ((RadioButton)view).isChecked();

        switch(view.getId()){
            case R.id.type_1:
                if(checked){
                    mResultTextView.setText("C");
                }
                break;
            case R.id.type_2:
                if(checked){
                    mResultTextView.setText("F");
                }
                break;
            case R.id.type_3:
                if(checked){
                    mResultTextView.setText("K");
                }
                break;
            case R.id.type_4:
                if(checked){
                    mResultTextView.setText("R");
                }
                break;
        }

    }*/


/*    public void test(){
        if(mType1.isChecked()){
            mResultTextView.setText("C");

        }else if (mType2.isChecked()){
            mResultTextView.setText("F");

        }else if(mType3.isChecked()){
            mResultTextView.setText("K");

        }else if(mType4.isChecked()){
           mResultTextView.setText("R");
        }

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        mResultTextView =(TextView)findViewById(R.id.result_text);
        mFormulaTextView=(TextView)findViewById(R.id.formula_text);

        userInputText = (EditText) findViewById(R.id.editText);

        mFromRadioGroup = (RadioGroup) findViewById(R.id.from_group);
        mToRadioGroup = (RadioGroup) findViewById(R.id.to_group);

        mType1 = (RadioButton) findViewById(R.id.type_1);
        mType2 = (RadioButton) findViewById(R.id.type_2);
        mType3 = (RadioButton) findViewById(R.id.type_3);
        mType4 = (RadioButton) findViewById(R.id.type_4);
        mType5 = (RadioButton) findViewById(R.id.type_5);
        mType6 = (RadioButton) findViewById(R.id.type_6);
        mType7 = (RadioButton) findViewById(R.id.type_7);
        mType8 = (RadioButton) findViewById(R.id.type_8);

        mCovertButton = (Button) findViewById(R.id.convert_button);
        mCovertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (userInputText.getText().length() == 0) {

                    Toast.makeText(TemperatureConverter.this,
                            R.string.reminder_toast,
                            Toast.LENGTH_SHORT).show();
                    return;
                }


          /*      int selectedId = mFromRadioGroup.getCheckedRadioButtonId();
                fromRadioButton = (RadioButton)findViewById(selectedId);
                Toast.makeText(TemperatureConverter.this,
                                fromRadioButton.getText(),
                                Toast.LENGTH_SHORT).show();
                mResultTextView.setText(fromRadioButton.getText());*/


                 double inputValue = Double.parseDouble(userInputText.getText().toString());

                if(mType1.isChecked())
                {
                    if(mType5.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToCelsius(inputValue)));
                        mFormulaTextView.setText("Celsius = Celsius");
                    }

                    if(mType6.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToFahrenheit(inputValue)));
                        mFormulaTextView.setText(" F =  C × 1.8 + 32");
                    }

                    if(mType7.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToKelvin(inputValue)));
                        mFormulaTextView.setText("K = C  + 273.15");
                    }

                    if(mType8.isChecked()){
                         mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToRankin(inputValue)));
                         mFormulaTextView.setText("Ra =  C × 1.8 + 32 + 459.67");
                    }

                }



                if(mType2.isChecked())
                {
                    if(mType5.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToCelsius(inputValue)));
                        mFormulaTextView.setText("C = ( F - 32) / 1.8");
                    }

                    if(mType6.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToFahrenheit(inputValue)));
                        mFormulaTextView.setText("Fahrenheit = Fahrenheit");
                    }

                    if(mType7.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToKelvin(inputValue)));
                        mFormulaTextView.setText("K = ( F + 459.67) / 1.8");
                    }

                    if(mType8.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToRankin(inputValue)));
                        mFormulaTextView.setText("Ra =  F + 459.67");
                    }


                }



                if(mType3.isChecked())
                {
                    if(mType5.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.KelvinToCelsius(inputValue)));
                        mFormulaTextView.setText("C = K - 273.15");
                    }

                    if(mType6.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.KelvinToFahrenheit(inputValue)));
                        mFormulaTextView.setText("F = K × 1.8 - 459.67");
                    }


                    if(mType7.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.KelvinToKelvin(inputValue)));
                        mFormulaTextView.setText("Kelvin = Kelvin");
                    }

                    if(mType8.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.KelvinToRankin(inputValue)));
                        mFormulaTextView.setText("Ra = K × 1.8");
                    }


                }



                if(mType4.isChecked())
                {
                    if(mType5.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.RankinToCelsius(inputValue)));
                        mFormulaTextView.setText("C = ( Ra - 32 - 459.67) / 1.8");
                    }

                    if(mType6.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.RankinToFahrenheit(inputValue)));
                        mFormulaTextView.setText("F =  Ra - 459.67");
                    }


                    if(mType7.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.RankinToKelvin(inputValue)));
                        mFormulaTextView.setText("K =  Ra / 1.8");
                    }

                    if(mType8.isChecked()){
                        mResultTextView.setText(String.valueOf(TemperatureType.RankinToRankin(inputValue)));
                        mFormulaTextView.setText("Rankin = Rankin");
                    }


                }

            }


        });









    }//onCreate100





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature_converter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
