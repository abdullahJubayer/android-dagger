package com.example.android.dagger.graf

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@Subcomponent
interface RegistrationComponent {
    @Subcomponent.Factory
    interface Factory{
        fun create():RegistrationComponent
    }
    fun inject(fragment: TermsAndConditionsFragment)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(activity: RegistrationActivity)
}