package evgeny.company.november16test

import android.os.Bundle
import android.view.View

class MainActivity2 : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    fun goToMainScreen(view: View) {
        finish()
    }
}


