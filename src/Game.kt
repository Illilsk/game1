import kotlin.math.pow

fun main(args: Array<String>) {
    val userName = "Madrigal"
    var healthPoints = 10
    val isBlessed = true
    val isImmortal = false
    var auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green aura" else "None aura"
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    val userKarma = checkKarma(healthPoints)
    println("(Aura: $auraColor)" + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$userName $healthStatus")
    println("$userName $userKarma")
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String = when (healthPoints) {
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

private fun checkKarma(healthPoints: Int): String {
    return when ((Math.random().pow((110 - healthPoints) / 100.0) * 20).toInt()) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "nothing"
    }
}