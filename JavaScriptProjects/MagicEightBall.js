/*
  Author: Nadir Kheiralla
  Title: Magic Eight Ball App
  Description: Basic JavaScript program used for practice on control flow
*/
//Variable declaration
let userName = 'Nadir';
let userQuestion = 'Will I become a good developer?';
let randomNumber = Math.floor(Math.random() * 8);
let eightBall = '';
//Respond based on input and repeat question
userName ? console.log('Hello, ' + userName) : console.log('Hello');
console.log('You asked: ' + userQuestion);

switch (randomNumber) {
  case 0:
  eightBall = 'It is certain';
  break;
  case 1:
  eightBall = 'It is decidedly so';
  break;
  case 2:
  eightBall = 'Reply hazy try again';
  break;
  case 3:
  eightBall = 'Cannot predict now';
  break;
  case 4:
  eightBall = 'Do not count on it';
  break;
  case 5:
  eightBall = 'My sources say no';
  break;
  case 6:
  eightBall = 'Outlook not so good';
  break;
  default:
  eightBall = 'Signs point to yes';
  break;
}
console.log(eightBall);
