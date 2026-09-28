package com.artillexstudios.axminions.api.warnings.impl

import com.artillexstudios.axminions.api.config.Messages
import com.artillexstudios.axminions.api.minions.Minion
import com.artillexstudios.axminions.api.warnings.Warning

class WarningNoCharge : Warning("no_charge") {

    override fun getContent(minion: Minion): String {
        return Messages.NO_CHARGE_WARNING()
    }
}
