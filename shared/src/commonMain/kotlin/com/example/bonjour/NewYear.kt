package com.example.bonjour

import kotlinx.datetime.*

/**
 * Created by Jacee.
 * Date: 2023.03.10
 */

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1, 1, 1)
    return today.daysUntil(closestNewYear)
}