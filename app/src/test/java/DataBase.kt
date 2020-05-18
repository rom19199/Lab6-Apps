import android.content.Context
import android.icu.text.TimeZoneNames
import androidx.navigation.Navigator
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext
import java.util.jar.Attributes

@Database(entities = [nav_invitados::class],version =  1)
abstract class DataBase : RoomDatabase() {
    abstract fun invitados() :InvitadoDao

    companion object{
        @Volatile
        private var INSTANCE: DataBase? = null
        fun getDataBase (context: Context): DataBase? {
            val tempInstance = INSTANCE

            if(tempInstance != null){
                return  tempInstance
            }
            synchronized(lock= this){
                val instance = Room.databaseBuilder(context.applicationContext,DataBase::class.java,"app_database").build()
                INSTANCE = instance

                return  instance
            }

        }
    }
}