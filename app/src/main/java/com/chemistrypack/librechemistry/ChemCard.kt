package com.chemistrypack.librechemistry

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ChemCard(ChemName: ChemName) {
    Card(modifier = Modifier
        .padding(8.dp)
        .height(100.dp)
        .fillMaxWidth()

    )
    {
        Text(text = ChemName.name
        )

    }
}




