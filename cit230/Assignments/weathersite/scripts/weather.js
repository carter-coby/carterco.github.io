var requestURL = "https://api.openweathermap.org/data/2.5/forecast?id=4156210&APPID=a7a4d20a309cee9fb998c023cc29b02a&units=imperial";
var request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();
request.onload = function() 
{
  var weatherstats = request.response;
  populateSection(weatherstats);
}

function populateSection(jsonObj)
{
    var weather = jsonObj['weather'];
    var temp = jsonObj['main'];
    var wind = jsonObj['wind']
    var currentTemp = document.createElement('h3');
    var highTemp = document.createElement('h3');
    var lowTemp = document.createElement('h3');
    var weather = document.createElement('h3');
    var windSpeed = document.createElement('h3');
    var icon = document.createElement('img');
    
    currentTemp.textContent = temp.temp;
    highTemp.textContent = temp.temp_max;
    lowTemp.textContent = temp.temp_min;
    weather.textContent = weather.description;
    windSpeed.textContent = wind.speed;
    icon.src = weather.icon;
    
    franklinSection.appendChild(currentTemp);
    franklinSection.appendChild(highTemp);
    franklinSection.appendChild(lowTemp);
    franklinSection.appendChild(weather);
    franklinSection.appendChild(windSpeed);
    franklinSection.appendChild(icon);
}


