
/**
 * すごろくに関する情報、処理を扱うクラス
 */
class SugorokuAnswer {
    // ゴールのマス目
    var goal: Int = 0
    // ターン数
    var turn: Int = 0
    // ゴールフラグ
    var isEnd = 0
    // 終了フラグ
    var restartFlg = true
    // プレイヤー人数
    var playerCount = 0

    /**
     * 設定された情報を基にすごろくを開始するメソッド
     */
    fun sugoroku() {
        // 人数分プレイヤー情報を作成する
        var playerList: ArrayList<Player> = arrayListOf()
        for (i in 0..playerCount-1) {
            playerList.add(Player(i.toString()))
        }


    }
}