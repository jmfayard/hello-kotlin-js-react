import kotlinx.css.Color
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.rem
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledH1

external interface WelcomeProps : RProps {
    var name: String
}

class Welcome : RComponent<WelcomeProps, RState>() {
    override fun RBuilder.render() {
        styledH1 {
            css {
                fontSize = 2.rem
                color = Color.darkGreen
            }
            +"Hello, ${props.name}"
        }
    }
}

fun RBuilder.welcome(name: String) = child(Welcome::class) {
    attrs.name = name
}

/**
private val welcome = functionalComponent<WelcomeProps> { props ->
h1 {
+"Hello ${props.name}"
}
}
 ***/