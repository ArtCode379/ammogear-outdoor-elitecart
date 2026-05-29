package ammogear.outdoor.elitecart.data.repository

import ammogear.outdoor.elitecart.data.model.Product
import ammogear.outdoor.elitecart.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products: List<Product> = listOf(
        Product(
            id = 1,
            title = "Carbon Fiber Fishing Rod",
            description = "Professional-grade carbon fiber rod for freshwater and saltwater fishing. Lightweight, strong, and sensitive for accurate casting. Length: 2.4m, Action: Fast.",
            category = ProductCategory.FISHING,
            price = 129.99,
            imageUrl = "https://images.unsplash.com/photo-1544551763-46a013bb70d5?w=600&q=80"
        ),
        Product(
            id = 2,
            title = "Advanced Tackle Box Set",
            description = "Complete tackle box set with 450 pieces including hooks, lures, sinkers, swivels, and floats. Waterproof compartments with rust-resistant hardware.",
            category = ProductCategory.FISHING,
            price = 49.99,
            imageUrl = "https://images.unsplash.com/photo-1588778378753-4ebc4e9f1ef3?w=600&q=80"
        ),
        Product(
            id = 3,
            title = "4-Person Camping Tent",
            description = "Spacious 4-person dome tent with double-wall construction for all-season protection. Easy 5-minute setup, UV-resistant fabric, and 2000mm waterproof rating.",
            category = ProductCategory.CAMPING,
            price = 189.99,
            imageUrl = "https://images.unsplash.com/photo-1504280390367-361c6d9f38f4?w=600&q=80"
        ),
        Product(
            id = 4,
            title = "Sleeping Bag -20C Ultra-Warm",
            description = "Three-season sleeping bag rated to -20°C. Filled with high-loft hollow fiber insulation, heat-seal zip baffle, and compression sack included.",
            category = ProductCategory.CAMPING,
            price = 89.99,
            imageUrl = "https://images.unsplash.com/photo-1557008075-7f2c5efa4cfd?w=600&q=80"
        ),
        Product(
            id = 5,
            title = "Camping Cookware Kit",
            description = "10-piece aluminum cookware set including pots, pans, plates, and utensils. Non-stick coating, foldable handles, and mesh carry bag. Suitable for camp stoves and open fire.",
            category = ProductCategory.CAMPING,
            price = 64.99,
            imageUrl = "https://images.unsplash.com/photo-1461769778694-39b5d4b8c3d7?w=600&q=80"
        ),
        Product(
            id = 6,
            title = "Tactical Backpack 45L",
            description = "Military-grade 45L rucksack with MOLLE webbing, hydration bladder compartment, and padded laptop sleeve. Water-resistant 600D polyester construction.",
            category = ProductCategory.CAMPING,
            price = 119.99,
            imageUrl = "https://images.unsplash.com/photo-1553062407-98eeb64c6a62?w=600&q=80"
        ),
        Product(
            id = 7,
            title = "Mountain Bike 29\" Elite",
            description = "Full-suspension mountain bike with 29-inch wheels, 21-speed Shimano drivetrain, hydraulic disc brakes, and lightweight alloy frame. Ideal for trail and cross-country riding.",
            category = ProductCategory.CYCLING,
            price = 749.99,
            imageUrl = "https://images.unsplash.com/photo-1571068316344-75bc76f77890?w=600&q=80"
        ),
        Product(
            id = 8,
            title = "Pro Cycling Helmet",
            description = "CPSC-certified road and trail helmet with 20 aerodynamic vents, adjustable retention system, and removable visor. Weighs only 280g.",
            category = ProductCategory.CYCLING,
            price = 79.99,
            imageUrl = "https://images.unsplash.com/photo-1591324600849-4f64d5568d95?w=600&q=80"
        ),
        Product(
            id = 9,
            title = "Inflatable Kayak 2-Person",
            description = "Durable PVC inflatable kayak for two paddlers. Includes two adjustable paddles, hand pump, repair kit, and carry bag. Max load: 180kg. Suitable for calm rivers and lakes.",
            category = ProductCategory.MARINE,
            price = 399.99,
            imageUrl = "https://images.unsplash.com/photo-1527004013197-933b6b1f4c2b?w=600&q=80"
        ),
        Product(
            id = 10,
            title = "Adult Safety Life Jacket",
            description = "CE-approved 50N buoyancy aid for adults 40-90kg. Foam-filled panels, chest zipper, crotch strap, and whistle attachment point. Ideal for kayaking and sailing.",
            category = ProductCategory.MARINE,
            price = 59.99,
            imageUrl = "https://images.unsplash.com/photo-1544715695-2c5dff3b3890?w=600&q=80"
        ),
        Product(
            id = 11,
            title = "Archery Compound Bow Set",
            description = "Complete compound bow package for beginners and intermediates. Draw weight 30-60lbs, brace height 7 inches, includes 6 arrows, sight, quiver, and arm guard.",
            category = ProductCategory.SPORTS,
            price = 249.99,
            imageUrl = "https://images.unsplash.com/photo-1471107340929-a87cd0f5b5f3?w=600&q=80"
        ),
        Product(
            id = 12,
            title = "Steel Crossbow 180lbs Elite",
            description = "High-performance 180lb draw crossbow with 370fps velocity. Includes 4x32 scope, 6 bolts, quiver, and rope cocking aid. Precision aluminum barrel with safety trigger.",
            category = ProductCategory.SPORTS,
            price = 329.99,
            imageUrl = "https://images.unsplash.com/photo-1519310753780-1a45d84abc60?w=600&q=80"
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }

    suspend fun getAll(): List<Product> {
        return products
    }
}
