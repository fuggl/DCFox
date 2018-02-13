package net.dcfox.ui

import javafx.scene.Parent
import tornadofx.*

class Navigation: View() {
    override val root = vbox {
        add(PlantStructure())
        tabpane {
            tab(ControllerStructure())
            tab(StationStructure())
        }
    }
}

class PlantStructure: View() {
    override val root = treeview<String> {

    }
}

class ControllerStructure: View() {
    override val root: Parent
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}

class StationStructure: View() {
    override val root: Parent
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}