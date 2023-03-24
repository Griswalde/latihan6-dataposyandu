package id.ac.unpas.dataposyandu.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.dataposyandu.model.DataPosyandu

@Database(entities = [DataPosyandu::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun DataPosyanduDao(): DataPosyandu
}