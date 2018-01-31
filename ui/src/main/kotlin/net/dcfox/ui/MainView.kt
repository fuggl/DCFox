package net.dcfox.ui

import tornadofx.*

class MainView: View() {
    override val root = borderpane {
        //top( alarm bar )
        center {
            borderpane {
                //top( tool bar )
                //left( navigation area )
                //center( main display area )
                //bottom( status bar )
            }
        }
    }
}