package com.example.swoosh.controller

import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.R
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
        val searchLeaguesText = findViewById<TextView>(R.id.searchLeaguesText)
        searchLeaguesText.text = getString(
            R.string.looking_for_a_league_skill_league_near_you, player.league, player.skill
        )
    }
}