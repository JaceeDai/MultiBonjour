package com.example.bonjour

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Jacee.
 * Date: 2023.03.10
 */

@Serializable
data class RocketLaunch (
    @SerialName("flight_number")
    val flightNumber: Int,
    @SerialName("name")
    val missionName: String,
    @SerialName("date_utc")
    val launchDateUTC: String,
    @SerialName("success")
    val launchSuccess: Boolean?,
)