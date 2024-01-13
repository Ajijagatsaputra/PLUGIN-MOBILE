package com.example.plugin.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun ImageComponent(img : Int, modifier: Modifier){
    Image(painter = painterResource(id = img),
        contentDescription = "image", modifier = Modifier)
}