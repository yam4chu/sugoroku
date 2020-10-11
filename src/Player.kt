
class Player {
    var name: String = ""
    var num: Int = 0
        private set
    constructor(name: String)  {
        this.name = "Player" + name
    }
    private fun addNum(num: Int) {
        this.num+= num
    }
}