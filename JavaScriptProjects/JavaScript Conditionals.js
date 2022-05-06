/*
  Author: Nadir Kheiralla
  Title: JavaScript Conditionals
  Description: Basic JavaScript program used for practice on conditional concepts.
*/
//Variable creation
let raceFirstPosition = 'first place';
let raceSecondPosition = 'second place';
let raceThirdPosition = 'third place';
let greaterOrNot = 5;
//If...else statement run
if (raceFirstPosition === 'first place') {
  console.log('You won first place');
} else {
  console.log('You didn\'t win first place');
}
//if...else ternary operation 
raceSecondPosition === 'second place' ? console.log('You won second place') : console.log('You didn\'t win second place');
//logical operator
if (raceFirstPosition === 'first place' && raceSecondPosition === 'second place') {
  console.log('You won first place and second place');
} else {
  console.log('You didn\'t win either place');
}
if (greaterOrNot > 6 || greaterOrNot > 4) {
  console.log('One of the numbers were not greater');
} else {
  console.log('Both of the numbers were greater');
}
//switch statement
switch (greaterOrNot) {
  case 1:
  console.log('The number is ' + greaterOrNot);
  break;
  case 3:
  console.log('The number is ' + greaterOrNot);
  break;
  case 5:
  console.log('The number is ' + greaterOrNot);
  break;
  default:
  console.log('The variable was not a number');
  break;
}
