package Coroutines

import kotlinx.coroutines.*

suspend fun main() { // If you are expecting results then we can use async other than launch

    val fb = CoroutineScope(Dispatchers.IO).async {

     getFbFollowers()
}

    val insta = CoroutineScope(Dispatchers.IO).async {

     getInstaFollowers()

}

println("FB Followers = ${fb.await()} and Insta Followers = ${insta.await()}")

}

private suspend fun getFbFollowers(): Int {

    delay(1000)
    return 54

}

private suspend fun getInstaFollowers(): Int {

    delay(1000)
    return 113

}
