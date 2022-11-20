package evgeny.company.november16test

import android.os.Bundle
import android.view.View

class MainActivity3 : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun goToMainScreen(view: View) {
        finish()
    }
}