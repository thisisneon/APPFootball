package com.example.appfootball.model.competitions

import com.google.gson.annotations.SerializedName

data class Competition(
    @SerializedName("area")
    val area: Area,
    @SerializedName("code")
    val code: String,
    @SerializedName("currentSeason")
    val currentSeason: CurrentSeason,
    @SerializedName("emblemUrl")
    val emblemUrl: Any,
    @SerializedName("id")
    val id: Int,
    @SerializedName("lastUpdated")
    val lastUpdated: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("numberOfAvailableSeasons")
    val numberOfAvailableSeasons: Int,
    @SerializedName("plan")
    val plan: String
)