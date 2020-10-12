function calc() {

    const price = document.getElementById("productPrice").innerHTML;

    const numberUser = document.getElementById("userInput").value;

    const total = price * numberUser;




    if (!isNaN(total))
        document.getElementById("result").innerHTML = total;
}


