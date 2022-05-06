/*
  Author: Nadir Kheiralla
  Title: Kelvin Weather App
  Description: Basic JavaScript program used for practice on converting Kelvin to Celsuis which converts to Fahrenheit
*/
//Temperature of Kelvin
const kelvin = 293;
//Converting from Kelvin to Celsius
var celsius = kelvin - 273;
//Converting from Celsius to Fahrenheit
let fahrenheit = Math.floor(celsius * (9/5) + 32);
console.log(`The temperature is ${fahrenheit} degrees Fahrenheit.`);
