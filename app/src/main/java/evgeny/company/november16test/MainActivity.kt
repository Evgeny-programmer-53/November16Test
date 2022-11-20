package evgeny.company.november16test

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }
    fun changeToNextActivity(view: View){
        val intentToChangeToNextActivity = Intent(this,MainActivity2::class.java)
        startActivity(intentToChangeToNextActivity)
    }
    fun changeToSecondActivity(view: View) {
        val intentToChangeToNextActivity = Intent(this,MainActivity3::class.java)
        startActivity(intentToChangeToNextActivity)
    }
}








