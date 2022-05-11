/*
  Author: Nadir Kheiralla
  Title: JavaScript Arrays
  Description: Basic JavaScript program used for practice on Arrays.
*/
let secretMessage = ['Learning', 'is', 'not', 'about', 'what', 'you', 'get', 'easily', 'the', 'first', 'time,', 'it', 'is', 'about', 'what', 'you', 'can', 'figure', 'out.', '-2015,', 'Chris', 'Pine,', 'Learn', 'JavaScript'];
//Remove last string of the array
secretMessage.pop();
//Add data to the end of the array
secretMessage.push('to', 'Program');
//Changing data within to a new value
secretMessage[secretMessage.indexOf('easily')] = 'right';
//Removes first element of array
secretMessage.shift();
//Adds data to the beginning of the array
secretMessage.unshift('Programming');
//Removes specific data and replaces with another value 
secretMessage.splice(6, 5, 'know');
//Using .join to print the message
console.log(secretMessage.join(' '));
