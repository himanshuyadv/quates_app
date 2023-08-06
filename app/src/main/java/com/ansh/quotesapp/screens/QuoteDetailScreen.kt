package com.ansh.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ansh.quotesapp.models.Quote


@Composable
fun QuoteDetail(quote: Quote) {
    Box(
        contentAlignment = Alignment.Center,

        modifier = Modifier.fillMaxWidth(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color.Black,
                        Color.White
                    )
                )
            )
    ) {
        Card(
            modifier = Modifier.padding(32.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.bodyLarge,
                )
                Spacer(
                    modifier = Modifier.height(16.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
            }

        }
    }
}
