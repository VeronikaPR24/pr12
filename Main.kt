import kotlinx.coroutines.*
suspend fun main()= coroutineScope{
    launch{ doCorut() }
    println("привет, корутины")
}
suspend fun doCorut(){
    for(i in 0..5){
        println(i)
        delay(500L)
    }
}
