package com.example.myapplication.components.banner

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannerSlider() {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    val bannerImages = listOf(
        R.drawable.slider1, // Placeholder banner images, replace with your own
        R.drawable.banner2,
    )
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000) // Change the delay time (in milliseconds) to adjust the auto-scroll speed
            coroutineScope.launch {
                pagerState.animateScrollToPage((pagerState.currentPage + 1) % bannerImages.size)
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        HorizontalPager(
            state = pagerState,
            count = bannerImages.size,
        ) { page ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(2f),
            ) {
                Image(
                    painter = painterResource(id = bannerImages[page]),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

    }
}
