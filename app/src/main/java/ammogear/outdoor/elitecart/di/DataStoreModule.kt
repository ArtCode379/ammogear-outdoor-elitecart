package ammogear.outdoor.elitecart.di

import ammogear.outdoor.elitecart.data.datastore.YPPTOnboardingPrefs
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { YPPTOnboardingPrefs(androidContext()) }
}