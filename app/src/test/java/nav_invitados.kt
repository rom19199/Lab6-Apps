
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Invitados")




class nav_invitados(
    val invitado: Int,
    val nombre: String,
    val telefono: Int,
    val correo: String,
    val Rol: String,
    @PrimaryKey(autoGenerate = true)
    val uid: Int =0
    ):Serializable