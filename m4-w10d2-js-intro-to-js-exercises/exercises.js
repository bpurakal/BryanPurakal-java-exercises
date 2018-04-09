//1. sumDouble problem
function sumDouble(x, y) {
    let sum = x + y;
    if (x === y) {
        sum *= 2;
    }
    return sum;
}

// 2. hasTeen
function hasTeen(x, y, z) {

    if ((x > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20)) {
        return true;
    }
    else {
        return false;
    }
}

//3. lastDigit

function lastDigit(x, y) {
    if (x % 10 === y % 10) {
        return true;
    }
    else {
        return false;
    }
}

//4. seeColor
function seeColor(strX){
if ((strX.startsWith("red"))) {
    return "red";
} else if ((strX.startsWith("blue"))){
    return "blue";
}else {
    return "";
}
}

//5. middleThree
function middleThree(strX){
    if (strX.length >=3){
        let middle = strX.length/2;
        let middleThree = strX.substring(middle-1, middle+2);
        return middleThree;
    }

}

//6. frontAgain

function frontAgain(strX){
    let strLast = strX.length;
    if ((strX.length>=2) && (strX.substring(0,2) === strX.substring(strLast-2, strLast))){
        return true;
    }
    else {
        return false;
    }
    }


//7. Alarm Clock

function alarmClock(day, isVacation) {
    let dayOfWeek;
    if (day === 0) {
        dayOfWeek = "Sunday";
    }
    else if (day === 1) {
        dayOfWeek = "Monday";
    }
    else if (day === 2) {
        dayOfWeek = "Tuesday";
    }
    else if (day === 3) {
        dayOfWeek = "Wednesday";
    }
    else if (day === 4) {
        dayOfWeek = "Thursday";
    }
    else if (day === 5) {
        dayOfWeek = "Friday";
    }
    else {
        dayOfWeek = "Saturday";
    }
    if (day === 0 || day === 6) {
        if (isVacation) {
            return `${dayOfWeek} off`;
        }
        else {
            return `${dayOfWeek} 10:00`;
        }
    }
    else {
        if (isVacation) {
            return `${dayOfWeek} 10:00`;
        }
        else {
            return `${dayOfWeek} 7:00`;
        }
    }

}

//8. Make Middle
function makeMiddle(nums){
    let newArray = [];
	let half = nums.length/2;
	let midArr1= nums[half-1];
	let midArr2 = nums[half];
	return midArr1+midArr2;

}

//9. oddOnly
function oddOnly(o){
    return o.filter(function(val){return val%2===1})
  }


//10. weave

function weave(){

}

//11. cigar
function cigarParty(cigars, isWeekend) {
    return cigars >= 40 && (cigars <= 60 || isWeekend);
}

//12. Fizzbuzz
function fizzBuzz(x){
    if (x%3===0 && x%5===0){
        return "FizzBuzz"
    }
    else if (x%3===0){
        return "Fizz"
    }
    else if (x%5===0){
        return "Buzz"
    }
    else{
        return x;
    }
}


//13. countValues problem
function countValues(array) {

    let counter = {};
    for (let i = 0; i < array.length; i++) {
        let key = array[i];
        if (counter[key] === undefined) {
            counter[key] = 1;
        }
        else {
            counter[key]++;
        }

    }
    return counter;
}

//14. filterEvens problem
function filterEvens(array) {
    // return array.filter(function(element){
    //     return element %2 === 0;
    // })
    //fat arrow method might be an easier way to write this :
    //arguments, fat arrow, pass in thing that i want function to return
    return array.filter((element) => element % 2 === 0);
}

// {"firstName:": "Testy",
// "lastName": "McTester",
// "age:55"}

//18. Filter inventors
function filterInventors(array){
  const inventors = array.filter((element) => element.first.startsWith("A") || element.first.startsWith("E")|| element.first.startsWith("I") || element.first.startsWith("O") || element.first.startsWith("U")||
  element.last.startsWith("A") || element.last.startsWith("E") || element.last.startsWith("I") || element.last.startsWith("O")|| element.last.startsWith("U"));
console.log (inventors);
return inventors;
}
