package com.example.jabarcitylist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class JabarCityList(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )