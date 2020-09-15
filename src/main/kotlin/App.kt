import kotlinx.css.*
import react.*
import react.dom.h3
import react.dom.img
import react.dom.p
import styled.css
import styled.styledDiv

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        welcome("KotlinConf Explorer")
        videoList()
        child(counter)
        videoPlayer()
    }
}


fun RBuilder.videoList() {
    styledDiv {
        css {
            paddingLeft = 40.px
        }
        h3 {
            +"Videos to watch"
        }
        child(VideoList::class) {
            attrs.videos = unwatchedVideos
        }

        h3 {
            +"Videos watched"
        }
        child(VideoList::class) {
            attrs.videos = watchedVideos
        }
    }
}
fun RBuilder.videoPlayer() {
    styledDiv {
        css {
            position = Position.absolute
            top = 10.px
            right = 10.px

        }
        h3 {
            +"John Doe: Building and breaking things"
        }
        img {
            attrs {
                src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
            }
        }
    }

}