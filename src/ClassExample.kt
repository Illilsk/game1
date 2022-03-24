class Tabachka(
    var sigiCount: Int
) : BuildImpl() {

    private var snus: Int = 5

    var sigi: Int = 10

    private var electronko: Int = 20

    var isDirtyWindow = false

    var isDoorBroken = true

    fun sellSigi(count: Int) {
        sigi -= count
    }

    fun sellSnus() {
        snus--
    }

    fun sellElectro() {
        electronko--
    }

    override fun repairDoor() {
        if (isDoorBroken) {
            Unit
        } else {
            Unit
        }
    }

    override fun cleanWindows() {
        if (isDirtyWindow) {
            Unit
        } else {
            Unit
        }
    }
}

open class BuildImpl() : Build {
    override fun repairDoor() {
        println("opa")
    }

    override fun cleanWindows() {}

    fun opa() {}
}

interface Build {
    fun repairDoor()
    fun cleanWindows()
}
