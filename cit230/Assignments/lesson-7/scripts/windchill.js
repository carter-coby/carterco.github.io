window.onload = function calcWindchill(){
    var windchill = 0
    var windspeed = 5
    var temp = 70
    windchill = 35.74 + (0.6215*temp) - (35.75 * (Math.pow(windspeed, .16))) + (.4275 * temp * (Math.pow(windspeed, .16)))
    windchill = +windchill.toFixed(2);
    document.getElementById("WindChill").innerHTML = "Current Wind Chill: " + windchill + "&deg"
}
