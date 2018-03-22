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

    if ((x > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20)){
        return true;
    }
    else{
    return false;
    }
}

//3. lastDigit 

function lastDigit(x,y){
    if (x%10 === y%10){
        return true;
    }
    else{
        return false;
    }
}

//4. seeColor


//7. Alarm Clock

function alarmClock(day, isVacation){
    let dayOfWeek;
    if (day===0){
        dayOfWeek = "Sunday";
    }
    else if (day===1){
        dayOfWeek = "Monday";
    }
    else if (day===2){
        dayOfWeek = "Tuesday";
    }
    else if (day===3){
        dayOfWeek = "Wednesday";
    }
    else if (day===4){
        dayOfWeek = "Thursday";
    }
    else if (day===5){
        dayOfWeek = "Friday";
    }
    else {
        dayOfWeek = "Saturday";
    }
    if (day === 0 || day === 6){
        if (isVacation){
            return `${dayOfWeek} off`;
        }
        else{
            return `${dayOfWeek} 10:00`;
        }
    }
    else{
        if (isVacation){
            return `${dayOfWeek} 10:00`;
        }
        else{
            return `${dayOfWeek} 7:00`;
        }
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