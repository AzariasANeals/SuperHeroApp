/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.azariashero1,
            descriptionRes = R.string.azariasherodescription1,
            imageRes = R.drawable.azarias_hero_1
        ),
        Hero(
            nameRes = R.string.azariashero2,
            descriptionRes = R.string.azariasherodescription2,
            imageRes = R.drawable.azarias_hero_2
        ),
        Hero(
            nameRes = R.string.azariashero3,
            descriptionRes = R.string.azariasherodescription3,
            imageRes = R.drawable.azarias_hero_3
        ),
        Hero(
            nameRes = R.string.azariashero4,
            descriptionRes = R.string.azariasherodescription4,
            imageRes = R.drawable.azarias_hero_4
        ),
        Hero(
            nameRes = R.string.azariashero5,
            descriptionRes = R.string.azariasherodescription5,
            imageRes = R.drawable.azarias_hero_5
        ),
        Hero(
            nameRes = R.string.azariashero6,
            descriptionRes = R.string.azariasherodescription6,
            imageRes = R.drawable.azarias_hero_6
        )
    )
}
