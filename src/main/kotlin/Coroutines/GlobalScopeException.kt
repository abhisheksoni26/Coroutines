package Coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {

    GlobalScope.launch {
        while (true){
            delay(1000)
            println("Still running")
        }
    }
    GlobalScope.launch {
        delay(5000)
//        val intent = Intent(this@MainActivity, SecondActivity::class.java)
//        startActivity(intent)
    }

//What happened is we shifted to the new activity but the above global scope doesn't die,
// and it still runs as long as the app runs and this will lead to app crash somewhere
// because it will be gaining memory on n on...

//Example - https://media.geeksforgeeks.org/wp-content/uploads/20201018111738/ScopeLogOutput.png

}

