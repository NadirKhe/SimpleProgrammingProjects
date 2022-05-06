/*
  Author: Nadir Kheiralla
  Title: Race Day App
  Description: Basic JavaScript program used for practice on control flow
*/
//Variable decleration
let raceNumber = Math.floor(Math.random() * 1000);
let isEarly = false;
let runnerAge = 16;
//Control flow checking if Adult/Youth and registered early
if (runnerAge > 18 && isEarly) {
  raceNumber += 1000;
} 
if (runnerAge > 18 && isEarly) {
  console.log('Race will begin at 9:30am. Your race Number is ' + raceNumber);
} else if (runnerAge > 18 && !isEarly) {
  console.log('Race will begin at 11:00am. Your race Number is ' + raceNumber);
} else if (runnerAge < 19) {
  console.log('Race will begin at 12:30pm. Your race Number is ' + raceNumber);
}
