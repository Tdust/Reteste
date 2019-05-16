package br.edu.iff.teste

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.edu.iff.teste.R.id.testeETNome
import br.edu.iff.teste.R.id.testeETReverso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button :Button = findViewById(R.id.bTeste)
        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View) {
                // Handler code here.
                /*val intent = Intent(context, DestActivity::class.java);
                startActivity(intent);*/
                val etReverso :EditText? = findViewById(R.id.testeETReverso)
                etReverso?.setText(testeETNome.text.toString().reversed())
                Toast.makeText(getApplicationContext(), palindromo(testeETNome.text.toString(), testeETReverso.text.toString()), Toast.LENGTH_SHORT).show()
            }
        })

    }
    fun palindromo(a: String, b: String):String
    {
        var s = if (a == b)"é palindromo"
        else "não é palindromo"
        return s
    }
}