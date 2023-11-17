package com.julianc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.julianc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Welcome to QuickNews!",
        description = "Let's explore the basics together and make sure you're all set to catch up on the latest.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Your News, Your Picks",
        description = "Let's make QuickNews your go-to source for news that fits your interests.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Connect with QuickNews Readers",
        description = "Let's connect! Discover how to engage with other QuickNews readers.",
        image = R.drawable.onboarding3
    ),
)