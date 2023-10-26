function show(x)
{
    document.getElementById("res").value+=x;
}
function AC()
{
    document.getElementById("res").value="";
}
function calculate()
{
    var a;
    a=eval(document.getElementById("res").value);
    document.getElementById("res").value=a;
}
function backspace()  
{  
var exp =  document.getElementById("res").value
document.getElementById("res").value = exp.substring(0, exp.length - 1); /* remove the element from total length ? 1 */  
}
function kk()
{
    document.getElementById("k1").innerHTML="WELCOME TO MY WORLD";
}
function kl()
{
    document.getElementById("k1").innerHTML="This is shamshudhin";
}