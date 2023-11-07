package com.mc7.myjetcoffeeapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mc7.myjetcoffeeapp.R
import com.mc7.myjetcoffeeapp.data.model.CategoryEntity
import com.mc7.myjetcoffeeapp.ui.theme.MyJetCoffeeAppTheme

@Composable
fun CategoryItem(
    category: CategoryEntity,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(category.imageCategory),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(category.textCategory),
            fontSize = 10.sp,
            modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 8.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CategoryItemPreview() {
    MyJetCoffeeAppTheme {
        CategoryItem(
            category = CategoryEntity(
                R.drawable.icon_category_cappuccino,
                R.string.category_cappuccino,
            ),
            modifier = Modifier.padding(horizontal = 8.dp)
        )
    }
}