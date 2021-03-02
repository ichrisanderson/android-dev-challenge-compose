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
package com.example.androiddevchallenge.feature.dogs

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.core.data.DogRepository
import com.example.androiddevchallenge.core.data.model.Dog

@Composable
fun DogCard(
    index: Int,
    dog: Dog,
    modifier: Modifier = Modifier,
    onItemClick: (Int) -> Unit
) {
    val typography = MaterialTheme.typography
    Card(
        shape = RoundedCornerShape(8.dp, 8.dp, 0.dp, 0.dp),
        modifier = modifier
            .fillMaxWidth()
            .padding(
                start = if (index % 2 == 0) 16.dp else 8.dp,
                top = if (index < 2) 16.dp else 0.dp,
                end = if (index % 2 == 0) 8.dp else 16.dp,
                bottom = 16.dp
            )
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .clickable(onClick = { onItemClick(dog.id) })
        ) {
            Image(
                painter = painterResource(dog.avatarImage),
                modifier = modifier
                    .fillMaxWidth()
                    .aspectRatio(1.0f, true),
                contentDescription = null
            )
            Text(
                text = dog.name,
                style = typography.h5,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp, 4.dp, 16.dp, 8.dp)
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun PreviewDogCard() {
    DogCard(0, dog = DogRepository.allDogs[0], onItemClick = { })
}
