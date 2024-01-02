package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    private lateinit var league: String
    private lateinit var beginnerSkillBtn: ToggleButton
    private lateinit var ballerSkillBtn: ToggleButton
    private var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
        beginnerSkillBtn = findViewById(R.id.beginnerSkillBtn)
        ballerSkillBtn = findViewById(R.id.ballerSkillBtn)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        selectedSkill = "Beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        selectedSkill = "Baller"
    }

    fun skillFinishClicked(view: View) {
        if (beginnerSkillBtn.isChecked || ballerSkillBtn.isChecked) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}