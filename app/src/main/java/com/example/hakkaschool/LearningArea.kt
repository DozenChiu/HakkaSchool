package com.example.hakkaschool

// LearningArea.kt
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LearningArea(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        //color = MaterialTheme.colorScheme.background
        color = Color.LightGray // 背景顏色先設定為浅灰色，(想換顏色可以直接更改)
    ) {
        //顯示學習區頁面
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "這是學習區",
                fontSize = 24.sp,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            // 返回首頁按鈕區塊(也就是左上角返回按鈕的圖示)
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp) // 調整左上方距離
                    .clickable { navController.navigate("home") }, // 點擊事件，點擊後回到首頁的頁面
                ) {
                Icon(
                    Icons.Default.ArrowBack, // 這是顯示返回箭頭的圖示
                    contentDescription = "Back Button", // 圖示描述
                    modifier = Modifier.size(32.dp) // 圖示尺寸(大小)
                )
                Text(
                    "回首頁",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 0.dp) // 文字和圖示之間的間距
                )
            }

            Spacer(modifier = Modifier.height(64.dp)) // 添加垂直間距

            // 前往詞彙表按鈕
            Button(
                onClick = {  },//如果有新寫好的kt檔，請在括弧裡則輸入此程式碼"navController.navigate("你取的檔名")"
                modifier = Modifier
                    .height(250.dp)     // 設置按鈕高度為 250dp
                    .fillMaxWidth()     // 按鈕寬度填滿
                    .padding(horizontal = 16.dp)    // 在按鈕的左右添加 16dp 的空隙
            ) {
                Text(
                    text = "前往詞彙表",
                    fontSize = 32.sp
                )
            }

            Spacer(modifier = Modifier.height(32.dp)) // 添加垂直間距

            // 前往題庫區的按鈕
            Button(
                onClick = {  },//如果有新寫好的kt檔，請在括弧裡則輸入此程式碼"navController.navigate("你取的檔名")"
                modifier = Modifier
                    .height(250.dp)     // 設置按鈕高度為 250dp
                    .fillMaxWidth()     // 按鈕寬度填滿
                    .padding(horizontal = 16.dp)  // 在按鈕的左右添加 16dp 的空隙
            ) {
                Text(
                    text = "前往題庫",
                    fontSize = 32.sp
                )
            }
        }
    }
}