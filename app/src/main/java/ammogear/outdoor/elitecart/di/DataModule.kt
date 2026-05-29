package ammogear.outdoor.elitecart.di

import ammogear.outdoor.elitecart.data.repository.CartRepository
import ammogear.outdoor.elitecart.data.repository.YPPTOnboardingRepo
import ammogear.outdoor.elitecart.data.repository.OrderRepository
import ammogear.outdoor.elitecart.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        YPPTOnboardingRepo(
            ypptOnboardingStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}