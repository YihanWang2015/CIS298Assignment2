package edu.kvcc.cis298.cis298assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

    private TemperatureType[] mFormulaBank = new TemperatureType[20];

//    private TemperatureType1 = new TemperatureType[R.string.typ]



    private static final String TAG = "TemperatureConverter";
    private static final String KEY_INDEX = "index";


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

    private Double inputValue;

   // private String value;

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
        Log.d(TAG, "onCreate(Bundle) called");
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


              //   double inputValue = Double.parseDouble(userInputText.getText().toString());


                inputValue = Double.parseDouble(userInputText.getText().toString());

                Select();

            }


        });









    }//onCreate100

    private void Select() {
        if(mType1.isChecked())
        {
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToCelsius(inputValue)));
                mFormulaTextView.setText("Celsius = Celsius");

               /* value = String.valueOf(TemperatureType.CelsiusToCelsius(inputValue));
                mResultTextView.setText(value);*/

            }

            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToFahrenheit(inputValue)));
                mFormulaTextView.setText(" F =  C × 1.8 + 32");

                /*value = String.valueOf(TemperatureType.CelsiusToFahrenheit(inputValue));
                mResultTextView.setText(value);*/



            }

            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToKelvin(inputValue)));
                mFormulaTextView.setText("K = C  + 273.15");

               /* value = String.valueOf(TemperatureType.CelsiusToKelvin(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType8.isChecked()){
                 mResultTextView.setText(String.valueOf(TemperatureType.CelsiusToRankin(inputValue)));
                 mFormulaTextView.setText("Ra =  C × 1.8 + 32 + 459.67");

                /*value = String.valueOf(TemperatureType.CelsiusToRankin(inputValue));
                mResultTextView.setText(value);*/

            }

        }


        if(mType2.isChecked())
        {
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToCelsius(inputValue)));
                mFormulaTextView.setText("C = ( F - 32) / 1.8");
                /*value = String.valueOf(TemperatureType.FahrenheitToCelsius(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToFahrenheit(inputValue)));
                mFormulaTextView.setText("Fahrenheit = Fahrenheit");
                /*value = String.valueOf(TemperatureType.FahrenheitToFahrenheit(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToKelvin(inputValue)));
                mFormulaTextView.setText("K = ( F + 459.67) / 1.8");
                /*value = String.valueOf(TemperatureType.FahrenheitToKelvin(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.FahrenheitToRankin(inputValue)));
                mFormulaTextView.setText("Ra =  F + 459.67");
               /* value = String.valueOf(TemperatureType.FahrenheitToRankin(inputValue));
                mResultTextView.setText(value);*/
            }


        }


        if(mType3.isChecked())
        {
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.KelvinToCelsius(inputValue)));
                mFormulaTextView.setText("C = K - 273.15");
                /*value = String.valueOf(TemperatureType.KelvinToCelsius(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.KelvinToFahrenheit(inputValue)));
                mFormulaTextView.setText("F = K × 1.8 - 459.67");
                /*value = String.valueOf(TemperatureType.KelvinToFahrenheit(inputValue));
                mResultTextView.setText(value);*/
            }


            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.KelvinToKelvin(inputValue)));
                mFormulaTextView.setText("Kelvin = Kelvin");
                /*value = String.valueOf(TemperatureType.KelvinToKelvin(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.KelvinToRankin(inputValue)));
                mFormulaTextView.setText("Ra = K × 1.8");
                /*value = String.valueOf(TemperatureType.KelvinToRankin(inputValue));
                mResultTextView.setText(value);*/
            }


        }


        if(mType4.isChecked())
        {
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.RankinToCelsius(inputValue)));
                mFormulaTextView.setText("C = ( Ra - 32 - 459.67) / 1.8");
                /*value = String.valueOf(TemperatureType.RankinToCelsius(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.RankinToFahrenheit(inputValue)));
                mFormulaTextView.setText("F =  Ra - 459.67");
                /*value = String.valueOf(TemperatureType.RankinToFahrenheit(inputValue));
                mResultTextView.setText(value);*/
            }


            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.RankinToKelvin(inputValue)));
                mFormulaTextView.setText("K =  Ra / 1.8");
                /*value = String.valueOf(TemperatureType.RankinToKelvin(inputValue));
                mResultTextView.setText(value);*/
            }

            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(TemperatureType.RankinToRankin(inputValue)));
                mFormulaTextView.setText("Rankin = Rankin");
                /*value = String.valueOf(TemperatureType.RankinToRankin(inputValue));
                mResultTextView.setText(value);*/
            }


        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save the values you need from your textview into "outState"-object
        super.onSaveInstanceState(outState);

   /*     outState.putBoolean("Type1RadioButton",mType1.isChecked());
        outState.putBoolean("Type2RadioButton",mType2.isChecked());
        outState.putBoolean("Type3RadioButton",mType3.isChecked());
        outState.putBoolean("Type4RadioButton",mType4.isChecked());
        outState.putBoolean("Type5RadioButton",mType5.isChecked());
        outState.putBoolean("Type6RadioButton",mType6.isChecked());
        outState.putBoolean("Type7RadioButton",mType7.isChecked());
        outState.putBoolean("Type8RadioButton",mType8.isChecked());*/


       // outState.putDouble("INPUTVALUE", inputValue);


     //   outState.putBoolean("sp",sp.isChecked());


       outState.putDouble("savedNumber", inputValue);
    }




    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Read values from the "savedInstanceState"-object and put them in your textview


    //    ( mType1.isChecked()) = savedInstanceState.getBoolean("Type1RadioButton");

        inputValue = savedInstanceState.getDouble("savedNumber");


        Select();
       //34 mResultTextView.setText(value);

       // mFormulaTextView.setText("Celsius = Celsius");



    }



   /* @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");

    }*/


    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() called");
    }


    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }



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
