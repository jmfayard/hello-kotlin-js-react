import kotlinx.css.paddingLeft
import kotlinx.css.paddingRight
import kotlinx.css.px
import kotlinx.html.BUTTON
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.RDOMBuilder
import react.dom.button
import react.dom.div
import styled.css
import styled.styledSpan

fun <T : BUTTON> RDOMBuilder<T>.onClick(operation: () -> Unit) {
    attrs {
        onClickFunction = { e -> operation(); e.preventDefault() }
    }
}

val counter = functionalComponent<RProps> {
    var count by useState(0)

    div {
        styledSpan {
            +"Counter: $count"
            css {
                paddingLeft = 32.px
                paddingRight = 16.px
            }
        }
        button {
            onClick { count -= 1 }
            +"-"
        }
        button {
            onClick { count += 1 }
            +"+"
        }
        button {
            onClick { count = 0 }
            +"reset"
        }
    }

}
