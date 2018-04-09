let currentScore = 0;

// 1. When the peek button is clicked a mole appears in a random dirt mmound
function peek() {

    // Get all of the dirt mounds
    const dirtMounds = document.querySelectorAll(".hole")
    //2. Hid all current moles
    const upMoles = document.querySelector(".up");
    upMoles.remove(".up");
    // Pick one at random
    const randomNum = Math.floor(Math.random() * 5) +1;
    const randomMound = dirtMounds[randomNum];
    // Add the .up class to it
    randomMound.className += "up";
}


//3. When a mole is bonked, increment the score
function bonk(increaseScore) {

    // Get the score
    document.getElementById("currentScore").innerText = `${totalScore}`;
    // Increment the score
    totalScore += increaseScore;
    updateScore();
    // Make the mole disappear
    document.getElementById('hole').classList.add('up');
}

function updateScore(totalScore){

}

//4. When the start button is pressed, start making moles appear at random
function start() {
  currentScore = 0;
}
