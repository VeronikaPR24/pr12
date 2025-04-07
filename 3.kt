import kotlinx.coroutines.*
suspend fun main()= coroutineScope{
    launch{
        for(i in 0..5){
            println(i)
            delay(500L)
        }
    }
    Unit
}
//import kotlinx.coroutines.*
//suspend fun main()= coroutineScope<Unit>{
//  launch{
//      for(i in 0..5){
//          println(i)
//           delay(400L)
//       }
//    }
//}