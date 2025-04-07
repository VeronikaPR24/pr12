import kotlinx.coroutines.*
suspend fun main() = coroutineScope{
    launch{
        for(i in 0..5){
            delay(500L)
            println(i)
        }
    }
    println("привет, корутины")
}