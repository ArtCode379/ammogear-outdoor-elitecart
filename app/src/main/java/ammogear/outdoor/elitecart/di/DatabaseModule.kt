package ammogear.outdoor.elitecart.di

import androidx.room.Room
import ammogear.outdoor.elitecart.data.database.YPPTDatabase
import org.koin.dsl.module

private const val DB_NAME = "yppt_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = YPPTDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<YPPTDatabase>().cartItemDao() }

    single { get<YPPTDatabase>().orderDao() }
}