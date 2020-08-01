const remove_hundred_button_ = document.getElementById("RemoveHundredButton");
const remove_ten_button_ = document.getElementById("RemoveTenButton");
const remove_one_button_ = document.getElementById("RemoveOneButton");
const add_hundred_button_ = document.getElementById("AddHundredButton");
const add_ten_button_ = document.getElementById("AddTenButton");
const add_one_button_ = document.getElementById("AddOneButton");
const question_ = document.getElementById("QuesPrompt");
const counter_ = document.getElementById("CounterText");
const clear_button_ = document.getElementById("Clear");
const submit_button_= document.getElementById("Submit");
const try_again_next_ques_button_ = document.getElementById("TryAgainNextQues");
const answer_feedback_ = document.getElementById("AnswerFeedback");
const counter_name_ = document.getElementById("CounterName");
const counter_text_box_ = document.getElementById("CounterTextBox");



class BlockImages {
  constructor(block_type){
    this.counter = 0;
    this.array =[10];
    for (var i = 0; i < 10; i++){
      this.array[i] = document.getElementById(block_type + (i + 1));
    }
  }
  
  IsFull(){
    return this.counter == 10;
  }
  
  IsEmpty(){
    return this.counter == 0;
  }
  
  HideAll(){
    for(var i = 0; i < 10; i++){
      this.array[i].style.visibility = 'hidden';
    }
    this.counter = 0;
  }
  
  HideImage(){
    if(this.counter < 1) {
      return;
    }
    this.array[this.counter - 1].style.visibility = 'hidden';
    this.counter -= 1;
  }
  
  ShowImage(){
    if(this.counter > 9){
      return;   
    }
    this.array[this.counter].style.visibility = 'visible';
    this.counter += 1;
  }
}

const hundred_blocks_ = new BlockImages("Hundred");
const ten_blocks_ = new BlockImages("Ten");
const one_blocks_ = new BlockImages("One");

function SubtractionGenerator(){
  var num_one = Math.floor(Math.random() * 1111);
  var num_two = Math.floor(Math.random() * 1111);
  question_.innerHTML = "What is " + Math.max(num_one, num_two) + " - " + Math.min(num_one, num_two) + " equal to?";
  return Math.abs(num_one - num_two);
}

function AdditionGenerator(){
  var total = Math.floor(Math.random() * 1111);
  var num_one = Math.floor(Math.random() * (total + 1));
  var num_two = total - num_one;
  question_.innerHTML = "What is " + num_one + " + " + num_two + " equal to?";
  return total;
}

function GenerateExpression(){
  var operator_num = Math.round(Math.random() * 2);
  if(operator_num == 0){
     return SubtractionGenerator();
  }
  return AdditionGenerator();
}

function Clear(){
  hundred_blocks_.HideAll();
  ten_blocks_.HideAll();
  one_blocks_.HideAll();
  counter_.innerHTML = 0;
}

function AddHundredBlock(counter){
  if (counter <= 1010 && !hundred_blocks_.IsFull()){
    hundred_blocks_.ShowImage();
    counter += 100;
    counter_.innerHTML = counter;
  }
  return counter;
}

function AddTenBlock(counter){
  if (counter <= 1100 && !ten_blocks_.IsFull()){
    ten_blocks_.ShowImage();
    counter += 10;
    counter_.innerHTML = counter;
  }
  return counter;
}

function AddOneBlock(counter){
  if (counter <= 1109 && !one_blocks_.IsFull()){
    one_blocks_.ShowImage();
    counter += 1;
    counter_.innerHTML = counter;
  }
  return counter;
}

function RemoveHundredBlock(counter){
  if (counter > 99 && !hundred_blocks_.IsEmpty()){
    hundred_blocks_.HideImage();
    counter -= 100;
    counter_.innerHTML = counter;
  }
  return counter;
}

function RemoveTenBlock(counter){
  if (counter > 9 && !ten_blocks_.IsEmpty()){
    ten_blocks_.HideImage();
    counter -= 10;
    counter_.innerHTML = counter;
  }
  return counter;
}

function RemoveOneBlock(counter){
  if (counter > 0 && !one_blocks_.IsEmpty()){
    one_blocks_.HideImage();
    counter -= 1;
    counter_.innerHTML = counter;
  }
  return counter;
}

function SuccessfulSubmissionDisplay(){
  HideClearSubmitCounter();
  answer_feedback_.innerHTML = "Correct!"
  answer_feedback_.style.visibility = 'visible';
  try_again_next_ques_button_.innerHTML = "Next Question"
  try_again_next_ques_button_.style.visibility = 'visible';
}

function FailedSubmissionDisplay(){
  HideClearSubmitCounter();
  answer_feedback_.innerHTML = "Sorry, not quite."
  answer_feedback_.style.visibility = 'visible';
  try_again_next_ques_button_.innerHTML = "Try Again";
  try_again_next_ques_button_.style.visibility = 'visible';
}

function HideClearSubmitCounter(){
  clear_button_.style.visibility = 'hidden';
  submit_button_.style.visibility = 'hidden';
  counter_.style.visibility = 'hidden';
  counter_name_.style.visibility= 'hidden';
  counter_text_box_.style.visibility = 'hidden';
}

function ShowClearSubmitCounter(){
  clear_button_.style.visibility = 'visible';
  submit_button_.style.visibility = 'visible';
  counter_.style.visibility = 'visible';
  counter_name_.style.visibility = 'visible';
  counter_text_box_.style.visibility = 'visible';
}

function Refresh(){
  ShowClearSubmitCounter();
  answer_feedback_.style.visibility = 'hidden';
  try_again_next_ques_button_.style.visibility = 'hidden';
}

function main() {
  var counter = 0;
  var total = GenerateExpression();
  
  remove_hundred_button_.addEventListener("click", function(){
    counter = RemoveHundredBlock(counter);
  });
  remove_ten_button_.addEventListener("click", function(){
    counter = RemoveTenBlock(counter);
  });
  remove_one_button_.addEventListener("click", function(){
    counter = RemoveOneBlock(counter);
  });
  add_hundred_button_.addEventListener("click", function(){
    counter = AddHundredBlock(counter);
  });
  add_ten_button_.addEventListener("click", function(){
    counter = AddTenBlock(counter);
  });
  add_one_button_.addEventListener("click", function(){
    counter = AddOneBlock(counter);
  });
  clear_button_.addEventListener("click", function(){
    Clear();
    counter = 0;
  });
  submit_button_.addEventListener("click", function(){
    if (counter == total){
      SuccessfulSubmissionDisplay();
    }
    else{
      FailedSubmissionDisplay();
    }
  });
  try_again_next_ques_button_.addEventListener("click", function() {
    if (counter == total){
      counter = 0;
      Clear();
      Refresh();
      total = GenerateExpression();
    }
    else{
      Refresh();
    }
  });
}

Clear();
main();
