import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main(){
    GlobalScope.launch {//запускает на фоновом режиме
        delay(1000L)//ожидает в 1 сек. пред выходом инфю
        print(" Саша")
    }
    print("привет")//сразу выводит сообщение
    runBlocking {//блокирует главный поток, чтобы программа не завершилась
        delay(2000L)//задержка на 2 сек
    }
}