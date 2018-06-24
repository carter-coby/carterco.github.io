var requestURL = 'https://byui-cit230.github.io/weather/data/towndata.json';
var request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();
request.onload = function() 
{
  var townstats = request.response;
  populateSection(townstats);
}

function populateSection(jsonObj)
{
    var towns = jsonObj['towns'];
    for (var i = 0; i < towns.length; i++)
        {
            if(towns[i].name == "Placerton")
            {
                continue
            }
            else
            {
                var townName = document.createElement('h1');
                var townMotto = document.createElement('h2');
                var townFounded = document.createElement('h3');
                var townPopulation = document.createElement('h3');
                var townRain = document.createElement('h3');
                var townImg = document.createElement('img')


                townName.textContent = towns[i].name;
                townMotto.textContent = '\"' + towns[i].motto + '\"';
                townFounded.textContent = 'Founded: ' + towns[i].yearFounded;
                townPopulation.textContent = 'Population: ' + towns[i].currentPopulation;
                townRain.textContent = 'Average Rainfall: ' + towns[i].averageRainfall + ' in/yr';
                townImg.src = "images/franklin-small.jpg"
            }
            if(towns[i].name == "Franklin")
            {
                franklinSection.appendChild(townName);
                franklinSection.appendChild(townMotto);
                franklinSection.appendChild(townFounded);
                franklinSection.appendChild(townPopulation);
                franklinSection.appendChild(townRain);
                franklinSection.appendChild(townImg);
            }
            else if(towns[i].name == "Greenville")
            {
                greenvilleSection.appendChild(townName);
                greenvilleSection.appendChild(townMotto);
                greenvilleSection.appendChild(townFounded);
                greenvilleSection.appendChild(townPopulation);
                greenvilleSection.appendChild(townRain);
                greenvilleSection.appendChild(townImg);
            }
            else if(towns[i].name == "Springfield")
            {
                springfieldSection.appendChild(townName);
                springfieldSection.appendChild(townMotto);
                springfieldSection.appendChild(townFounded);
                springfieldSection.appendChild(townPopulation);
                springfieldSection.appendChild(townRain);
                springfieldSection.appendChild(townImg);
            }
        }
}
