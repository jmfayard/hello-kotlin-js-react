import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.a
import react.dom.h3
import styled.css
import styled.styledButton
import styled.styledDiv


fun RBuilder.videoPlayer(handler: VideoPlayerProps.() -> Unit): ReactElement {
    return child(VideoPlayer::class) {
        this.attrs(handler)
    }
}

external interface VideoPlayerProps : RProps {
    var video: Video
    var onWatchedButtonPressed: (Video) -> Unit
    var unwatchedVideo: Boolean

}

class VideoPlayer : RComponent<VideoPlayerProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                +"${props.video.speaker}: ${props.video.title}"
            }
            styledButton {
                css {
                    display = Display.block
                    backgroundColor = when {
                        props.unwatchedVideo -> Color.lightGreen
                        else -> Color.red
                    }
                }
                attrs {
                    onClickFunction = {
                        props.onWatchedButtonPressed.invoke(props.video)
                    }
                }
                if (props.unwatchedVideo) {
                    +"Mark as watched"
                } else {
                    +"Mark as unwatched"
                }
            }
            a(href = props.video.videoUrl) {
                +props.video.videoUrl
            }
            reactPlayer {
                attrs.url = props.video.videoUrl
            }
            styledDiv {
                css {
                    display = Display.flex
                    marginBottom = 10.px
                    marginTop = 16.px
                }
                emailShareButton {
                    attrs.url = props.video.videoUrl
                    emailIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
                telegramShareButton {
                    attrs.url = props.video.videoUrl
                    telegramIcon {
                        attrs.size = 32
                        attrs.round = true
                    }
                }
            }
        }
    }
}

