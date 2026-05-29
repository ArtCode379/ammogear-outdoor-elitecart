package ammogear.outdoor.elitecart

import android.app.Application
import ammogear.outdoor.elitecart.di.dataModule
import ammogear.outdoor.elitecart.di.dispatcherModule
import ammogear.outdoor.elitecart.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class YPPTApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@YPPTApplication)
            modules(appModules)
        }
    }
}