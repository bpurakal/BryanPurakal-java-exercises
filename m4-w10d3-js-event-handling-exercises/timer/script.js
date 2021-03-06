/* 1. Clicking on each li, properly adds time to the timer */
/**
 * Increase the time on the timer by the number of seconds to increase by
 * @param {*} increaseBy the number of seconds to increase the time by
 */
function increaseTime(increaseBy) {

    // Find the countdown
    let countdown = document.getElementById("countdown");//reps dom in html with id countdown
    //let countdown = document.querySelector(".countdown"); //css selectors with querySelector
    //let countdown = documents.querySelector("#countdown");


    // Get its current time
    let currentTime = countdown.dataset.time; //every element has dataset set in html

    let intTime = parseInt(currentTime); //turns into actual int 

    // Add the time in seconds to the countdown
    countdown.dataset.time = intTime + increaseBy;

    updateTime();
}

/**
 * Take the number of seconds remaining in remainingTime
 * and show it as hours:minutes:seconds.
 */
function updateTime() {
    // Split to hr, min, sec
    let countdown = document.getElementById("countdown");
    let currentTime = countdown.dataset.time;
    let intTime = parseInt(currentTime);

    let hour = 0;
    let min = 0;
    let sec = 0;

    hour = Math.floor(intTime / 3600);
    intTime = intTime % 3600;

    min = Math.floor(intTime / 60);
    intTime = intTime % 60;

    sec = intTime;

    if(hour <10){
        hour = '0' + hour;
    }
    if(min <10){
        min = '0' + min;
    }
    if(sec <10){
        sec = '0' + sec;
    }

    countdown.innerText=`${hour}:${min}:${sec}`;
}

/* 2. Clicking start, begins the timer */
let timer;
function start() {
    setInterval
}