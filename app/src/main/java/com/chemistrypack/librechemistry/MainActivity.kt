package com.chemistrypack.librechemistry
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chemistrypack.librechemistry.ui.theme.LibreChemistryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent()
        {
            LibreChemistryTheme {
                ChemList()
            }
        }
    }
}

@Composable
fun ChemList() {
    LazyColumn{
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