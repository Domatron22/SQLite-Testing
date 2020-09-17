/* Author: Dominic Triano
 * Date: 4/15/2019
 * Language: Kotlin
 * Project: Domatron
 * Description:
 *
 *
 */

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

/**
 *
 * @author sqlitetutorial.net
 */
object SQLiteJDBCDriverConnection {
    /**
     * Connect to a sample database
     */
    fun connect() {
        var conn: Connection? = null
        try {
            // db parameters
            val url = "https://web.cs.sunyit.edu/~trianod/Player.db"
            // create a connection to the database
            conn = DriverManager.getConnection(url)

            println("Connection to SQLite has been established.")

        } catch (e: SQLException) {
            println(e.message)
        } finally {
            try {
                conn?.close()
            } catch (ex: SQLException) {
                println(ex.message)
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        connect()
    }
}