package com.example.hw_lesson4

import android.app.Activity
import androidx.core.graphics.component1
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.Matchers.*

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import java.util.jar.Attributes

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    @Test fun checkTextSignatureIsDisplayed() {
        onView(withChild(withText("Your signature"))).perform(click())
        onView(withClassName(containsString("AppCompatEditText"))).perform(clearText())
        onView(withClassName(containsString("AppCompatEditText"))).perform(typeText("Hello World!!!"))
        onView(withId(android.R.id.button1)).perform(click())

        onView(withText("Hello World!!!")).check(matches(isDisplayed()))
    }

    @Test fun checkSwitchButton2IsDisplayed() {
        onView(withChild(withText("Sync email periodically"))).perform(click())
        onView(withText("Download incoming attachments")).check(matches(isEnabled()))
    }

    @Test fun checkSwitchButton1IsChecked() {
        //onView(withChild(withText("Sync email periodically"))).perform(click())
        //onView(withChild(withText("Sync email periodically"))).check(matches(isChecked()))
        onView(withChild(withText("Sync email periodically"))).perform(click())
        onView(withChild(withText("Sync email periodically"))).check(matches(isChecked()))
        //onView(withClassName(containsString("SwitchCompat"))).perform(click())
    }

    @Test fun checkDefaultActionButtonIsDisplayed() {
        onView(withChild(withText("Default reply action"))).perform(click())
        onView(withText("Reply to all")).perform(click())
        onView(withText("Reply to all")).check(matches(isDisplayed()))
    }

}