package arredondo.diego.frgamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFrag1.setOnClickListener { cambiarFragment(0) }
        btnFrag2.setOnClickListener { cambiarFragment(1) }
        btnFrag3.setOnClickListener { cambiarFragment(2) }
    }

    fun cambiarFragment(sel: Int){
        var transaction = supportFragmentManager.beginTransaction()
        var fragment = Fragment()

        when(sel) {
            0 -> fragment = inicioFragment()
            1 -> fragment = historiasFragment()
            2 -> fragment = perfilFragment()
        }

        transaction.replace(R.id.contenedorFrgamentos, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
