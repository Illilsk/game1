private var Example: Int? = null

fun main(args: Array<String>) {
    val userName = "Madrigal"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false
    var auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green aura" else "None aura"
    println("(HP: $healthPoints)(Aura: $auraColor) -> $userName ${formatHealthStatus(healthPoints, isBlessed)}")
    formatHealthStatus(healthPoints = 5.5.toInt(), true)
    arguments()
    println(a)
    uniExample()
    println(a)
    first()
    pornHub()
    startWorkingWithTabachka()
}

fun pornHub() {
    val porn: Porn //Создание переменной с типом Porn
    porn = Porn() // Инициализация porn
    porn.sex(sperma = ((0..10).random()) >= 5)
}

fun startWorkingWithTabachka() {
    val tabachka = Tabachka(sigiCount = 2)
    println(tabachka.sigi)
    tabachka.sellSigi(2)
    println(tabachka.sigi)
    tabachka.cleanWindows()
}

var a = 5

private fun formatHealthStatus(healthPoints: Int = 100, isBlessed: Boolean): String = when (healthPoints) {
    100 -> " is in full condition!"
    in 90..99 -> " has a few scratches!"
    in 50..89 -> if (isBlessed) {
        " has some minor wounds but is healing quite quickly!"
    } else {
        " has some minor wounds."
    }
    in 15..49 -> " looks pretty hurt.."
    else -> " is in awful condition:("
}

private fun arguments(isConnect: Boolean = true) {
    var str = "DASDASD fsfsf fsfs"
    var a = str.split(" ")
    println(a)
}

//Единвенно выражение
private fun opa(a: Int, b: Int) = a + b

//Unit
private fun uniExample(): Unit {
    val newInt = 5
    var sum = 0
    Example?.let {
        sum = 5 + it
    } ?: { }
    if (Example != null) {
        sum = 5 + Example!!
    }
}

private fun first(e: Int) {}

private fun first() {}
