import java.lang.Integer.parseInt
import kotlin.io.print as print

fun main(args: Array<String>) {
    println("hello,kotlin!")
    sum(2, 4)
//    if(args.size<2){
//        println("two intergers expected")
//        return
//    }
//    val x= parseInt(args[0])
//    val y= parseInt(args[1])
//    if(x!=null && y!= null){
//        print(x*y)
//    }
//      getStringLength(12)
    for (i in 1..10 step 2)
        print(i)
    println("\n ------")


    val s = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val b = Array(3, { i -> (i * 2) })
    for (c in s) {
        println(c)
    }
    for (m in b) {
        println(m)
    }



    val text = """sum
     我昨天在uniq买东西付款时，有个中年女人上来就说我就一件给我先结，我小孩衣服打湿了，听起来
     我们确实应该给他优先，但是想想这种人平时比比皆是，总想利用别人的善良占点小便宜，心中一点愧疚没有，
     还拿着孩子说事情，可是小孩子衣服打湿难道不是她的问题么？这里是商场就算湿了也湿不到哪里，况且有是夏天，
     如果衣服出门打湿就要去买一件新的，可想而知这样的母亲在花钱方面是多么没计划性。就占那么一点点时间的小便宜
     自己能快活多少？利用别人的善良给她的占便宜心理买单。这样的人内心真丑陋！
     """
    println(text)
    var x=10
    if(x in 1..8)
    {
        println("在此区间")
    }else{
        println("不在此区间")
    }
    var y=3
   when (y) {
        in 0..10 -> println("x在0-10之间")
        !in 2..20->println("x在2-20之间")
        else -> println("none of the above")
    }
    while (x>0){
        println(x--)
    }
    do{
        println(y--)
    }while(y>0)


}

var age:String? = "22"
val ages =age!!.toInt()
val ages1=age?.toInt()

public fun sum(a: Int, b: Int) {
    println(a + b)
}
public fun getStringLength(obj:Any):Int?{
    if(obj is String && obj.length>0){
        return obj.length
    }
    return null
}