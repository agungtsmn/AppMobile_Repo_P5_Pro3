package id.ac.polbeng.amandaagungpermata.p5pro3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    val Log = Logger.getLogger(MainActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.info("onCreate")
        btnToSecondActivity.setOnClickListener {
            val mIntent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(mIntent)
        }
    }
    override fun onPause() {
        super.onPause()
        Log.info("onPause")
    }
    override fun onRestart() {
        super.onRestart()
        Log.info("onRestart")
    }
    override fun onResume() {
        super.onResume()
        Log.info("onResume")
    }

}