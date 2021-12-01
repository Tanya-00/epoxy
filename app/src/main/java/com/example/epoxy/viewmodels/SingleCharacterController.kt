package com.example.epoxy.viewmodels

import com.airbnb.epoxy.EpoxyController
import com.example.epoxy.Character.Character
import com.example.epoxy.Character.CharacterDataFactory
import com.example.epoxy.Character.epoxy.SingleCharacterModel_

class SingleCharacterController : EpoxyController() {
    var characterItems : List<Character> = CharacterDataFactory.getCharacterItems(5)
    private var index = 0L

    init {
        characterItems = CharacterDataFactory.getCharacterItems(5)
    }

    override fun buildModels() = characterItems.forEach{
        SingleCharacterModel_(it)
            .id(index++)
            .addTo(this)
    }
}

