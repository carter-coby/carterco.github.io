// Loops, Conditional Statements, Functions, Variables,
// Parameters, Arrays, Associative Arrays

function loopFunction()
{
    var i = 0;
    while(i<5)
        {
            console.log(" I is " + i + ".");
            i++;
        }
}

var test1 = 2;
var test2 = 5;

function testFunction(testParam1, testParam2)
{
    var answer = testParam1 * testParam2;
    if (answer <= 10)
        {
            console.log(answer);
        }
    else
        {
            console.log("The answer is greater than 10.");
        }
}

function createArrays()
{
    var boardgames = ['Catan', 'Sorry', 'Aquire', 'Monopoly'];
    console.log("The first element in the Array is: " + boardgames[0]);
    console.log("The second and third elements in the Array are: " + boardgames[1] + " " + boardgames[2]);
    console.log("The entire array is: " + boardgames);
    
    var videogames = new Array();
    videogames['Title'] = 'Halo';
    videogames['Subtitle'] = 'Combat Evolved';
    console.log("Game title: " + videogames.Title);
    console.log("Game Subtitle: " + videogames.Subtitle);
    videogames['Title'] = 'Starcraft';
    videogames['Subtitle'] = 'Wings of Liberty';
    console.log("New game title: " + videogames.Title);
    console.log("New game subtitle: " + videogames.Subtitle);
}