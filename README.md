# Assignment 2 - Temperature Converter

## Author

Yihan Wang

## Description


The temperature converter application allows users to freely convert from one temperature type to another by inputting a original decimal number and selecting one temperature type from the "From" radio group and selecting another temperature type from the "To" radio group. At last, by clicking the "CONVERT" button, users can get their result along with the used formula in the textView area.


Solution Requirements:

* Seperate class for calculation: TemperatureType.java

* Handle errors gracefully: Toasts are used for handling input errors from user.

* Seperate Layout for landscape: res->layout->activity_temperature_converter.xml(land)

* Retain information across rotation by using onSaveInstanceState and onRestoreInstanceState


### Notes

 <img src="images/CIS298Assignment2_Yihan_1.png" alt="ExampleImage_1">
 <img src="images/CIS298Assignment2_Yihan_2.png" alt="ExampleImage_2">

## Outside Resources Used

	Formula from http://www.csgnetwork.com/temp2conv.html

## Known Problems, Issues, And/Or Errors in the Program

	Typing numbers in the number pad doesn't work when testing the app while the numbers on the main keyboard work just fine.

