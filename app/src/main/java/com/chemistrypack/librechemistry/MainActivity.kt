package com.chemistrypack.librechemistry
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chemistrypack.librechemistry.ui.theme.LibreChemistryTheme
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent()
        {
            LibreChemistryTheme {
                ChemList() // Call the actual ChemList composable
            }
        }
    }
}

@Composable
fun ChemCard(ChemName: ChemName) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
            {
        Text(text = ChemName.name, modifier = Modifier.padding(16.dp))
                }
}

@Composable
fun ChemList() {
    LazyColumn {
        items(chemParticles) { chemName ->
            ChemCard(ChemName = chemName)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LibreChemistryTheme {
        ChemList() // Call the actual ChemList composable
    }
}