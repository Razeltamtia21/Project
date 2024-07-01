function calculate() {
    var num1 = perseFloat(document.getElementById("num1").value);
    var num2 = perseFloat(document.getElementById("num2").value);
    var operator = document.getElementById("operation").value;
    var result = 0;

    if(operation === 1){
        result = num1 + num2;
    }else if(operation === 2){
        result = num1 - num2;
    }else if(operation === 3){
        result = num1 * num2;
    }else if(operation === 4){
        result = num1 / num2;
    }else{
        result = "[error] Invalid operation";
    }
    document.getElementById("result").innerText = "Result: " + result;
}