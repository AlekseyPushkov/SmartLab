package com.pushkovav.medic

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class AntefactionActivityTest {

    @JvmField
    @Rule
    var activityScenarioRule = ActivityScenarioRule(AntefactionActivity::class.java)


    @Test
    fun nextScreen(){
        onView(withId(R.id.layout_AntefactionActivity))
            .check(matches(isDisplayed()))
        onView(withId(R.id.editText))
            .perform(typeText("ldfd@dlf.sdf"), closeSoftKeyboard())
        onView(withId(R.id.buttonNext))
            .perform(click())
        onView(withId(R.id.layout_ConfirmitionEmailActivity))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkVisibility(){
        onView(withId(R.id.layout_AntefactionActivity))
            .check(matches(isDisplayed()))
        onView(withId(R.id.hello))
            .check(matches(isDisplayed()))
        onView(withId(R.id.welcome))
            .check(matches(isDisplayed()))
        onView(withId(R.id.textView))
            .check(matches(isDisplayed()))
        onView(withId(R.id.label))
            .check(matches(isDisplayed()))
        onView(withId(R.id.editText))
            .check(matches(isDisplayed()))
        onView(withId(R.id.buttonNext))
            .check(matches(isDisplayed()))
        onView(withId(R.id.enterWhithHelp))
            .check(matches(isDisplayed()))
        onView(withId(R.id.button2))
            .check(matches(isDisplayed()))
    }

}