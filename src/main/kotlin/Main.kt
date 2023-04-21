fun main() {
var arr = (arrayOf(51,65,92,8,71,11,24,))
    val arrangeArr = arrangeNum(arr)
    println(arrangeArr)

    list()
    var x =( names("book","pen","Ink"))
    println(x)
    println( names("book","pen","Ink"))

}

//Given an array of integers, rearrange the array such that all even
//numbers come before all odd numbers.
 fun arrangeNum(numb:Array<Int>):IntArray{
    val (even,odd) = arr.partition {num % 2 ==0}
    return even + odd
    }

fun list(){
    var friends= arrayOf("vicy","flo","henry","lilian")
    println(friends.contentToString())
}
fun names (name:String,name2:String,name3:String) :String{
    var myArray = arrayOf(name,name2,name3)
    return myArray.contentToString()
}


