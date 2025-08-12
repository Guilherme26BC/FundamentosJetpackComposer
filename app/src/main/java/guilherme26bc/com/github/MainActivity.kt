package guilherme26bc.com.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import guilherme26bc.com.github.ui.theme.FundamentosJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FundamentosJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicial(Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun Inicial(modifier: Modifier = Modifier) {
        TextoCustomizado("Primeira função composable", modifier)
        TextoCustomizado("Seja bem vindo", modifier)
        TextoCustomizado("Olá usuário", modifier)
    }
    @Composable
    fun TextoCustomizado(texto: String, modifier: Modifier = Modifier) {
        Text(
            text = texto,
            color = Color.Red,
            modifier = modifier
        )
    }

    @Preview
    @Composable
    fun PreviewFuncaoInicial() {
        FundamentosJetpackComposeTheme {
            Inicial()
        }
    }
}
