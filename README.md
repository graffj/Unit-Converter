# UnitConverter
Android unit conversion learner project

This project offers several screens of unit conversions (Length, Mass, Temperature, Volume) via swipeable screen navigation.

The main idea of the project was for me to learn more about Android development. The learning process and basic functionality were 
(clearly) much more important than asthetics. 

Continued improvement will include adding listeners on EditText elements to make the app more responsive to input. Also, check and limit
user input to real-world values; no negative values for length, mass and volume - and limit temperatures to their minimums (absolute 0 K,
etc.).

Standardization of conversion method names allowed me to use Reflection to call methods. This meant I could skip writing big dispatch
methods to call the right conversion method based on to-unit and from-unit values.

Please feel free to email questions, comments or ideas for improvement to graffj99@yahoo.com

