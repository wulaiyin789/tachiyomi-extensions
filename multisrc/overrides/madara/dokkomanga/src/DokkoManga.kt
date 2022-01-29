package eu.kanade.tachiyomi.extension.es.dokkomanga

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class DokkoManga : Madara("DokkoManga", "https://dokkomanga.xyz", "es", SimpleDateFormat("MMMMM dd, yyyy", Locale("es")))
