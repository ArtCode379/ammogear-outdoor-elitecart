package ammogear.outdoor.elitecart.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ammogear.outdoor.elitecart.data.dao.CartItemDao
import ammogear.outdoor.elitecart.data.dao.OrderDao
import ammogear.outdoor.elitecart.data.database.converter.Converters
import ammogear.outdoor.elitecart.data.entity.CartItemEntity
import ammogear.outdoor.elitecart.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class YPPTDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}