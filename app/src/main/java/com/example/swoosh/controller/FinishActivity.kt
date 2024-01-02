package com.example.swoosh.controller

import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        val skill = intent.getStringExtra(EXTRA_SKILL).toString()
        val searchLeaguesText = findViewById<TextView>(R.id.searchLeaguesText)
        searchLeaguesText.text =
            getString(R.string.looking_for_a_league_skill_league_near_you, league, skill)
    }
}