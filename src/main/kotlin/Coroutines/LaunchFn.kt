package Coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() { // We can do this for the results but the best way to do this is with async not with launch

    var getFb = 0
    var getInsta = 0
    val job1 = CoroutineScope(Dispatchers.IO).launch {

        getFb = getFbFollowers()

    }

    val job2 = CoroutineScope(Dispatchers.IO).launch {

        getInsta = getInstaFollowers()

    }

    job1.join()
    job2.join()

    println("FB Followers = $getFb and Insta Followers = $getInsta")

}

private suspend fun getFbFollowers(): Int {

    delay(1000)
    return 54

}

private suspend fun getInstaFollowers(): Int {

    delay(1000)
    return 113

}
