open class Pen(){
    open fun study() {
        println("我是一名学生")
    }
}
//子类重写
class Students : Pen(){
     override fun study() {
         println("我正在学习")
     }
}
fun main(args: Array<String>) {
    val s= Students()
    s.study();
}