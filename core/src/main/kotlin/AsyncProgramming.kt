import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.suspendCoroutine

class AsyncProgramming {
    private suspend fun makeRequest()  {
        delay(1000L)
        println("Fun completed")
    }

  suspend  fun process()  = coroutineScope {
      launch {
          delay(2000L)
          println("Done for 2mills")
      }
      launch {
          delay(1000L)
          println("Done for 1mills")
      }
      val job = launch {
          delay(3000L)
          println("Suspended completed")
      }
      job.join()
      println("the process continue...")

  }

    fun add() = runBlocking {

            process()

        println("Done for all")
    }
}