class Site constructor(name:String) {
    var url: String = "http://huichideminzu.cn"
    var country: String = "CN"
    var sitname = name

    init {
        println("初始化网站名：${name}")
    }

    fun printtest() {
        println("我是一个类函数")
    }
}
    fun main(args: Array<String>) {
        val site= Site("www.huichideminzu.cn")
        println (site.sitname)
        println (site.country)
        println (site.url)
       site.printtest()
    }
