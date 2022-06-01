/*
  Author: Nadir Kheiralla
  Title: Team Stats App
  Description: Basic JavaScript program used for practice.
*/
const team = { 
  _players: [
    {firstName: 'Fred', lastName: 'Jacobs', age: 25}, 
    {firstName: 'Tom', lastName: 'Cat', age: 27}, 
    {firstName: 'Michael', lastName: 'Thompson', age: 40}],
  _games: [
    {opponent: 'Giants', teamPoints: 7, opponentPoints: 21},
    {opponent: 'Mets', teamPoints: 3, opponentPoints: 3},
    {opponent: 'Devils', teamPoints: 0, opponentPoints: 1}],

    //Getter
    get players() {
    return this._players;
  },
    //Getter
    get games() {
    return this._games;
  },
    //Setter
    addPlayer: function(firstName, lastName, age) {
    const newPlayer = {firstName: firstName,
                   lastName: lastName,
                   age: age};
    this._players.push(newPlayer);
  },
    //Setter
    addGame: function(opponentName, teamPoints, opponentPoints) {
    const newGame = {opponent: opponentName,
                    teamPoints: teamPoints,
                    opponentPoints: opponentPoints};
    this._games.push(newGame);
  },
  
};

team.addPlayer('Jon', 'Doe', 33);
team.addPlayer('Jane', 'Dawson', 32);
team.addPlayer('Tom', 'Jerry', 98);

team.addGame('Sixers', 45, 14);
team.addGame('Team Rocket', 0, 15);
team.addGame('Niners', 9, 9);

console.log(team.players);
console.log();
console.log(team.games);
