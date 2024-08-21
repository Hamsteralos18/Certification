package com.example.certification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certification.ui.theme.CertificationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificationTheme {

            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre: String, modifier: Modifier=Modifier) {



    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
    ) {

        Row (
            modifier = modifier
                .padding(10.dp)
                .fillMaxWidth(),
        ){
            //Adentro de Row
            Image(

                painter = painterResource(id = R.drawable.hombreara_a),
                contentDescription = "",
                Modifier.size(50.dp, 50.dp),
            )

            Text(
                text = "SpiderCompany®",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )

            Image(
                painter = painterResource(id = R.drawable.ara_a),
                contentDescription = "",
                Modifier.size(50.dp, 50.dp),

                )



        }


        Text(
            text = "$nombre",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()

        )

    }
}




//Vista
@Composable
@Preview(showBackground = true)

fun CertificatingCourse(){

    CertificatingCourse(nombre = "Alejandro Eduardo Ocaranza Acosta")

}