package com.akashvk.timestampcamera

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CameraScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Camera Screen - Stage 5 will implement preview")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("gallery") }) {
            Text("Go to Gallery")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate("settings") }) {
            Text("Go to Settings")
        }
    }
}
