package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import kotlinx.coroutines.*
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding
    private val maxvalue = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.ButtonStart.setOnClickListener {
        GlobalScope.async {
            completeCompetition()
        }
        }
      }

    suspend fun  completeCompetition () = coroutineScope {
        val vitibsk : Deferred<String> = async {
            // Vitibsk
        val vtPotato : ProgressBar = bindingClass.Bar1
        val vtCauli : ProgressBar = bindingClass.Bar1
        val vtBeet : ProgressBar = bindingClass.Bar1
            while (vtPotato.progress != maxvalue &&
                    vtCauli.progress != maxvalue &&
                     vtBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(vtPotato,vtCauli,vtBeet)
                if(vtPotato.progress ==100 &&
                    vtCauli.progress == 100 &&
                    vtBeet.progress==100)
                        break
            }
            victory("Витебск победил")
        }
        val Gomel : Deferred<String> = async {
            // Gomel
            val gomPotato : ProgressBar = bindingClass.Bar3
            val gomCauli : ProgressBar = bindingClass.Bar3
            val gomBeet : ProgressBar = bindingClass.Bar3
            while (gomPotato.progress != maxvalue &&
                gomCauli.progress != maxvalue &&
                gomBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(gomPotato,gomCauli,gomBeet)
                if(gomPotato.progress ==100 &&
                    gomBeet.progress == 100 &&
                    gomBeet.progress==100)
                    break
            }
            victory("Гомель победил")
        }
        val mogilew : Deferred<String> = async {
            // Mogilew
            val mogPotato : ProgressBar = bindingClass.Bar2
            val mogCauli : ProgressBar = bindingClass.Bar2
            val mogBeet : ProgressBar = bindingClass.Bar2
            while (mogPotato.progress != maxvalue &&
                mogCauli.progress != maxvalue &&
                mogBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(mogPotato,mogCauli,mogBeet)
                if(mogPotato.progress ==100 &&
                    mogBeet.progress == 100 &&
                    mogBeet.progress==100)
                    break
            }
            victory("Могилёв победил")
        }
        val Brest : Deferred<String> = async {
            // Brest
            val brPotato : ProgressBar = bindingClass.Bar4
            val brCauli : ProgressBar = bindingClass.Bar4
            val brBeet : ProgressBar = bindingClass.Bar4
            while (brPotato.progress != maxvalue &&
                brCauli.progress != maxvalue &&
                brBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(brPotato,brCauli,brBeet)
                if(brPotato.progress ==100 &&
                    brBeet.progress == 100 &&
                    brBeet.progress==100)
                    break
            }
            victory("Брест победил")
        }
        val Grodno : Deferred<String> = async {
            // Grodno
            val grPotato : ProgressBar = bindingClass.Bar5
            val grCauli : ProgressBar = bindingClass.Bar5
            val grBeet : ProgressBar = bindingClass.Bar5
            while (grPotato.progress != maxvalue &&
                grCauli.progress != maxvalue &&
                grBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(grPotato,grCauli,grBeet)
                if(grPotato.progress ==100 &&
                    grBeet.progress == 100 &&
                    grBeet.progress==100)
                    break
            }
            victory("Гродно победил")
        }
        val Minsk: Deferred<String> = async {
            // minsk
            val msPotato : ProgressBar = bindingClass.Bar6
            val msCauli : ProgressBar = bindingClass.Bar6
            val msBeet : ProgressBar = bindingClass.Bar6
            while (msPotato.progress != maxvalue &&
                msCauli.progress != maxvalue &&
                msBeet.progress!= maxvalue){
                delay(2500)
                AddtoBar(msPotato,msCauli,msBeet)
                if(msPotato.progress ==100 &&
                    msBeet.progress == 100 &&
                    msBeet.progress==100)
                    break
            }
            victory("Минск победил")
        }
    }
    fun victory (region : String) : String{
        return  region
    }
    fun AddtoBar (PotatoBar : ProgressBar,CauliBar : ProgressBar, BeetBar : ProgressBar){
            var addPotato:Int = 0
            var addCauli:Int=0
            var addBeet:Int=0
        addPotato = randomInt()
        addCauli = randomInt()
        addBeet = randomInt()
        PotatoBar.incrementProgressBy(addPotato)
        CauliBar.incrementProgressBy(addCauli)
        BeetBar.incrementProgressBy(addBeet)
            }
    fun  randomInt ( start : Int = 1 , end: Int=10): Int{
        require(start <= end){"Не правильный аргумент"}
        return (start..end).random()
    }
}




