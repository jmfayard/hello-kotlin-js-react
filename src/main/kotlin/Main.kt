import kotlinx.browser.document
import kotlinx.css.Position
import kotlinx.css.position
import kotlinx.css.px
import kotlinx.css.top
import react.RBuilder
import react.dom.*
import react.dom.render
import styled.*
import kotlinx.css.*
import react.child

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

val unwatchedVideos = listOf(
    Video(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
    Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
    Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
)

val watchedVideos = listOf(
    Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
)

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }

}
