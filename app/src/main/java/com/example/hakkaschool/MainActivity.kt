package com.example.hakkaschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
=======
import androidx.compose.ui.tooling.preview.Preview
>>>>>>> 4568139b64e591b2905ec60c81375ca2f34aa1a5
import com.example.hakkaschool.ui.theme.HakkaSchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HakkaSchoolTheme {
<<<<<<< HEAD
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray     // 背景顏色先設定為淺灰色（想換顏色可以直接更改）
                ) {
                    //建立頁面跳轉功能的程式碼
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "home") {
                        // 頁面：首頁(home)
                        composable("home") {
                            Home(navController)
                        }
                        // 頁面：學習區(learning)
                        composable("learning") {
                            LearningArea(navController)
                        }
                        // 頁面：測驗區(quiz)
                        composable("quiz") {
                            QuizArea(navController)
                        }
                    }
                }
            //這邊註解掉的程式碼是一開始建立空專案時就有的程式碼，先暫時保留，如果覺得這部分不需要也可以直接砍掉
            /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting("Android")
                }*/
=======
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
>>>>>>> 4568139b64e591b2905ec60c81375ca2f34aa1a5
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HakkaSchoolTheme {
        Greeting("Android")
    }
}