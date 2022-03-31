package com.example.hw_lesson4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import androidx.test.espresso.remote.NoRemoteEspressoInstanceException

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(saveInstanceState : Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.settings_activity)
        if (saveInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingsFragment())
                .commit()
        }
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }



}