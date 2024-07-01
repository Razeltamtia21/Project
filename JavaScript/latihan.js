document.getElementById("latihan").innerHTML = "Hello world";

let text = "razel"; text += "tamtia";

console.log(text);
// const phi = 3.14
var r = 5;
let x, y, z;
x = 10;
x = 10;
x++;
y = 5 + 10;
z = (x + y) * r;
document.write("hasil dari 10 + 5 adalah: " + z);

const data = ["razel", "gerald", "fatih"];
data[2] = "athalla";

console.log(data);

const person ={
    firstName: "razel",
    lastName: "tamtia",
    age: 18,
    fullname: function(){
        return this.firstName + " " + this.lastName + " umur "+this.age;
    }
}

console.log(person.fullname());

// function showInput() {
//     var input = document.getElementById("myInput").value;
//     console.log("You typed: " + input);
// }
