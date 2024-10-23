package com.example.laihan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada Yth,",
           modifier = Modifier.padding(start = 16.dp) .padding(bottom = 20.dp) .padding(top = 20.dp) )
        Text(text = "Fauzi Taufik",
            modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isi = "Fauzi Taufik"
        )
        DetailSurat(
            judul = "Email",
            isi = "fauzi@gmail.com"
        )
        DetailSurat(
            judul = "No Telp",
            isi = "08123456789"
        )
        DetailSurat(
            judul = "Keterangan",
            isi = "Apa Aja"
        )
    }
}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier.fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Daerah Istimewa Yogyakarta",
                    color = Color.Blue
                    )
                Text(
                    text = "FAX : 021-121212, Tlp : 0821111",
                    color = Color.White
                )
            }
            Box (
                contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = " ",
                    modifier = Modifier.size(150.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null)
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isi: String
) {
    Column (
        modifier = Modifier.fillMaxWidth()
    ){

        Row (
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp)
                .padding(top = 20.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isi,
                modifier = Modifier.weight(2f))
        }
    }
}