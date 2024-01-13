package com.example.plugin.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plugin.R
import com.example.plugin.component.ImageComponent
import com.example.plugin.component.TextComponent

@Composable
fun Home(){
    Surface (modifier = Modifier.fillMaxSize()){
        Column {
            ImageComponent(img = com.example.plugin.R.drawable.thumbnail, modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(10.dp)) )
            Spacer(modifier = Modifier.height(15.dp))
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)){
                TextComponent(text = stringResource(id = R.string.title), 
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp )
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    ImageComponent(img = R.drawable.plugin,
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp))
                    
                    Spacer(modifier = Modifier.width(10.dp))
                    TextComponent(text = stringResource(id = R.string.foundation),
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp )
                    Spacer(modifier = Modifier.height(10.dp))
                }
                Spacer(modifier = Modifier.height(10.dp))

                TextComponent(text = stringResource(id = R.string.description),
                    color = Color.Black,
                    fontWeight = FontWeight.W400,
                    fontSize = 15.sp)
                Spacer(modifier = Modifier.height(10.dp))

                Row (){
                    Column (modifier = Modifier.weight(1f)){
                        TextComponent(text = stringResource(id = R.string.donated),
                            color = Color.Black,
                            fontWeight = FontWeight.W400,
                            fontSize = 18.sp )
                        Row (){
                            for (i in 1 .. 4){
                                ImageComponent(img = R.drawable.ellipse,
                                    modifier = Modifier
                                        .clip(shape = RoundedCornerShape(10.dp))
                                        .width(30.dp)
                                        .height(30.dp))
                            }
                        }
                    }
                    Column (modifier = Modifier.weight(1f)){
                        TextComponent(text = stringResource(id = R.string.total_donation),
                            color = Color.Black ,
                            fontWeight = FontWeight.W400,
                            fontSize = 18.sp)
                        TextComponent(text = stringResource(id = R.string.total_money),
                            color = Color.Black,
                            fontWeight = FontWeight.W700,
                            fontSize = 18.sp)
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button (onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()
                        .align(Alignment.CenterHorizontally)) {
                    TextComponent(text = stringResource(id = R.string.button_donate),
                        color = Color.White,
                        fontWeight = FontWeight.W700,
                        fontSize = 18.sp)
                }
            }
        }
    }
}