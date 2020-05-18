import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.room.*


@Dao
interface InvitadoDao {
    @Query(value = "SELECT * FROM Invitados")
    fun getAll():LiveData<List<nav_invitados>>

    @Insert
    fun insertAll(vararg invitado: nav_invitados)

    @Update
    fun update(invitado: nav_invitados)

    @Delete
    fun delete(invitado: nav_invitados)
}