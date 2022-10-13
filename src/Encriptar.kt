fun main(){

    var text = ""
    var cifrado=""

    println("Pon la contraseña")
    text= readLine().toString()

    cifrado= control(text)

    println(cifrado)

}
//aa
fun control(text : String):String{
    val abc="abcdefghijklmnñopqrstuvwxyz"
    var cifrado = ""
    val rot = 13

    text.forEach {
        if(it.isLetter()){
            if(abc.indexOf(it)+rot<27){
                cifrado += abc[abc.indexOf(it)+rot]
            }else{
                if (abc.indexOf(it)+rot>=27){
                    cifrado += abc[(abc.indexOf(it)+rot)-(27-abc.indexOf(it))]
                }
            }
        }
    }

    return cifrado

}