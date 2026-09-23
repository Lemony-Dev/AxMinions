package com.artillexstudios.axminions.api.warnings.impl

import com.artillexstudios.axminions.api.config.Messages
import com.artillexstudios.axminions.api.warnings.Warning
import com.artillexstudios.axminions.api.minions.Minion

class WarningContainerFull : Warning("container_full") {

    override fun getContent(minion: Minion): String {
        return Messages.CONTAINER_FULL_WARNING()
    }
}
