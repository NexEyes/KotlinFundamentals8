 package com.example.kotlinfundamentals8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

 fun main() {
     val winningBid = Bid(5000, "Private Collector")

     println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
     println("Item B is sold at ${auctionPrice(null, 3000)}.")
 }

 class Bid(val amount: Int, val bidder: String)

 fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
     return bid?.amount ?: minimumPrice
 }