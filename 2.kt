import kotlinx.coroutines.*
suspend fun main(){
    for(i in 0..5){
        delay(800L)
        println(i)
    }
    println("привет, корутины")
}