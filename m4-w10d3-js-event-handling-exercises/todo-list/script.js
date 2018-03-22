

/* 2. When I click an x next to the label, the item is deleted. */
function deleteTask(task) {
    // Find the Parent
    let taskDiv = task.parentElement;
    // Remove it from the DOM
    taskDiv.remove();
}

/* 3. When I enter an item in the textbox it is added as an item */
function addTask(event) {

    // Block form submission
    event.preventDefault();

    // Get the new value typed in    
    let inputField = document.querySelector('input[name=newTaskValue]');
    let newTask = inputField.value;

    //Clear the value from the textbox
    inputField.value = ``;

    //Create a <div class="task">
    let newTaskDiv = document.querySelector(`div#taskTemplate`).cloneNode(true);
    newTaskDiv.querySelector(`label`).innerText = newTask;
    newTaskDiv.id = ``;
    newTaskDiv.style.display = ``;


    // Add to the task list
    let taskList = document.getElementById("task-list");
    taskList.appendChild(newTaskDiv);
}
document.getElementById("new-task").addEventListener("submit", addTask);

/* 4. When I click toggle all, all tasks are either completed or reset */
function toggleAll() {

    // Get the value of the toggle Checkbox

    // Get all tasks

    // Loop through each and set checked value
}

/* 5. When I click a label, it turns into a textbox */
function labelClick(label) {

    // Find the adjacent texbox

    // Set its value from the label

    // Toggle Visibility
}

function checkForEnter(textbox) {

    // Find the adjacent label

    // 6. Providing an empty value removes the item

    // Set its value from the textbox

    // Toggle Visibility
}

/* 7. When there are completed tasks, the clear completed item is visible */
function clearCompleted() {

    // Get all completed items

    // Get the #task-list

    // Remove each completed item from the #task-list
}

function completeTask() {
    // Get the number of completed items

    // Get the clear completed button

    // If the number is > 0, show the clearCompleted button
}