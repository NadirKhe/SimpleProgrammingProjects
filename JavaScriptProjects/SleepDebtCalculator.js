/*
  Author: Nadir Kheiralla
  Title: Sleep Debt Calculator
  Description: Basic JavaScript program used for practice on functions and switches for calculating sleep debt.
*/
//Users sleep hours per day
const getSleepHours = day => {
  switch (day) {
    case 'monday':
    return 6;
    break;
    case 'tuesday':
    return 7;
    break;
    case 'wednesday':
    return 6;
    break;
    case 'thursday':
    return 8;
    break;
    case 'friday':
    return 7;
    break;
    case 'saturday':
    return 8;
    break;
    default:
    return 7;
    break;
  }
};
//Function that adds all the sleep hours
const getActualSleepHours = () => getSleepHours('Monday') + getSleepHours('tuesday') + 
      getSleepHours('wednesday') + getSleepHours('thursday') + getSleepHours('friday') + 
      getSleepHours('saturday') + getSleepHours('sunday');
//My idea of perfect hours of sleep if I actually stayed asleep
const getIdealSleepHours = () => {
  const idealHours = 8;
  return idealHours * 7;
};
//Calculates sleep debt using past 2 functions
const calculateSleepDebt = () => {
  const actualSleepHours = getActualSleepHours();
  const idealSleepHours = getIdealSleepHours();
  if (actualSleepHours === idealSleepHours) {
    return 'User got the perfect amount of sleep.';
  } else if (actualSleepHours > idealSleepHours) {
    return 'User got more sleep than needed.';
  } else if (actualSleepHours < idealSleepHours) {
    return `User got less sleep and should get some rest.`;
  }
}

console.log(calculateSleepDebt());
