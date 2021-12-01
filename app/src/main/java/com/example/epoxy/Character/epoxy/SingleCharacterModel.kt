package com.example.epoxy.Character.epoxy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.epoxy.R
import com.example.epoxy.Character.epoxy.KotlinHolder
import com.example.epoxy.Character.Character

@EpoxyModelClass(layout = R.layout.singlecharacter)
abstract class SingleCharacterModel(@EpoxyAttribute var character: Character) : EpoxyModelWithHolder<SingleCharacterModel.CharacterHolder>() {
    override fun bind(holder: CharacterHolder) {
        holder.imageView?.setImageResource(character.image)
        holder.nameView?.text = character.name
        holder.ageView?.text = character.age
        holder.abilitiesView?.text = character.abilities
    }

    inner class CharacterHolder : KotlinHolder() {
        val imageView by bind <ImageView>(R.id.image)
        val nameView by bind <TextView>(R.id.name)
        val ageView by bind <TextView>(R.id.age)
        val abilitiesView by bind <TextView>(R.id.abilities)
    }
}