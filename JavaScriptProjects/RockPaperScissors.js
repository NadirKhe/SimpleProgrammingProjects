/*
  Author: Nadir Kheiralla
  Title: Rock Paper Scissors
  Description: Basic JavaScript program used for practice on functions.
*/
//Reading user input and converting to lowercase
const getUserChoice = userInput => {
  userInput = userInput.toLowerCase();
  if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
    return userInput;
  } else {
    console.log('Error! You have not selected rock, paper, or scissors.')
  }
}
//Randomizes the choice of the computer
function getComputerChoice() {
  const randNum = Math.floor(Math.random() * 3);
  switch (randNum) {
    case 0:
    return 'rock';
    break;
    case 1:
    return 'paper';
    break;
    default:
    return 'scissors';
    break;
  }
}
//Function for determining the winner
function determineWinner(userChoice, computerChoice) {
  if (userChoice === computerChoice) {
    return 'The game was a tie.';
  }
  if (userChoice === 'rock') {
    if (computerChoice === 'paper') {
      return 'Rock vs Paper. Computer Wins.';
    }
    else {
      return 'Rock vs Scissors. You Win.';
    }
  }
  if (userChoice === 'paper') {
    if (computerChoice === 'scissors') {
      return 'Paper vs Scissors. Computer Wins.';
    }
    else {
      return 'Paper vs Rock. You Win.';
    }
  }
  if (userChoice === 'scissors') {
    if (computerChoice === 'rock') {
      return 'Scissors vs Rock. Computer Wins.';
    }
    else {
      return 'Scissors vs Paper. You Win.';
    }
  }
}
//Function for running the game
const playGame = () => {
  const userChoice = getUserChoice('scissors');
  const computerChoice = getComputerChoice();
  console.log('You threw: ' + userChoice);
  console.log('The computer threw: ' + computerChoice);
  console.log(determineWinner(userChoice, computerChoice));
};

playGame();
