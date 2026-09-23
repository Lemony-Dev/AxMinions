package com.artillexstudios.axminions.api.warnings.impl

import com.artillexstudios.axminions.api.config.Messages
import com.artillexstudios.axminions.api.warnings.Warning
import com.artillexstudios.axminions.api.minions.Minion
class WarningNoWaterNearby : Warning("no_water_nearby") {

    override fun getContent(minion: Minion): String {
        return Messages.NO_WATER_NEARBY_WARNING()
    }
}
