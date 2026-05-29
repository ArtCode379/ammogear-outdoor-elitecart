package ammogear.outdoor.elitecart.data.repository

import ammogear.outdoor.elitecart.data.datastore.YPPTOnboardingPrefs
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext

class YPPTOnboardingRepo(
    private val ypptOnboardingStoreManager: YPPTOnboardingPrefs,
    private val coroutineDispatcher: CoroutineDispatcher,
) {

    fun observeOnboardingState(): Flow<Boolean?> {
        return ypptOnboardingStoreManager.onboardedStateFlow
    }

    suspend fun setOnboardingState(state: Boolean) {
        withContext(coroutineDispatcher) {
            ypptOnboardingStoreManager.setOnboardedState(state)
        }
    }
}