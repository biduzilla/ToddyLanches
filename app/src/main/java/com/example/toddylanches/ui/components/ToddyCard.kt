package com.example.toddylanches.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.toddylanches.ui.theme.Neutral0
import com.example.toddylanches.ui.theme.Shadow1
import com.example.toddylanches.ui.theme.ToddyLanchesTheme

@Composable
fun ToddyCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(20.dp),
    color: Color = Neutral0,
    contentColor: Color = Shadow1,
    border: BorderStroke? = null,
    elevation: Dp = 4.dp,
    content: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = color,
        contentColor = contentColor,
        shadowElevation = elevation,
        content = content,
        border = border,
    )
}

@Preview
@Composable
private fun ToddyCardPreview() {
    ToddyLanchesTheme() {
        ToddyCard {
            Text(text = "Demo", modifier = Modifier.padding(16.dp))
        }
    }
}