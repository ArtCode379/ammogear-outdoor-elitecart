package ammogear.outdoor.elitecart.di

import ammogear.outdoor.elitecart.ui.viewmodel.AppViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.CartViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.CheckoutViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.YPPTOnboardingVM
import ammogear.outdoor.elitecart.ui.viewmodel.OrderViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.ProductDetailsViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.ProductViewModel
import ammogear.outdoor.elitecart.ui.viewmodel.YPPTSplashVM
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        YPPTSplashVM(
            onboardingRepository = get()
        )
    }

    viewModel {
        YPPTOnboardingVM(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}