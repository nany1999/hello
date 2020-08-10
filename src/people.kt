open class Person(val name: String, var age: Int){

}
class Student( name: String, age:Int, var number:Int, var score:Int):Person(name,age){

}
 fun main(args: Array<String>){
     val s=Student("lili",12,22,100)
     println(s.name)
     println("年龄：${s.age}")
     println("${s.number}")
     println("${s.score}")
     var n=MyClass()
     n.foo()
     n.fo1()
     println(n.name)
     var c=C()
     c.foo()
     var nanmimi=User("nanmimi",4)
     var miaodabao=User("miaodabao",3)
     var jianjun=nanmimi.copy(age=2)
     println(nanmimi)
     println(miaodabao)
     println(jianjun)
     //调用泛型
     var boxInt=Box<Int>(1)
     var boxString=Box<String>("www.huichideminzu.cn")
     println(boxInt.value)
     println(boxString.value)
     //调用枚举类
     var cat:Cat=Cat.XINGLUO
     println(Cat.values())
     println(Cat.valueOf("BUOU"))
     println(cat.name)
     println(cat.ordinal)
     //委托类
     var b=BaseImpl(10)
     Derived(b).print()
 }
//接口集成
interface Myinterface{
   var name:String
    fun foo()
    fun fo1(){
        println("我是一个方法")
    }

}
class MyClass : Myinterface{
    override var name:String="hello124"
    override fun foo(){
        println("123123")
    }
}
//扩展函数
class C(){
    fun foo(){
        println("成员函数")

    }
     fun C.foo(){
         println("扩展函数")
     }
}
//数据类型
data class User(val name:String,val age:Int){

}
//泛型
class Box<T>(t: T){
    var value=t
}
enum class Cat{
    XINGLUO,JIAFEI,LANMAO,ZHERE,BUOU,TIANYUAN
}
//类委托
interface Base1{
    fun print()
}
class BaseImpl(val x:Int):Base1{
    override fun print(){
        println(x)
    }
}
//通过关键字by建立委托
class Derived(b:Base1):Base1 by b

