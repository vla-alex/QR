package com.example.qrscanner.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun QRScannerApp() {
    var scannedResult by remember { mutableStateOf<String?>(null) }

    if (scannedResult != null) {
        ResultScreen(
            result = scannedResult!!,
            onScanAgain = { scannedResult = null }
        )
    } else {
        ScannerScreen(
            onQRCodeScanned = { result ->
                scannedResult = result
            }
        )
    }
}
