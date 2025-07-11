# Excercise-1---Advanced-OOP---Univeristy-of-Turku

## 1. Overview 
This project is addresses the Excercise 1 of the "Modularity" part of the Advanced Object-Oriented Programming course.

## 2. Author
Name: Alyah
Student ID: 2406530

## 3. Files
'EmptyArray.java': Custom exception for emprty/null arrays.
'NegativeNumberException': Custom exception for arrays containing negaitve numbers.
'Main.java' Main method. Contains the 'avg' routine and the method for the ordinal suffixes, 'ordinal'.

## 4. How to compile and run
1. Save all three files;
2. Use a terminal or command prompt and navigate to the directory the files where saved at;
3. Compile by using a java compiler.

## 5. Answer to proposed question
"What is the value of the variable result at the end of the program when the variable nums refers to the array [1, 2] accepted by the routine avg? What about when the array is empty? Why?"

When the variable nums refers to the array [1, 2], the result in the end of the program would be 1.5, as the avg routine would sum the numbers (1 + 2) then divide by the total amount of numbers (2). As there are no negative numbers and the array is not null nor empty, no exceptions are thrown.

As for when the array is empty, the result would be the excpetion 'EmptyArray', as nums.length == 0 would be true. 

## 6. Output examples
