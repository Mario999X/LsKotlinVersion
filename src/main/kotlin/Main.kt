import java.io.File

fun main() {
    // Mostramos por consola un mensaje, y creamos una variable que leera lo escrito en consola
    print("Introduzca un Path: ")
    val path = readln()
    // Con la clase File de java, y usando el path recogido, listaremos todos los archivos usando un forEach
    // con it nos referimos a los archivos/carpetas individuales de manera predeterminada en Kotlin (creo)
    File(path).listFiles()?.forEach {
        // Generamos las variables que ubicaremos en el print para no petarlo a cosas
        val archivesSpace = " | Tamanio en byte: " + it.length()
        val archivesRead: String
        val archivesWrite: String

        val archivesReadBol = it.canRead()
        val archivesWriteBol = it.canWrite()

        archivesRead = if (archivesReadBol) {
            " | Permite lectura"
        } else {
            " | No permite lectura"
        }

        archivesWrite = if (archivesWriteBol) {
            " | Permite escritura"
        } else {
            " | No permite escritura"
        }
        // Print que muestra la informacion
        println(it.name + archivesSpace + archivesRead + archivesWrite)
    }

}