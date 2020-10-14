import java.lang.NumberFormatException

fun main(args: Array<String>) {
    // Sugorokuインスタンス
    var sugo = SugorokuAnswer()
    do {
        println("参加するプレイヤーの人数を入力してください:")
        // すごろくに関する各種設定
        try {
            sugo.playerCount = readLine()!!.toInt()
            println("ゴールのマスを入力してください")
            sugo.goal = readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("正しく数字を入力してください")
            continue
        }
        // 設定された情報を基にすごろくを開始する
        sugo.sugoroku()


    } while (true)
}
