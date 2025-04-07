import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

suspend fun main() = runBlocking{
   try{
       print("введите кол-во функций = ")
       val n = readln()!!.toInt()
       when{
           n <= 0 -> {
               println("Введите число больше 0")
               return@runBlocking
           }
       }
       println("запущенно одновременно функций $n")
       val f1 = RndNum()
       val f2 = Rndkv()
       println(f1)
       println(f2)
       for(i in 1..n){
           launch {
               if(i % 2 == 1){
                   println("функция 1: $f1")
               }
               else {
                   println("функция 2: $f2")
               }
           }.join()
       }
   }catch(e: Exception)
       {
       println("введите данные корректно")
   }
}
suspend fun RndNum(): Int {
    delay((1000L..3000L).random())
    return Random.nextInt(1,21)
}
suspend fun Rndkv(): Int {
    delay((1000L..3000L).random())
    val rnd = Random.nextInt(1,21)
    return rnd * rnd
}