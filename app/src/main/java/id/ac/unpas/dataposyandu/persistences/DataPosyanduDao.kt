package id.ac.unpas.dataposyandu.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.dataposyandu.model.DataPosyandu

@Dao
interface DataPosyanduDao {
    @Query("SELECT * FROM DataPosyandu")
    fun loadAll(): LiveData<List<DataPosyandu>>
    @Query("SELECT * FROM DataPosyandu WHERE id = :id")
    fun find(id: String): DataPosyandu?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: DataPosyandu)
    @Delete
    fun delete(item: DataPosyandu)
}