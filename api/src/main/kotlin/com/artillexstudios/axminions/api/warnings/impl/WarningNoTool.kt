package com.artillexstudios.axminions.api.warnings.impl

import com.artillexstudios.axminions.api.config.Messages
import com.artillexstudios.axminions.api.warnings.Warning
import com.artillexstudios.axminions.api.minions.Minion

class WarningNoTool : Warning("no_tool") {

    override fun getContent(minion: Minion): String {
        return Messages.NO_TOOL_WARNING()
    }
}
