class Porn() {

    val men = "Pedro"
    val women = "Larisa"

    fun sex(sperma: Boolean) {
        if (sperma)
            doChild()
        else
            tryLater()
    }

    fun doChild() {
        val childName = men.substring(startIndex = 0, endIndex = 3) + women.substring(startIndex = 2, endIndex = 6)
        println("$men and $women created $childName")
    }
    fun tryLater() =
        println("$men and $women was confuse")

}
