/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.feature.dog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.core.data.DogRepository
import com.example.androiddevchallenge.core.data.model.Dog
import com.example.androiddevchallenge.core.data.model.Sex
import com.example.androiddevchallenge.core.data.model.Size
import com.example.androiddevchallenge.core.ui.utils.scrim
import dev.chrisbanes.accompanist.insets.navigationBarsHeight
import dev.chrisbanes.accompanist.insets.statusBarsPadding

@Composable
fun DogDetails(
    dogId: Int,
    upPress: () -> Unit
) {
    val dog = remember(dogId) { DogRepository.allDogs.first { it.id == dogId } }
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn {
            item { Header(dog, upPress) }
            item { Body(dog) }
        }
    }
}

@Composable
private fun Header(
    dog: Dog,
    upPress: () -> Unit
) {
    Box {
        Image(
            painter = painterResource(dog.detailImage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .scrim(colors = listOf(Color(0x80000000), Color(0x33000000))),
            contentScale = ContentScale.FillWidth
        )
        TopAppBar(
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            contentColor = Color.White, // always white as image has dark scrim
            modifier = Modifier.statusBarsPadding()
        ) {
            IconButton(onClick = upPress) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = "back"
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
        OutlinedAvatar(
            dog = dog,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.BottomCenter)
                .offset(y = 32.dp) // overlap bottom of image
        )
    }
}

@Composable
private fun Body(dog: Dog) {
    Text(
        text = dog.name,
        style = MaterialTheme.typography.h4,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 36.dp, end = 16.dp)
    )
    Divider(modifier = Modifier.padding(16.dp))
    Row(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Chip(text = mapSize(dog.size))
        Spacer(modifier = Modifier.padding(8.dp))
        Chip(text = mapSex(dog.sex))
        Spacer(modifier = Modifier.padding(8.dp))
        Chip(text = dog.age)
    }
    Row(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
        Chip(text = mapCanLiveWithChildren(dog.canLiveWithChildren))
    }
    Row(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
        Chip(text = mapCanLiveWithCats(dog.canLiveWithCats))
    }
    Row(modifier = Modifier.padding(start = 16.dp, top = 8.dp, end = 16.dp)) {
        Chip(text = mapCanLiveWithDogs(dog.canLiveWithDogs))
    }
    Divider(modifier = Modifier.padding(16.dp))
    Text(
        text = dog.description,
        style = MaterialTheme.typography.body1,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    )
    Spacer(modifier = Modifier.navigationBarsHeight(additional = 16.dp))
}

fun mapCanLiveWithChildren(canLiveWithChildren: Boolean) =
    if (canLiveWithChildren)
        "I can live with teenagers"
    else
        "I prefer to live with adults only"

fun mapCanLiveWithCats(canLiveWithCats: Boolean) =
    if (canLiveWithCats)
        "I may be able to live with cats"
    else
        "I can't live with cats"

fun mapCanLiveWithDogs(canLiveWithDogs: Boolean) =
    if (canLiveWithDogs)
        "I may be able to live with other dogs"
    else
        "I can't live with other dogs"

private fun mapSize(size: Size) =
    when (size) {
        Size.Small -> "Small"
        Size.Medium -> "Medium"
        Size.Large -> "Large"
    }

private fun mapSex(sex: Sex) =
    when (sex) {
        Sex.Male -> "Male"
        Sex.Female -> "Female"
    }

@Composable
fun OutlinedAvatar(
    dog: Dog,
    modifier: Modifier = Modifier,
    outlineSize: Dp = 3.dp,
    outlineColor: Color = MaterialTheme.colors.surface
) {
    Box(
        modifier = modifier.background(
            color = outlineColor,
            shape = CircleShape
        )
    ) {
        Image(
            painter = painterResource(dog.avatarImage),
            contentDescription = null,
            modifier = Modifier
                .padding(outlineSize)
                .fillMaxSize()
                .clip(CircleShape)
        )
    }
}

@Composable
private fun Chip(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colors.primaryVariant
        ),
        modifier = modifier
    ) {
        Row(modifier = Modifier) {
            Text(
                text = text,
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier.padding(start = 16.dp, top = 10.dp, end = 16.dp, bottom = 10.dp)
            )
        }
    }
}
