/*
Name:Yihan Wang

Assignment: CIS_298_Assignment_2

Description:

The temperature converter application allows users to freely convert
 from one temperature type to another by inputting a original decimal
 number and selecting one temperature type from the "From" radio group
 and selecting another temperature type from the "To" radio group.
  At last, by clicking the "CONVERT" button, users can get their
  result along with the used formula in the textView area.

* */





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


    //Set variables for radioGroup, radioButton, button, textView, EditText
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

    private TextView mResultTextView;   //mResultTextView shows the result after the conversion.
    private TextView mFormulaTextView;  //mFormulaTextView shows the formula used during the conversion.

    private EditText userInputText;     //userInputText is the number that user inputs in order to convert.
    private Double inputValue;          //inputValue is the double value after converting userInputText.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);

        mResultTextView =(TextView)findViewById(R.id.result_text);
        mFormulaTextView=(TextView)findViewById(R.id.formula_text);

        userInputText = (EditText) findViewById(R.id.editText);

        mFromRadioGroup = (RadioGroup) findViewById(R.id.from_group);
        mToRadioGroup = (RadioGroup) findViewById(R.id.to_group);

        //mType1 to mType8 are all the radioButtons.
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


                //if else statement is to make sure user inputs a number in the editText area.
                //.length() is used to test whether or not user input anything.
                if (userInputText.getText().length() == 0) {

                    //if there is no input, toast message would be shown.
                    Toast.makeText(TemperatureConverter.this,
                            R.string.reminder_toast,
                            Toast.LENGTH_SHORT).show();

                }else{

                    //inputValue is the double value after parse string from userInputText.
                inputValue = Double.parseDouble(userInputText.getText().toString());

                    //Select method is used to select radioButtons
                 Select();
                }

            }

        });


    }//onCreate100

    private void Select() {

        //************************select Celsius radio Button in From radio group.*****************************
        if(mType1.isChecked())
        {
            //select Celsius radio button in To radio group
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'C = "+ String.format("%.2f", TemperatureType.CelsiusToCelsius(inputValue))+"'C");
                mFormulaTextView.setText("Celsius = Celsius");
            }else

                //select fahrenheit radio button in To radio group
            if(mType6.isChecked()) {
                mResultTextView.setText(String.valueOf(inputValue)+"'C = "+String.format("%.2f", TemperatureType.CelsiusToFahrenheit(inputValue))+"'F");
                mFormulaTextView.setText(" F =  C × 1.8 + 32");
            }else

            //select Kelvin radio button in To radio group
            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'C = "+String.format("%.2f", TemperatureType.CelsiusToKelvin(inputValue))+"'K");
                mFormulaTextView.setText("K = C  + 273.15");
            }else
                //select Rankin radio button in To radio group
            if(mType8.isChecked()){
                 mResultTextView.setText(String.valueOf(inputValue)+"'C = "+String.format("%.2f", TemperatureType.CelsiusToRankin(inputValue))+"'Ra");
                 mFormulaTextView.setText("Ra =  C × 1.8 + 32 + 459.67");
            }else{
                //toast message would be shown if user doesn't select a radio button in To radio group.
                Toast.makeText(TemperatureConverter.this,
                        R.string.select_to_toast,
                        Toast.LENGTH_SHORT).show();
            }
        } else

        //************************select fahrenheit radio Button in From radio group.*****************************
        if(mType2.isChecked())
        {
            //select Celsius radio button in To radio group
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'F = "+String.format("%.2f", TemperatureType.FahrenheitToCelsius(inputValue))+"'C");
                mFormulaTextView.setText("C = ( F - 32) / 1.8");
            }else

                //select fahrenheit radio button in To radio group
            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'F = "+String.format("%.2f", TemperatureType.FahrenheitToFahrenheit(inputValue))+"'F");
                mFormulaTextView.setText("Fahrenheit = Fahrenheit");
            }else

                //select Kelvin radio button in To radio group
            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'F = "+String.format("%.2f", TemperatureType.FahrenheitToKelvin(inputValue))+"'K");
                mFormulaTextView.setText("K = ( F + 459.67) / 1.8");
            }else

                //select Rankin radio button in To radio group
            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'F = "+String.format("%.2f", TemperatureType.FahrenheitToRankin(inputValue))+"'Ra");
                mFormulaTextView.setText("Ra =  F + 459.67");
            }else{
                //toast message would be shown if user doesn't select a radio button in To radio group.
                Toast.makeText(TemperatureConverter.this,
                        R.string.select_to_toast,
                        Toast.LENGTH_SHORT).show();
            }



        }else

            //************************select Kelvin radio Button in From radio group.*****************************
        if(mType3.isChecked())
        {
            //select Celsius radio button in To radio group
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'K = "+String.format("%.2f", TemperatureType.KelvinToCelsius(inputValue))+"'C");
                mFormulaTextView.setText("C = K - 273.15");
            }else

                //select fahrenheit radio button in To radio group
            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'K = "+String.format("%.2f", TemperatureType.KelvinToFahrenheit(inputValue))+"'F");
                mFormulaTextView.setText("F = K × 1.8 - 459.67");
            }else

                //select Kelvin radio button in To radio group
            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'K = "+String.format("%.2f", TemperatureType.KelvinToKelvin(inputValue))+"'K");
                mFormulaTextView.setText("Kelvin = Kelvin");
            }else

                //select Rankin radio button in To radio group
            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue) + "'K = "+String.format("%.2f", TemperatureType.KelvinToRankin(inputValue))+"'Ra");
                mFormulaTextView.setText("Ra = K × 1.8");
            }else{
                //toast message would be shown if user doesn't select a radio button in To radio group.
                Toast.makeText(TemperatureConverter.this,
                        R.string.select_to_toast,
                        Toast.LENGTH_SHORT).show();
            }

        } else

            //************************select Rankin radio Button in From radio group.*****************************
        if(mType4.isChecked())
        {
            //select Celsius radio button in To radio group
            if(mType5.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'Ra = "+String.format("%.2f", TemperatureType.RankinToCelsius(inputValue))+"'C");
                mFormulaTextView.setText("C = ( Ra - 32 - 459.67) / 1.8");
            }else

                //select fahrenheit radio button in To radio group
            if(mType6.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'Ra = "+String.format("%.2f", TemperatureType.RankinToFahrenheit(inputValue))+"'F");
                mFormulaTextView.setText("F =  Ra - 459.67");
            }else

                //select Kelvin radio button in To radio group
            if(mType7.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'Ra = "+String.format("%.2f", TemperatureType.RankinToKelvin(inputValue))+"'K");
                mFormulaTextView.setText("K =  Ra / 1.8");
            }else

                //select Rankin radio button in To radio group
            if(mType8.isChecked()){
                mResultTextView.setText(String.valueOf(inputValue)+"'Ra = "+String.format("%.2f", TemperatureType.RankinToRankin(inputValue))+"'Ra");
                mFormulaTextView.setText("Rankin = Rankin");

            }else{
                //toast message would be shown if user doesn't select a radio button in To radio group.
                Toast.makeText(TemperatureConverter.this,
                        R.string.select_to_toast,
                        Toast.LENGTH_SHORT).show();
            }

            //toast message would be shown if user doesn't select a radio button in FROM radio group.
        }else{
            Toast.makeText(TemperatureConverter.this,
                    R.string.select_from_toast,
                    Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //save inputValue in the original textview in the outstate object
       outState.putDouble("savedNumber", inputValue);

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //read inputValue from the savedInstanceState object and put it in the textview
        inputValue = savedInstanceState.getDouble("savedNumber");

        //Select() method is used to restore the data.
        Select();

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
