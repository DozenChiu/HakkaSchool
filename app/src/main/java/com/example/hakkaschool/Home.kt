package com.example.hakkaschool

// Home.kt
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        //color = MaterialTheme.colorScheme.background
        color = Color.LightGray // 背景顏色先設定為浅灰色，(想換顏色可以直接更改)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 頁面標題文字
            Text(
                text = "這是首頁",
                fontSize = 24.sp,
                modifier = Modifier.padding(vertical = 64.dp)   // 上下內邊距為 64dp
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp)    // 水平內邊距為 16dp
            ) {
                // 前往學習區按鈕
                Button(
                    onClick = { navController.navigate("learning")  },
                    modifier = Modifier
                        .height(250.dp)     // 設置按鈕高度為 250dp
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "前往學習區",
                        fontSize = 32.sp
                    )
                }

                Spacer(modifier = Modifier.height(32.dp)) // 上下兩按鈕間距為 32dp

                // 前往測驗區按鈕
                Button(
                    onClick = { navController.navigate("quiz") },
                    modifier = Modifier
                        .height(250.dp)     // 設置按鈕高度為 250dp
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "前往測驗區",
                        fontSize = 32.sp    // 設置文字大小為 32sp
                    )
                }
            }
        }
    }
}