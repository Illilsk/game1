fun main(args: Array<String>) {
    val userName = "Madrigal"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false
    var auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "Green aura" else "None aura"
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    println("(Aura: $auraColor)" + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$userName $healthStatus")
    println("xyi")
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
