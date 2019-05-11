// JSON parsing and Stringify

var obj = '{ "Name": "Faker", "Role": "Mid Lane", "Championships": {"Championship_1": 2013, "Championship_2": 2015, "Championship_3": 2016, "Championship_4": 2017},"Team": "SKT"}'

var Faker = JSON.parse(obj);
console.log(Faker);

var FakerJSON = JSON.stringify(Faker);
console.log(FakerJSON);

