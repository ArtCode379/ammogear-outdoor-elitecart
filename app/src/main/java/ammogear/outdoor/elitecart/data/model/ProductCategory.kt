package ammogear.outdoor.elitecart.data.model

import androidx.annotation.StringRes
import ammogear.outdoor.elitecart.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    FISHING(R.string.category_fishing),
    CAMPING(R.string.category_camping),
    SPORTS(R.string.category_sports),
    CYCLING(R.string.category_cycling),
    MARINE(R.string.category_marine),
}
