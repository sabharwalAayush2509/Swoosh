package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE

class LeagueActivity : BaseActivity() {

    private lateinit var mensLeagueBtn: ToggleButton
    private lateinit var womensLeagueBtn: ToggleButton
    private lateinit var coedLeagueBtn: ToggleButton
    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        mensLeagueBtn = findViewById(R.id.mensLeagueBtn)
        womensLeagueBtn = findViewById(R.id.womensLeagueBtn)
        coedLeagueBtn = findViewById(R.id.coedLeagueBtn)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "Men's"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "Women's"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        selectedLeague = "Co-Ed"
    }

    fun leagueNextClicked(view: View) {
        if (mensLeagueBtn.isChecked || womensLeagueBtn.isChecked || coedLeagueBtn.isChecked) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}