import java.lang.NumberFormatException

class SugorokuAnswer {

    var GOAL: Int = 0
    var count: Int = 0
    var turn: Int = 0
    fun main(args: Array<String>) {
        // ゴールフラグ
        var isEnd = 0
        // 終了フラグ
        var restart = true
        // Sugorokuインスタンス
        var sugo = SugorokuAnswer()
        // プレイヤー人数
        var playerCount = 0
        do {
            println("参加するプレイヤーの人数を入力してください:")
            try {
                playerCount = readLine()!!.toInt()
                println("ゴールのマスを入力してください")
                sugo.GOAL = readLine()!!.toInt()
            } catch (e: NumberFormatException) {
                println("正しく数字を入力してください")
                continue
            }


        } while (true)
        println(args)
        println(isEnd)
        println(restart)
    }
}
