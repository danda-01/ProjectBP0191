import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projectbp0191.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //instance
        val btnLogin: Button = findViewById(R.id.buttonLogin)
        val txtUsername: EditText = findViewById(R.id.username)
        val txtPassword: EditText = findViewById(R.id.password)
        val logObj = Login()

        logObj.username = txtUsername.text.toString()
        logObj.password = txtPassword.text.toString()
        //event button login click
        btnLogin.setOnClickListener {
            if (logObj.loginCheck()  == true {
                    val intentLogin = Intent(this, HomeActivity::class.java)
                    startActivity(intentLogin)
                }else{
                Toast.makeText(
                    this, "login gagal",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }

    }
}