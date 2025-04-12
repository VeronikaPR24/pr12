import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
try{
    print("Сколько всего участников: ")
    val n = readln().toInt()
    val user = arrayOfNulls<GitHub>(n)
    for (i in 0 .. n - 1) {
        println("Участник ${i + 1}:")
        print("Введите логин: ")
        val login = readln()
        print("Введите пароль: ")
        val password = readln()
        print("Введите кол-во репозиториев: ")
        val repr = readln().toInt()
        user[i] = GitHub(login, password, repr)
    }
    println("Выберите вариант:\n1 - Блокировка\n2 - Другое ")
    when (readln().toInt()) {
        1 -> {
            launch {
                println("Загрузка участников...")
                delay(2000L)
                SortBubble(user)
            }
        }
        2 -> {
            println("Загрузка завершена")
        }
        else -> {
            println("Нет такого выбора")
        }
    }
    delay(3000L)
}catch(e:Exception){
    println("Неверныйй формат данных")
}
}

suspend fun SortBubble(user: Array<GitHub?>)
{
    for (i in 0..user.size - 1)
    {
        for (j in 0..user.size - i - 2)
        {
            var user1 = user[j]?.repr
            var user2 = user[j + 1]?.repr
            if (user1!! > user2!!)
            {
                var temp = user[j]
                user[j] = user[j + 1]
                user[j+1] = temp
            }
        }
    }
    for (i in 0..user.size - 1)
    {
        println(user[i]?.login)
        println(user[i]?.password)
        println(user[i]?.repr)
    }
}