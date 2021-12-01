package com.example.epoxy.Character

import androidx.annotation.StringRes
import com.example.epoxy.R
import java.util.*

object CharacterDataFactory {
    private val random = Random()
    private val names = arrayListOf<String>("Ella", "Momo", "Haru", "Mia", "Remy", "Ei", "Aska", "Rey", "Nina")
    private val ages = arrayListOf<String>("19 y.o.", "25 y.o.", "17 y.o.", "20 y.o.", "21 y.o.")
    private val abilities = arrayListOf<String>("witch", "pyrokinesis", "hydrokinesis", "levitation", "power over light", "shadow management", "perfect swordsmanship")

    private fun randomName() : String {
        val name = random.nextInt(9)
        return names[name]
    }

    private fun randomAge(): String {
        val age = random.nextInt(5)
        return ages[age]
    }

    private fun randomAbilities() : String {
        val abilitie = random.nextInt(7)
        return abilities[abilitie]
    }

    private fun randomPicture() : Int {
        val grid = random.nextInt(7)
        return when(grid) {
            0->R.drawable.character1
            1->R.drawable.character2
            2->R.drawable.character3
            3->R.drawable.character4
            4->R.drawable.character5
            5->R.drawable.character6
            6->R.drawable.character7
            else->R.drawable.character8
        }
    }
    fun getCharacterItems(count:Int) : List<Character> {
        var characterItems = mutableListOf<Character>()
        repeat(count) {
            val image = randomPicture()
            val name = randomName()
            val age = randomAge()
            val abilities = randomAbilities()
            characterItems.add(Character(image, name, age, abilities))
        }
        return characterItems
    }
}